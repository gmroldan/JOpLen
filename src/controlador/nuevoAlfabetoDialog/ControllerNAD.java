package controlador.nuevoAlfabetoDialog;

import modelo.Entorno;

public class ControllerNAD {
    public void nuevoAlfabeto(String[] texto) throws Exception{
        Entorno.getAlfabeto().ingresarSimbolos(texto);
    }
}
