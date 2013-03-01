/* 
 *  Copyright (C) 2012  Gerardo Martín Roldán
 *  GNU General Pulbic License
 */
package modelo;

import java.util.ArrayList;

public class Lenguaje {
    /*
     * Atributos
     */
    private String nombre;    
    private ArrayList<String> palabras = new ArrayList<String>();
    
    /*
     * Métodos Constructores
     */
    public Lenguaje(){}

    public Lenguaje(int numero) {        
        this.nombre = "Lenguaje " + String.valueOf(numero);
    }

    /*
     * Métodos
     */
    public void agregarPalabra(String palabra) {
        palabras.add(palabra);
    }
    
    public boolean pertenece(String palabra) {
        return palabras.contains(palabra);
    }

    @Override
    public String toString() {
        return palabras.toString();
    }
    
    /*
     * Métodos Accesores y Mutadores
     */
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
