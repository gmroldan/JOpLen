/* 
 *  Copyright (C) 2012  Gerardo Martín Roldán
 *  GNU General Pulbic License
 */
package operacioneslenguajes;

import java.util.ArrayList;

public class Lenguaje {
    private String nombre;    
    private ArrayList<String> palabras = new ArrayList<String>();
    
    public Lenguaje(){}

    public Lenguaje(int numero) {        
        this.nombre="Lenguaje "+String.valueOf(numero);
    }

    public void ingresarPalabras(String[] texto) throws Exception {
        //"ʎ";
        for(String palabra:texto){
            if (perteneceAlfabeto(palabra) && !pertenece(palabra))
                getPalabras().add(palabra);        
            else
                throw new Exception();
        }        
    }

    public boolean perteneceAlfabeto(String palabra) {
        boolean resultado = true;
        for (int i = 0; i < palabra.length(); i++) {
            if (!Entorno.getAlfabeto().pertenece(palabra.charAt(i))) {
                resultado = false;
                break;
            }
        }
        return resultado;
    }

    public boolean pertenece(String palabra) {
        boolean resultado = false;
        for (int i = 0; i < palabras.size(); i++) {
            if (getPalabras().get(i).compareTo(palabra) == 0) {
                resultado = true;
                break;
            }
        }
        return resultado;
    }
    
    public ArrayList<String> getPalabras() {
        return palabras;
    }

    public void setPalabras(ArrayList<String> palabras) {
        this.palabras = palabras;
    }

    public String getNombre() {
        return nombre;
    }
}