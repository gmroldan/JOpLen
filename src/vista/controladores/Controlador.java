package vista.controladores;

import java.io.IOException;
import joplen.model.JOpLenCore;

public class Controlador {
    private final JOpLenCore entorno;
    
    public Controlador(){
        entorno = JOpLenCore.getInstance();
    }
    
    public void nuevoAlfabeto(String[] simbolos) throws Exception {
        entorno.newAlphabet(simbolos);
    }
    
    public void nuevoLenguaje(String[] palabras) throws Exception {
        entorno.newLanguage(palabras);
    }
    
    public String realizarOperación(String len1, String len2, String potencia, int operacion){
        String resultado = "";
        switch(operacion){
            case 0:
                resultado = len1 + " ∪ " + len2 + " = " + entorno.union(entorno.findLanguage(len1), entorno.findLanguage(len2)).getWordList().toString();
                break;
            case 1:
                resultado = len1 + " - " + len2 + " = " + entorno.difference(entorno.findLanguage(len1), entorno.findLanguage(len2)).getWordList().toString();
                break;
            case 2:
                resultado = len1 + " ∩ " + len2 + " =" + entorno.intersection(entorno.findLanguage(len1), entorno.findLanguage(len2)).getWordList().toString();
                break;                
            case 3:
                resultado = "∼" + len1 + " = " + entorno.complement(entorno.findLanguage(len1));
                break;
            case 4:
                resultado = len1 + " . " + len2 + " = " + entorno.product(entorno.findLanguage(len1), entorno.findLanguage(len2)).getWordList().toString();
                break;
            case 5:
                if(Integer.parseInt(potencia) >= 0) {
                    resultado = len1 + " a la " + potencia + " = " + entorno.potenciacion(entorno.findLanguage(len1), Integer.parseInt(potencia)).getWordList().toString();
                } else {
                    resultado = "ERROR: Esta opereción solo acepta potencias mayores o iguales a 0(cero)";
                }
                break;
            case 6:
                if(Integer.parseInt(potencia) >= 0) {
                    resultado = len1 + " Estrella de Kleene en potencia " + Integer.parseInt(potencia) + " = " + entorno.kleeneStar(entorno.findLanguage(len1), Integer.parseInt(potencia)).getWordList().toString();
                } else {
                    resultado = "ERROR: Esta opereción solo acepta potencias mayores o iguales a 0(cero)";
                }
                break;
            case 7:
                if(Integer.parseInt(potencia) >= 1) {
                    resultado = len1 + " Estrella Positiva en potencia " + Integer.parseInt(potencia) + " = " + entorno.positiveStar(entorno.findLanguage(len1), Integer.parseInt(potencia)).getWordList().toString();
                } else {
                    resultado = "ERROR: Esta opereción solo acepta potencias mayores o iguales a 1(uno)";
                }
                break;
            case 8:
                resultado = len1 + " inversa = " + entorno.reverse(entorno.findLanguage(len1)).getWordList().toString();
                break;
        }
        return resultado;
    }
    
    public void guardarProyecto() throws IOException{
        entorno.save();
    }
    
    public void abrirProyecto() throws Exception{
        entorno.open();
    }
    
    public String getAlfabeto() {
        return entorno.getAlphabet().toString();
    }
    
    public Object[] getLenguajes() {
        return entorno.getLanguages().toArray();
    }
}
