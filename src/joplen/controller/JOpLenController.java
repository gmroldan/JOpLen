package joplen.controller;

import java.io.IOException;
import joplen.exceptions.JOpLenException;
import joplen.model.JOpLenCore;

public class JOpLenController {
    private final JOpLenCore jOpLenCore;
    
    public JOpLenController() {
        this.jOpLenCore = JOpLenCore.getInstance();
    }
    
    public void newAlphabet(String[] symbols) throws JOpLenException {
        jOpLenCore.newAlphabet(symbols);
    }
    
    public void newLanguage(String[] words) throws JOpLenException {
        jOpLenCore.newLanguage(words);
    }
    
    public String resolve(String language1, String language2, String exponent ,int operation) {
        String result = "";
        
        switch (operation) {
            case 0:
                result = language1 + " ∪ " + language2 + " = " + jOpLenCore.union(jOpLenCore.findLanguage(language1), jOpLenCore.findLanguage(language2)).getWordList().toString();
                break;
            case 1:
                result = language1 + " - " + language2 + " = " + jOpLenCore.difference(jOpLenCore.findLanguage(language1), jOpLenCore.findLanguage(language2)).getWordList().toString();
                break;
            case 2:
                result = language1 + " ∩ " + language2 + " =" + jOpLenCore.intersection(jOpLenCore.findLanguage(language1), jOpLenCore.findLanguage(language2)).getWordList().toString();
                break;                
            case 3:
                result = "∼" + language1 + " = " + jOpLenCore.complement(jOpLenCore.findLanguage(language1));
                break;
            case 4:
                result = language1 + " . " + language2 + " = " + jOpLenCore.product(jOpLenCore.findLanguage(language1), jOpLenCore.findLanguage(language2)).getWordList().toString();
                break;
            case 5:
                if (Integer.parseInt(exponent) >= 0) {
                    result = language1 + " a la " + exponent + " = " + jOpLenCore.potenciacion(jOpLenCore.findLanguage(language1), Integer.parseInt(exponent)).getWordList().toString();
                } else {
                    result = "ERROR: Esta opereción solo acepta potencias mayores o iguales a 0(cero)";
                }
                break;
            case 6:
                if (Integer.parseInt(exponent) >= 0) {
                    result = language1 + " Estrella de Kleene en potencia " + Integer.parseInt(exponent) + " = " + jOpLenCore.kleeneStar(jOpLenCore.findLanguage(language1), Integer.parseInt(exponent)).getWordList().toString();
                } else {
                    result = "ERROR: Esta opereción solo acepta potencias mayores o iguales a 0(cero)";
                }
                break;
            case 7:
                if (Integer.parseInt(exponent) >= 1) {
                    result = language1 + " Estrella Positiva en potencia " + Integer.parseInt(exponent) + " = " + jOpLenCore.positiveStar(jOpLenCore.findLanguage(language1), Integer.parseInt(exponent)).getWordList().toString();
                } else {
                    result = "ERROR: Esta opereción solo acepta potencias mayores o iguales a 1(uno)";
                }
                break;
            case 8:
                result = language1 + " inversa = " + jOpLenCore.reverse(jOpLenCore.findLanguage(language1)).getWordList().toString();
                break;
        }
        return result;
    }
    
    public void saveProject() throws JOpLenException {
        jOpLenCore.save();
    }
    
    public void openProject() throws JOpLenException {
        jOpLenCore.open();
    }
    
    public String getAlphabet() {
        return jOpLenCore.getAlphabet().toString();
    }
    
    public Object[] getLanguages() {
        return jOpLenCore.getLanguages().toArray();
    }
}
