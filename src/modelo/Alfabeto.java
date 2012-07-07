/* 
 *  Copyright (C) 2012  Gerardo Martín Roldán
 *  GNU General Pulbic License
 */
package modelo;

import java.util.ArrayList;

public class Alfabeto {    
    private ArrayList<String> simbolos = new ArrayList<String>();

    public void ingresarSimbolos(String[] texto) throws Exception{        
        for(String t:texto){
            if(!perteneceAlfabetoMayusculas(t.charAt(0))){
                if(t.length()==1){
                    if(!simbolos.contains(t))
                        agregarSimbolo(t);
                }
                else
                    throw new Exception();                    
            }                
            else
                throw new Exception();                
        }
    }
    
    public boolean perteneceAlfabetoMayusculas(char simbolo){
        return (simbolo<'A' || simbolo>'Z')? false:true;
    }  
    
    public boolean pertenece(char simbolo){
        return simbolos.contains(String.valueOf(simbolo));
    }    
    
    public void agregarSimbolo(String s){
        simbolos.add(s);
    }

    public ArrayList<String> getSimbolos() {
        return simbolos;
    }
}
