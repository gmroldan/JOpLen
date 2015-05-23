/* 
 *  Copyright (C) 2012  Gerardo Martín Roldán
 *  GNU General Pulbic License
 */
package joplen.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import joplen.model.Alphabet;
import joplen.model.JOpLenCore;
import joplen.model.Language;

public class FileManager {
    private static FileManager INSTANCE = null;
    private static final String SEPARATOR = ",";
    private static final String NEXT_LINE = "\n";
    
    public static FileManager getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new FileManager();
        }
        return INSTANCE;
    }
    
    /**
     * Opens a given file and sets up the alphabet and the languages to work with.
     * 
     * @param file File to be loaded.
     * @throws FileNotFoundException
     * @throws IOException 
     */
    public void openFile(File file) throws FileNotFoundException, IOException {
        if (file == null) {
            throw new FileNotFoundException("File not found.");
        }
        
        BufferedReader br = new BufferedReader(new FileReader(file));
        StringBuilder wordAux = new StringBuilder();
        String line;
        boolean firstLine = true;
        NameFactory.getInstance().resetCounter();
        
        while ((line = br.readLine()) != null) {            
            if (firstLine) {
                Alphabet alphabetAux = new Alphabet();
                
                for (int i = 0; i < line.length(); i++) {
                    alphabetAux.addSymbol(String.valueOf(line.charAt(i)));
                }
                
                JOpLenCore.getInstance().setAlphabet(alphabetAux);
                JOpLenCore.getInstance().clearLanguages();
                firstLine = false;
            } else {                
                Language languageAux = new Language();
                
                for (int i = 0; i < line.length(); i++) {
                    if (!SEPARATOR.equals(String.valueOf(line.charAt(i)))) {
                        wordAux.append(String.valueOf(line.charAt(i)));
                    } else {
                        languageAux.addWord(wordAux.toString());
                        wordAux.setLength(0);
                    }
                }        
                languageAux.setName(NameFactory.getInstance().getLanguageName());
                JOpLenCore.getInstance().addLanguage(languageAux);
            }                
        }
        br.close();
    }
    
    /**
     * Saves the application current data into a text file.
     * 
     * @param file File to be saved.
     * @throws IOException 
     */
    public void save(File file) throws IOException {
        if (file == null) {
            throw new FileNotFoundException("File not found.");
        }
        
        FileWriter fw = new FileWriter(file);
        
        for (String symbol: JOpLenCore.getInstance().getAlphabet().getSymbols()) {
            fw.write(symbol);
        }        
        
        for (Language language: JOpLenCore.getInstance().getLanguages()) {
            fw.write(NEXT_LINE);
            for (String word: language.getWordList()) {
                fw.write(word + SEPARATOR);
            }            
        }
        fw.close();
    }
}
