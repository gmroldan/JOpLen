/* 
 *  Copyright (C) 2012  Gerardo Martín Roldán
 *  GNU General Pulbic License
 */
package modelo;

import java.io.*;
import java.util.ArrayList;

public class Entorno {
    private static Alfabeto alfabeto=new Alfabeto();
    private static ArrayList<Lenguaje> lenguajes=new ArrayList<Lenguaje>();
    
    public void agregarAlfabeto(Alfabeto a){
        setAlfabeto(a);
    }
    
    public static void agregarLenguaje(Lenguaje len){
        getLenguajes().add(len);
    }
    
    public static Alfabeto getAlfabeto() {
        return alfabeto;
    }

    public static void setAlfabeto(Alfabeto aAlfabeto) {
        alfabeto = aAlfabeto;
    }

    public static ArrayList<Lenguaje> getLenguajes() {
        return lenguajes;
    }
    
    public Lenguaje buscarLenguaje(String cadena){
        Lenguaje lenguaje = null;
        for(Lenguaje l:getLenguajes()){
            if(l.getNombre().equals(cadena)){
                lenguaje=l;
                break;
            }
        }
        return lenguaje;
    }
    
    public Lenguaje union(Lenguaje len1,Lenguaje len2){
        Lenguaje resultado=new Lenguaje();
        resultado.setPalabras(copiar(len1,resultado).getPalabras());        
        for(String palabra:len2.getPalabras()){
            if(!resultado.pertenece(palabra))
                resultado.getPalabras().add(palabra);
        }
        if(resultado.getPalabras().isEmpty())
            resultado.getPalabras().add("Φ");
        return resultado;
    }
    
    public Lenguaje interseccion(Lenguaje len1,Lenguaje len2){
        Lenguaje resultado=new Lenguaje();
        for(String palabra:len1.getPalabras()){
            if(len2.pertenece(palabra))
                if(!resultado.pertenece(palabra))
                    resultado.getPalabras().add(palabra);
        }
        if(resultado.getPalabras().isEmpty())
            resultado.getPalabras().add("Φ");        
        return resultado;
    }
    
    public Lenguaje diferencia(Lenguaje len1,Lenguaje len2){
        Lenguaje resultado=new Lenguaje();
        for(String palabra:len1.getPalabras()){
            if(!len2.pertenece(palabra))
                if(!resultado.pertenece(palabra))
                    resultado.getPalabras().add(palabra);
        }
        if(resultado.getPalabras().isEmpty())
            resultado.getPalabras().add("Φ");        
        return resultado;
    }

    
    public String complemento(Lenguaje len1){
       String resultado=len1.getPalabras().toString();
       return "Todas las secuencias de "+resultado+", excepto "+resultado;
    }
    
    public Lenguaje producto(Lenguaje len1, Lenguaje len2){
       Lenguaje resultado=new Lenguaje();
       String palabra=null;
       for(String p1:len1.getPalabras()){
           for(String p2:len2.getPalabras()){
               palabra=p1+""+p2;
               if(!resultado.pertenece(palabra))
                   resultado.getPalabras().add(palabra);
           }
       }
       return resultado;
    }
    
    public Lenguaje potenciacion(Lenguaje len,int potencia){
        Lenguaje resultado=new Lenguaje();
        if(potencia==0)
            resultado.getPalabras().add("λ");
        if(potencia==1)
            resultado.setPalabras(copiar(len,resultado).getPalabras());
        if(potencia>1){
            Lenguaje aux=new Lenguaje();
            aux.setPalabras(copiar(len,aux).getPalabras());            
            String palabra=null;
            for(int i=1;i<potencia;i++){                
                for(String p1:aux.getPalabras()){                    
                    for(String p2:len.getPalabras()){
                        palabra = p1+""+p2;                                 
                        if(!resultado.pertenece(palabra))
                            resultado.getPalabras().add(palabra);
                    }                        
                }
                aux.setPalabras(actualizarAux(resultado).getPalabras());
            }
        }
        return resultado;
    }
    
    public Lenguaje actualizarAux(Lenguaje resultado){
        Lenguaje aux=new Lenguaje();
        aux.setPalabras(copiar(resultado,aux).getPalabras());        
        return aux;
    }    
    
    public Lenguaje estrella(String tipo, Lenguaje len, int potencia){
        Lenguaje resultado=new Lenguaje();        
        Lenguaje aux=new Lenguaje();  
        if("kleene".equals(tipo))
            resultado.getPalabras().add("λ");
        for(int i=1;i<=potencia;i++){
            for(String palabra:union(resultado, potenciacion(len, i)).getPalabras()){
                aux.getPalabras().add(palabra);
            }
            resultado.getPalabras().clear();
            resultado.setPalabras(copiar(aux,resultado).getPalabras());            
            aux.getPalabras().clear();
        }
        return resultado;
    }
    
    public Lenguaje inversa(Lenguaje len){
        Lenguaje resultado=new Lenguaje();
        String palabra="";
        for(String p:len.getPalabras()){                        
            for(int i=p.length()-1;i>=0;i--){
                palabra=palabra+""+String.valueOf(p.charAt(i));                
            }
            resultado.getPalabras().add(palabra);
            palabra="";
        }
        return resultado;
    }
    
    public Lenguaje copiar(Lenguaje len1, Lenguaje len2){
        for(String palabra:len1.getPalabras())
            len2.getPalabras().add(palabra);
        return len2;
    }
    
    public void abrir() throws Exception{
        BufferedReader br=new BufferedReader(new FileReader("archivo.txt"));
        String linea;        
        boolean j=true;
        while((linea=br.readLine())!=null){
            if(j){    
                Alfabeto aux=new Alfabeto();
                for(int i=0;i<linea.length();i++)                    
                    aux.getSimbolos().add(String.valueOf(linea.charAt(i)));
                setAlfabeto(aux);
                j=false;
            }
            else{
                String aux="";
                Lenguaje len=new Lenguaje();
                for(int i=0;i<linea.length();i++){
                    if(!",".equals(String.valueOf(linea.charAt(i))))
                        aux=aux+""+String.valueOf(linea.charAt(i));                    
                    else{
                        len.getPalabras().add(aux);                        
                        aux="";
                    }
                }        
                len.setNombre("Lenguaje "+(getLenguajes().size()+1));
                getLenguajes().add(len);
            }                
        }
        br.close();
    }
    
    public void guardar() throws IOException{
        FileWriter fw = new FileWriter(new File("archivo.txt"));
        for(String simbolo:getAlfabeto().getSimbolos())
            fw.write(simbolo);        
        for (Lenguaje len:getLenguajes()){
            fw.write("\n");
            for(String palabra:len.getPalabras())
                fw.write(palabra+",");            
        }
        fw.close();
    }
}