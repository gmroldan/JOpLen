/* 
 *  Copyright (C) 2012  Gerardo Martín Roldán
 *  GNU General Pulbic License
 */
package modelo;

import java.util.ArrayList;

public class Alfabeto {
    /*
     * Atributos
     */
    private ArrayList<String> simbolos = new ArrayList<String>();

    /*
     * Métodos
     */
    public void ingresarSimbolos(String[] simbolos) throws Exception {        
        for(String t: simbolos){
            if(!perteneceAlfabetoMayusculas(t.charAt(0))) {
                if(t.length() == 1){
                    if(!this.simbolos.contains(t)) {
                        agregarSimbolo(t);
                    }
                }
                else {
                    throw new Exception();
                }                    
            }                
            else {
                throw new Exception();
            }                
        }
    }
    
    private boolean perteneceAlfabetoMayusculas(char simbolo){
        return (simbolo < 'A' || simbolo > 'Z')? false:true;
    }  
    
    public boolean pertenece(char simbolo) {
        return simbolos.contains(String.valueOf(simbolo));
    }    
    
    public void agregarSimbolo(String simbolo) {
        simbolos.add(simbolo);
    }

    @Override
    public String toString() {
        return simbolos.toString();
    }

    /*
     * Métodos Accesores y Mutadores
     */
    public ArrayList<String> getSimbolos() {
        return simbolos;
    }
}
