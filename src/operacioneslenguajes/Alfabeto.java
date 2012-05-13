/* 
 *  Copyright (C) 2012  Gerardo Martín Roldán
 *  GNU General Pulbic License
 */
package operacioneslenguajes;

import java.util.ArrayList;

public class Alfabeto {    
    private ArrayList<String> simbolos = new ArrayList<String>();

    public void ingresarSimbolos(String[] texto) throws Exception{        
        for(String t:texto){
            if(!perteneceAlfabetoMayusculas(t.charAt(0))){
                if(t.length()==1){
                    if(!pertenece(t))
                        simbolos.add(t);
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
    
    public boolean pertenece(String simbolo){
        boolean resultado=false;
        for(int i=0;i<simbolos.size();i++){
            if(simbolos.get(i).equals(simbolo)){
                resultado=true;
                break;
            }
        }        
        return resultado;
    }    
    
    public boolean pertenece(char simbolo){
        boolean resultado=false;
        for(int i=0;i<simbolos.size();i++){
            if(simbolos.get(i).charAt(0)==simbolo){
                resultado=true;
                break;
            }
        }        
        return resultado;
    }

    public ArrayList<String> getSimbolos() {
        return simbolos;
    }

    public void setSimbolos(ArrayList<String> simbolos) {
        this.simbolos = simbolos;
    }
}
