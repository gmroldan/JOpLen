/* 
 *  Copyright (C) 2012  Gerardo Martín Roldán
 *  GNU General Pulbic License
 */
package joplen.model;

import java.util.HashSet;
import java.util.Set;

public class Alphabet {
    private final Set<String> symbols;

    /**
     * Class constructor with no-args
     */
    public Alphabet() {
        this.symbols = new HashSet<String>();
    }    

    /**
     * Adds an array of symbols into the Alphabet.
     * 
     * @param symbols Array of symbols that should be added into the Alphabet.
     * @throws Exception When the length of a symbol is greater than 1.
     */
    public void addSymbols(final String[] symbols) throws Exception {        
        for (String symbol: symbols) {
            if (symbol.length() == 1) {
                addSymbol(symbol.toLowerCase());
            } else {
                throw new Exception();
            }           
        }
    }
    
    /**
     * Checks if a symbol belongs to the Alphabet.
     * 
     * @param symbol Symbol to be checked.
     * @return Returns True if the symbol belongs to the Alphabet, otherwise returns False.
     */
    public boolean belongs(final char symbol) {
        return symbols.contains(String.valueOf(symbol));
    }    
    
    /**
     * Adds a symbol into the Alphabet.
     * 
     * @param symbol Symbol to be added.
     */
    public void addSymbol(String symbol) {
        symbols.add(symbol);
    }

    public Set<String> getSymbols() {
        return symbols;
    }
    
    @Override
    public String toString() {
        return symbols.toString();
    }
}
