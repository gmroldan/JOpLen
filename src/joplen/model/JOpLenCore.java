/* 
 *  Copyright (C) 2012  Gerardo Martín Roldán
 *  GNU General Pulbic License
 */
package joplen.model;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import joplen.exceptions.JOpLenException;
import joplen.utils.FileManager;
import joplen.utils.NameFactory;

public class JOpLenCore {
    private static final JOpLenCore INSTANCE = new JOpLenCore();
    
    private final String EMPTY_WORD = "λ";
    private final String EMPTY_LANGUAGE = "Φ";
    
    private Alphabet alphabet;
    private Map<String, Language> languagesMap;
    
    /**
     * Class constructor.
     */
    private JOpLenCore() {
        this.languagesMap = new HashMap<String, Language>();
    }
    
    public static JOpLenCore getInstance() {
        return INSTANCE;
    }
    
    /**
     * Creates a new Alphabet.
     * 
     * @param symbols Symbols of the Alphabet.
     * @throws JOpLenException If something goes wrong.
     */
    public void newAlphabet(String[] symbols) throws JOpLenException {
        this.alphabet = new Alphabet();
        this.alphabet.addSymbols(symbols);
    }
    
    /**
     * Creates a new Language and adds it into the Collection.
     * 
     * @param words Words of the language that will be created.
     * @throws JOpLenException If something goes wrong.
     */
    public void newLanguage(String[] words) throws JOpLenException {
        Language language = new Language();
        
        for (String word: words) {
            if (belongsToAlphabet(word)) {
                language.addWord(word);
            } else {
                throw new JOpLenException("Los símbolos de la palabra '" + word + "' no pertenecen al alfabeto");
            }
        }
        
        language.setName(NameFactory.getInstance().getLanguageName());
        addLanguage(language);
    }
    
    /**
     * Finds a language by his name.
     * 
     * @param languageName Name of the language to be retrieved.
     * @return Returns an instance of class Language.
     */
    public Language findLanguage(final String languageName) {        
        return languagesMap.get(languageName);
    }
    
    private boolean belongsToAlphabet(final String word) {
        for (int i = 0; i < word.length(); i++) {
            if (!alphabet.belongs(word.charAt(i))) {
                return false;
            }
        }
        return true;
    }
    
    public Language union(final Language language1, final Language language2) {
        Language result = new Language();
        cloneLanguage(language1, result);
        
        for (String word: language2.getWordList()) {
            if (!result.belongs(word)) {
                result.addWord(word);
            }
        }
        
        if (result.getWordList().isEmpty()) {
            result.addWord(EMPTY_LANGUAGE);
        }
        
        return result;
    }
    
    public Language intersection(final Language language1, final Language language2) {
        Language result = new Language();
        
        for (String word: language1.getWordList()) {
            if (language2.belongs(word)) {
                if(!result.belongs(word)) {
                    result.addWord(word);
                }
            }
        }
        
        if (result.getWordList().isEmpty()) {
            result.addWord(EMPTY_LANGUAGE);
        }     
        
        return result;
    }
    
    public Language difference(final Language language1, final Language language2) {
        Language result = new Language();
        
        for (String word: language1.getWordList()) {
            if (!language2.belongs(word)) {
                if(!result.belongs(word)) {
                    result.addWord(word);
                }
            }
        }
        
        if (result.getWordList().isEmpty()) {
            result.addWord(EMPTY_LANGUAGE);
        }  
        
        return result;
    }
    
    public String complement(final Language language) {
       String result = language.getWordList().toString();
       return "Todas las secuencias de " + result + ", excepto " + result;
    }
    
    public Language product(final Language language1, final Language language2) {
       Language result = new Language();       
       String word = null;
       
       for (String word1: language1.getWordList()) {
           for (String word2: language2.getWordList()) {
               word = word1.concat(word2);
               if (!result.belongs(word)) {
                   result.addWord(word);
               }
           }
       }
       
       return result;
    }
    
    public Language potenciacion(final Language language, final int exponent) {
        Language result = new Language();
        
        if (exponent == 0) {
            result.addWord(EMPTY_WORD);
        } else if (exponent == 1) {
            cloneLanguage(language, result);
        } else if (exponent > 1) {
            Language aux = new Language();            
            String word = null;
            
            cloneLanguage(language, aux);
            
            for (int i = 1; i < exponent; i++) {
                for (String word1: aux.getWordList()) {                    
                    for (String word2: language.getWordList()) {
                        word = word1.concat(word2);                                 
                        if(!result.belongs(word)) {
                            result.addWord(word);
                        }
                    }                        
                }
                cloneLanguage(result, aux);
            }
        }
        
        return result;
    }
    
    public Language kleeneStar(final Language language, final int exponent) {
        return star(true, language, exponent);
    }
    
    public Language positiveStar(final Language language, final int exponent) {
        return star(false, language, exponent);
    }
    
    private Language star(final boolean isKleeneStar, final Language language, final int exponent) {
        Language result = new Language();        
        Language aux = new Language();
        
        if (isKleeneStar) {
            result.addWord(EMPTY_WORD);
        }
        
        for (int i = 1; i <= exponent; i++) {
            for (String word: union(result, potenciacion(language, i)).getWordList()) {
                aux.addWord(word);                
            }
            result.getWordList().clear();
            cloneLanguage(aux, result);
            aux.getWordList().clear();
        }
        
        return result;
    }
    
    public Language reverse(final Language language) {
        Language result = new Language();
        String word = "";
        
        for (String wordAux: language.getWordList()) {
            for (int i = wordAux.length()-1; i >= 0; i--) {
                word = word.concat(String.valueOf(wordAux.charAt(i)));                            
            }
            result.addWord(word);
            word = "";
        }
        
        return result;
    }
    
    private void cloneLanguage(final Language language1, Language language2) {
        language2.setWordList((List<String>) ((ArrayList<String>) language1.getWordList()).clone());        
    }
    
    /**
     * Opens a text file and load the information in the application.
     * 
     * @throws JOpLenException
     */
    public void open() throws JOpLenException {
        try {
            FileManager.getInstance().openFile();
        } catch (IOException ex) {
            throw new JOpLenException("There was an error opening the project.", ex);
        }
    }
    
    /**
     * Saves the current application status into a text file.
     * 
     * @throws JOpLenException 
     */
    public void save() throws JOpLenException {
        try {
            FileManager.getInstance().save();
        } catch (IOException ex) {
            throw new JOpLenException("There was an error during the saving process.", ex);
        }
    }
    
    /**
     * Adds a new Language into the langaugesMap.
     * 
     * @param language Language to be added.
     */
    public void addLanguage(final Language language) {
        languagesMap.put(language.getName(), language);
    }
    
    public Alphabet getAlphabet() {
        return alphabet;
    }
    
    public void setAlphabet(Alphabet alphabet) {
        this.alphabet = alphabet;
    }

    public List<Language> getLanguages() {
        List<Language> list = new ArrayList<Language>();
        
        for (Language language: languagesMap.values()) {
            list.add(language);
        }
        
        return list;
    }
}