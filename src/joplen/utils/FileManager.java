/* 
 *  Copyright (C) 2012  Gerardo Martín Roldán
 *  GNU General Pulbic License
 */
package joplen.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import joplen.model.Alphabet;
import joplen.model.JOpLenCore;
import joplen.model.Language;

public class FileManager {
    private static FileManager INSTANCE = null;
    private final String FILE_NAME_DEFAULT = "archivo.txt";
    
    public static FileManager getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new FileManager();
        }
        return INSTANCE;
    }
    
    public void openFile() throws Exception {
        BufferedReader br = new BufferedReader(new FileReader(FILE_NAME_DEFAULT));
        String line;
        boolean condition = true;
        
        while ((line = br.readLine()) != null) {
            NameFactory.getInstance().resetCounter();
            
            if (condition) {
                Alphabet alphabetAux = new Alphabet();
                
                for (int i = 0; i < line.length(); i++) {
                    alphabetAux.addSymbol(String.valueOf(line.charAt(i)));
                }
                
                JOpLenCore.getInstance().setAlphabet(alphabetAux);
                condition = false;
            } else {
                String wordAux = "";
                Language languageAux = new Language();
                
                for (int i = 0; i < line.length(); i++) {
                    if (!",".equals(String.valueOf(line.charAt(i)))) {
                        wordAux = wordAux + "" + String.valueOf(line.charAt(i));                    
                    } else {
                        languageAux.addWord(wordAux);                        
                        wordAux = "";
                    }
                }        
                languageAux.setName(NameFactory.getInstance().getLanguageName());
                JOpLenCore.getInstance().addLanguage(languageAux);
            }                
        }
        br.close();
    }
    
    public void save() throws IOException {
        FileWriter fw = new FileWriter(new File("archivo.txt"));
        
        for (String symbol: JOpLenCore.getInstance().getAlphabet().getSymbols()) {
            fw.write(symbol);
        }        
        
        for (Language language: JOpLenCore.getInstance().getLanguages()) {
            fw.write("\n");
            for (String word: language.getWordList()) {
                fw.write(word + ",");
            }            
        }
        fw.close();
    }
}
