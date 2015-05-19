package joplen.controller;

import joplen.exceptions.JOpLenException;
import joplen.model.Alphabet;
import joplen.model.JOpLenCore;
import joplen.model.Language;
import joplen.model.OperationType;

public class JOpLenController {
    private static final JOpLenController INSTANCE = new JOpLenController();
    private final JOpLenCore jOpLenCore;
    
    private JOpLenController() {
        this.jOpLenCore = JOpLenCore.getInstance();
    }
    
    public static JOpLenController getInstance() {
        return INSTANCE;
    }
    
    public void newAlphabet(String[] symbols) throws JOpLenException {
        jOpLenCore.newAlphabet(symbols);
    }
    
    public void newLanguage(String[] words) throws JOpLenException {
        jOpLenCore.newLanguage(words);
    }
    
    public String resolve(String language1String, String language2String, String exponentString, OperationType operationType) {
        StringBuilder stringBuilder = new StringBuilder();
        Language language1 = jOpLenCore.findLanguage(language1String);
        Language language2 = null;
        int exponent = 0;
        
        if (language2String != null) {
            language2 = jOpLenCore.findLanguage(language2String);
        }
        
        if (exponentString != null) {
            exponent = Integer.parseInt(exponentString);
        }
        
        switch (operationType) {
            case UNION:
                stringBuilder.append(language1String)
                        .append(" ∪ ")
                        .append(language2String)
                        .append(" = ")
                        .append(jOpLenCore.union(language1, language2).getWordList().toString());
                break;
            case DIFERENCE:
                stringBuilder.append(language1String)
                        .append(" - ")
                        .append(language2String)
                        .append(" = ")
                        .append(jOpLenCore.difference(language1, language2).getWordList().toString());
                break;
            case INTERSECTION:
                stringBuilder.append(language1String)
                        .append(" ∩ ")
                        .append(language2String)
                        .append(" = ")
                        .append(jOpLenCore.intersection(language1, language2).getWordList().toString());
                break;                
            case COMPLEMENT:
                stringBuilder.append("∼")
                        .append(language1String)
                        .append(" = ")
                        .append(jOpLenCore.complement(language1));
                break;
            case PRODUCT:
                stringBuilder.append(language1String)
                        .append(" . ")
                        .append(language2String)
                        .append(" = ")
                        .append(jOpLenCore.product(language1, language2).getWordList().toString());
                break;
            case EXPONENTIATION:                
                if (exponent >= 0) {
                    stringBuilder.append(language1String)
                        .append(" a la ")
                        .append(exponent)
                        .append(" = ")
                        .append(jOpLenCore.exponentiaton(language1, exponent).getWordList().toString());
                } else {
                    stringBuilder.append("ERROR: Esta operación solo acepta potencias mayores o iguales a 0(cero)");
                }
                break;
            case KLEENE_STAR:
                if (exponent >= 0) {
                    stringBuilder.append(language1String)
                        .append(" Estrella de Kleene en potencia ")
                        .append(exponent)
                        .append(" = ")
                        .append(jOpLenCore.kleeneStar(language1, exponent).getWordList().toString());                    
                } else {
                    stringBuilder.append("ERROR: Esta opereción solo acepta potencias mayores o iguales a 0(cero)");
                }
                break;
            case POSITIVE_STAR:
                if (exponent >= 1) {
                    stringBuilder.append(language1String)
                        .append(" Estrella Positiva en potencia ")
                        .append(exponent)
                        .append(" = ")
                        .append(jOpLenCore.positiveStar(language1, exponent).getWordList().toString());                    
                } else {
                    stringBuilder.append("ERROR: Esta opereción solo acepta potencias mayores o iguales a 1(uno)");
                }
                break;
            case REVERSE:
                stringBuilder.append(language1String)
                        .append(" inversa = ")
                        .append(jOpLenCore.reverse(language1).getWordList().toString());
                break;
        }
        return stringBuilder.toString();
    }
    
    public void saveProject() throws JOpLenException {
        jOpLenCore.save();
    }
    
    public void openProject() throws JOpLenException {
        jOpLenCore.open();
    }
    
    public Alphabet getAlphabet() {
        return jOpLenCore.getAlphabet();
    }
    
    public Object[] getLanguages() {
        return jOpLenCore.getLanguages().toArray();
    }
}
