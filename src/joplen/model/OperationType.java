/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package joplen.model;

/**
 *
 * @author gerardo
 */
public enum OperationType {
    UNION("Union"),
    DIFERENCE("Diferencia"),
    INTERSECTION("Interseccion"),
    COMPLEMENT("Complemento"),
    PRODUCT("Producto"),
    EXPONENTIATION("Potencia"),
    KLEENE_STAR("Kleene"),
    POSITIVE_STAR("Positiva"),
    REVERSE("Inversa");
    
    private final String value;

    private OperationType(String value) {
        this.value = value;
    }
    
    public String getValue() {
        return value;
    }    
}
