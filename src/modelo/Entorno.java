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
    
    public Lenguaje buscarLenguaje(String cadena){
        Lenguaje lenguaje = null;
        for(Lenguaje l:lenguajes){
            if(l.getNombre().equals(cadena)){
                lenguaje=l;
                break;
            }
        }
        return lenguaje;
    }
    
    public Lenguaje union(Lenguaje len1,Lenguaje len2){
        Lenguaje resultado=new Lenguaje();
        resultado.setPalabras(copiar(len1,resultado));        
        for(String palabra:len2.getPalabras()){
            if(!resultado.pertenece(palabra))
                resultado.agregarPalabra(palabra);
        }
        if(resultado.getPalabras().isEmpty())
            resultado.agregarPalabra("Φ");
        return resultado;
    }
    
    public Lenguaje interseccion(Lenguaje len1,Lenguaje len2){
        Lenguaje resultado=new Lenguaje();
        for(String palabra:len1.getPalabras()){
            if(len2.pertenece(palabra))
                if(!resultado.pertenece(palabra))
                    resultado.agregarPalabra(palabra);
        }
        if(resultado.getPalabras().isEmpty())
            resultado.agregarPalabra("Φ");     
        return resultado;
    }
    
    public Lenguaje diferencia(Lenguaje len1,Lenguaje len2){
        Lenguaje resultado=new Lenguaje();
        for(String palabra:len1.getPalabras()){
            if(!len2.pertenece(palabra))
                if(!resultado.pertenece(palabra))
                    resultado.agregarPalabra(palabra);
        }
        if(resultado.getPalabras().isEmpty())
            resultado.agregarPalabra("Φ");  
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
               palabra=p1.concat(p2);
               if(!resultado.pertenece(palabra))
                   resultado.agregarPalabra(palabra);
           }
       }
       return resultado;
    }
    
    public Lenguaje potenciacion(Lenguaje len,int potencia){
        Lenguaje resultado=new Lenguaje();
        if(potencia==0)
            resultado.agregarPalabra("λ");            
        if(potencia==1)
            resultado.setPalabras(copiar(len,resultado));
        if(potencia>1){
            Lenguaje aux=new Lenguaje();
            aux.setPalabras(copiar(len,aux));            
            String palabra=null;
            for(int i=1;i<potencia;i++){                
                for(String p1:aux.getPalabras()){                    
                    for(String p2:len.getPalabras()){
                        palabra = p1.concat(p2);                                 
                        if(!resultado.pertenece(palabra))
                            resultado.agregarPalabra(palabra);
                    }                        
                }
                aux.setPalabras(actualizarAux(resultado).getPalabras());
            }
        }
        return resultado;
    }
    
    private Lenguaje actualizarAux(Lenguaje resultado){
        Lenguaje aux=new Lenguaje();
        aux.setPalabras(copiar(resultado,aux));        
        return aux;
    }    
    
    public Lenguaje estrella(String tipo, Lenguaje len, int potencia){
        Lenguaje resultado=new Lenguaje();        
        Lenguaje aux=new Lenguaje();  
        if("kleene".equals(tipo))
            resultado.agregarPalabra("λ");            
        for(int i=1;i<=potencia;i++){
            for(String palabra:union(resultado, potenciacion(len, i)).getPalabras()){
                aux.agregarPalabra(palabra);                
            }
            resultado.getPalabras().clear();
            resultado.setPalabras(copiar(aux,resultado));            
            aux.getPalabras().clear();
        }
        return resultado;
    }
    
    public Lenguaje inversa(Lenguaje len){
        Lenguaje resultado=new Lenguaje();
        String palabra="";
        for(String p:len.getPalabras()){                        
            for(int i=p.length()-1;i>=0;i--){
                palabra=palabra.concat(String.valueOf(p.charAt(i)));                            
            }
            resultado.agregarPalabra(palabra);
            palabra="";
        }
        return resultado;
    }
    
    private ArrayList<String> copiar(Lenguaje len1, Lenguaje len2){
        len2.setPalabras((ArrayList<String>)len1.getPalabras().clone());        
        return len2.getPalabras();
    }
    
    public void abrir() throws Exception{
        BufferedReader br=new BufferedReader(new FileReader("archivo.txt"));
        String linea;        
        boolean j=true;
        while((linea=br.readLine())!=null){
            if(j){    
                Alfabeto aux=new Alfabeto();
                for(int i=0;i<linea.length();i++)  
                    aux.agregarSimbolo(String.valueOf(linea.charAt(i)));                    
                alfabeto=aux;
                j=false;
            }
            else{
                String aux="";
                Lenguaje len=new Lenguaje();
                for(int i=0;i<linea.length();i++){
                    if(!",".equals(String.valueOf(linea.charAt(i))))
                        aux=aux+""+String.valueOf(linea.charAt(i));                    
                    else{
                        len.agregarPalabra(aux);                        
                        aux="";
                    }
                }        
                len.setNombre("Lenguaje "+(lenguajes.size()+1));
                agregarLenguaje(len);                
            }                
        }
        br.close();
    }
    
    public void guardar() throws IOException{
        FileWriter fw = new FileWriter(new File("archivo.txt"));
        for(String simbolo:getAlfabeto().getSimbolos())
            fw.write(simbolo);        
        for (Lenguaje len:lenguajes){
            fw.write("\n");
            for(String palabra:len.getPalabras())
                fw.write(palabra+",");            
        }
        fw.close();
    }
    
    public static void agregarAlfabeto(Alfabeto a){
        alfabeto=a;
    }
    
    public static void agregarLenguaje(Lenguaje len){
        lenguajes.add(len);
    }
    
    public static Alfabeto getAlfabeto() {
        return alfabeto;
    }

    public static ArrayList<Lenguaje> getLenguajes() {
        return lenguajes;
    }
}