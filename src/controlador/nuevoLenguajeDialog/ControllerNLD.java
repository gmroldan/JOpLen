package controlador.nuevoLenguajeDialog;

import modelo.Entorno;
import modelo.Lenguaje;

public class ControllerNLD {
    public void nuevoLenguaje(String[] texto) throws Exception{
        Lenguaje lenguajeActual=new Lenguaje(Entorno.getLenguajes().size()+1);
        lenguajeActual.ingresarPalabras(texto);
        Entorno.agregarLenguaje(lenguajeActual);
    }
}
