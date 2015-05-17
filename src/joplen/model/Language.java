/* 
 *  Copyright (C) 2012  Gerardo Martín Roldán
 *  GNU General Pulbic License
 */
package joplen.model;

import java.util.ArrayList;
import java.util.List;

public class Language {
    private String name;    
    private List<String> wordList;
    
    /**
     * Class constructor.
     */
    public Language() {
        this.wordList = new ArrayList<String>();
    }

    /**
     * Adds a word into the Language.
     * 
     * @param word Word to be added.
     */
    public void addWord(String word) {
        wordList.add(word);
    }
    
    /**
     * Checks if a word belongs to the Language.
     * 
     * @param word Word to be checked.
     * @return Returns True if the word belongs to the Language, otherwise returns False.
     */
    public boolean belongs(String word) {
        return wordList.contains(word);
    }

    public List<String> getWordList() {
        return wordList;
    }

    public void setWordList(List<String> wordList) {
        this.wordList = wordList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    @Override
    public String toString() {
        return wordList.toString();
    }
}
