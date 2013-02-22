package vista.controladores;

import java.io.IOException;
import modelo.Entorno;

public class Controlador {
    private Entorno entorno;
    
    public Controlador(){
        entorno = new Entorno();
    }
    
    public void nuevoAlfabeto(String[] simbolos) throws Exception {
        entorno.nuevoAlfabeto(simbolos);
    }
    
    public void nuevoLenguaje(String[] palabras) throws Exception {
        entorno.nuevoLenguaje(palabras);
    }
    
    public String realizarOperación(String len1, String len2, String potencia, int operacion){
        String resultado = "";
        switch(operacion){
            case 0:
                resultado = len1 + " ∪ " + len2 + " = " + entorno.union(entorno.buscarLenguaje(len1), entorno.buscarLenguaje(len2)).getPalabras().toString();
                break;
            case 1:
                resultado = len1 + " - " + len2 + " = " + entorno.diferencia(entorno.buscarLenguaje(len1), entorno.buscarLenguaje(len2)).getPalabras().toString();
                break;
            case 2:
                resultado = len1 + " ∩ " + len2 + " =" + entorno.interseccion(entorno.buscarLenguaje(len1), entorno.buscarLenguaje(len2)).getPalabras().toString();
                break;                
            case 3:
                resultado = "∼" + len1 + " = " + entorno.complemento(entorno.buscarLenguaje(len1));
                break;
            case 4:
                resultado = len1 + " . " + len2 + " = " + entorno.producto(entorno.buscarLenguaje(len1), entorno.buscarLenguaje(len2)).getPalabras().toString();
                break;
            case 5:
                if(Integer.parseInt(potencia) >= 0) {
                    resultado = len1 + " a la " + potencia + " = " + entorno.potenciacion(entorno.buscarLenguaje(len1), Integer.parseInt(potencia)).getPalabras().toString();
                } else {
                    resultado = "ERROR: Esta opereción solo acepta potencias mayores o iguales a 0(cero)";
                }
                break;
            case 6:
                if(Integer.parseInt(potencia) >= 0) {
                    resultado = len1 + " Estrella de Kleene en potencia " + Integer.parseInt(potencia) + " = " + entorno.estrella("kleene", entorno.buscarLenguaje(len1), Integer.parseInt(potencia)).getPalabras().toString();
                } else {
                    resultado = "ERROR: Esta opereción solo acepta potencias mayores o iguales a 0(cero)";
                }
                break;
            case 7:
                if(Integer.parseInt(potencia) >= 1) {
                    resultado = len1 + " Estrella Positiva en potencia " + Integer.parseInt(potencia) + " = " + entorno.estrella("", entorno.buscarLenguaje(len1), Integer.parseInt(potencia)).getPalabras().toString();
                } else {
                    resultado = "ERROR: Esta opereción solo acepta potencias mayores o iguales a 1(uno)";
                }
                break;
            case 8:
                resultado = len1 + " inversa = " + entorno.inversa(entorno.buscarLenguaje(len1)).getPalabras().toString();
                break;
        }
        return resultado;
    }
    
    public void guardarProyecto() throws IOException{
        entorno.guardar();
    }
    
    public void abrirProyecto() throws Exception{
        entorno.abrir();
    }
    
    public String getAlfabeto() {
        return entorno.getAlfabeto().toString();
    }
    
    public Object[] getLenguajes() {
        return entorno.getLenguajes().toArray();
    }
}
