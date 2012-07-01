package controlador;

import java.io.IOException;
import modelo.Entorno;

public class ControllerVP {
    private Entorno e;
    
    public ControllerVP(){
        e=new Entorno();
    }
    
    public String realizarOperación(String len1,String len2,String potencia,int operacion){
        String resultado="";        
        switch(operacion){
            case 0:
                resultado=len1+" ∪ "+len2+" = "+e.union(e.buscarLenguaje(len1), e.buscarLenguaje(len2)).getPalabras().toString();
                break;
            case 1:
                resultado=len1+" - "+len2+" = "+e.diferencia(e.buscarLenguaje(len1), e.buscarLenguaje(len2)).getPalabras().toString();
                break;
            case 2:
                resultado=len1+" ∩ "+len2+" ="+e.interseccion(e.buscarLenguaje(len1), e.buscarLenguaje(len2)).getPalabras().toString();
                break;                
            case 3:
                resultado="∼"+len1+" = "+e.complemento(e.buscarLenguaje(len1));
                break;
            case 4:
                resultado=len1+" . "+len2+" = "+e.producto(e.buscarLenguaje(len1), e.buscarLenguaje(len2)).getPalabras().toString();
                break;
            case 5:
                if(Integer.parseInt(potencia)>=0)
                    resultado=len1+" a la "+potencia+" = "+e.potenciacion(e.buscarLenguaje(len1), Integer.parseInt(potencia)).getPalabras().toString();
                else
                    resultado="ERROR: Esta opereción solo acepta potencias mayores o iguales a 0(cero)";
                break;
            case 6:
                if(Integer.parseInt(potencia)>=0)
                    resultado=len1+" Estrella de Kleene en potencia "+Integer.parseInt(potencia)+" = "+e.estrella("kleene", e.buscarLenguaje(len1), Integer.parseInt(potencia)).getPalabras().toString();
                else
                    resultado="ERROR: Esta opereción solo acepta potencias mayores o iguales a 0(cero)";
                break;
            case 7:
                if(Integer.parseInt(potencia)>=1)
                    resultado=len1+" Estrella Positiva en potencia "+Integer.parseInt(potencia)+" = "+e.estrella("", e.buscarLenguaje(len1), Integer.parseInt(potencia)).getPalabras().toString();
                else
                    resultado="ERROR: Esta opereción solo acepta potencias mayores o iguales a 1(uno)";
                break;
            case 8:
                resultado=len1+" inversa = "+e.inversa(e.buscarLenguaje(len1)).getPalabras().toString();
                break;
        }
        return resultado;
    }
    
    public void guardarProyecto() throws IOException{
        e.guardar();
    }
    
    public void abrirProyecto() throws Exception{
        e.abrir();
    }
}
