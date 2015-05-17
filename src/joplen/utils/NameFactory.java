/* 
 *  Copyright (C) 2012  Gerardo Martín Roldán
 *  GNU General Pulbic License
 */
package joplen.utils;

public class NameFactory {
    private static NameFactory INSTANCE;
    private final String LANGUAGE_NAME_DEFAULT = "Lenguaje ";
    private int languageCounter;
    
    private NameFactory() {
        this.languageCounter = 0;
    }
    
    public static NameFactory getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new NameFactory();
        }
        return INSTANCE;
    }
    
    public void resetCounter() {
        languageCounter = 0;
    }
    
    public String getLanguageName() {
        this.languageCounter++;
        return LANGUAGE_NAME_DEFAULT + languageCounter;
    }
}
