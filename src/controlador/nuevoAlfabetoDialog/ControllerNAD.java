package controlador.nuevoAlfabetoDialog;

import modelo.Alfabeto;
import modelo.Entorno;

public class ControllerNAD {
    public void nuevoAlfabeto(String[] texto) throws Exception{
        Alfabeto a=new Alfabeto();
        a.ingresarSimbolos(texto);
        Entorno.agregarAlfabeto(a);        
    }
}
