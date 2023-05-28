

package com.arfonfo.diccionariohashmap;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author alfon
 */
////////////////////////////////////////////
// CLASE DICCIONARIO //

public class DiccionarioHashMap {

    private HashMap <String, String> diccionario;
    
    public DiccionarioHashMap(){
        this.diccionario = new HashMap<String, String>();
    }
    
    public void addEntrada(String palabra, String significado){
        if(!this.contienePalabra(palabra)){
            this.diccionario.put(palabra, significado);
        } else{
            System.out.println("Esa palabra ya existe");
        }
    }
    
    public boolean contienePalabra(String palabra){
        return this.diccionario.containsKey(palabra);
    }
    
    public void listado(){
        if(this.diccionario.isEmpty()){
            System.out.println("El diccionario está vacío");
        } else {
            System.out.println("--DICCIONARIO--");
            for (String clave : this.diccionario.keySet()) {
                System.out.println("Palabra: " + clave);
                System.out.println("\t\t" + this.diccionario.get(clave));
            }
            
            for (Map.Entry<String, String> entrada : this.diccionario.entrySet()) {
                System.out.println("Palabra: " + entrada.getKey());
                System.out.println("\t" + entrada.getValue());
            }
        }
    }
    
}
