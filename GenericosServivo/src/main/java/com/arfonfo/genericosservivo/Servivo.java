
package com.arfonfo.genericosservivo;

/**
 *
 * @author alfon
 */
public class Servivo {
    protected String nombre;
    
    public Servivo(String nombre){
        this.nombre=nombre;
    }
    
    @Override
    public String toString(){
        return "Servivo, " + "nombre: " + nombre;
    }
}
