/* 
 *  Copyright (C) 2012  Gerardo Martín Roldán
 *  GNU General Pulbic License
 */
package modelo;

import java.util.ArrayList;

public class Lenguaje {
    private String nombre;    
    private ArrayList<String> palabras = new ArrayList<String>();
    
    public Lenguaje(){}

    public Lenguaje(int numero) {        
        this.nombre="Lenguaje "+String.valueOf(numero);
    }

    public void ingresarPalabras(String[] texto) throws Exception {
        for(String palabra:texto){
            if (perteneceAlfabeto(palabra) && !pertenece(palabra))
                agregarPalabra(palabra)      ;
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
    
    public void agregarPalabra(String p){
        palabras.add(p);
    }
    
    public boolean pertenece(String palabra){
        return palabras.contains(palabra);
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

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
