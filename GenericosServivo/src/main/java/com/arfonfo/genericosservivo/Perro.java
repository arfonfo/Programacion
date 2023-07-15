
package com.arfonfo.genericosservivo;

/**
 *
 * @author alfon
 */
public class Perro extends Animal{
    
    public Perro(String nombre){
        super(nombre);
    }
    
    @Override
    public String toString() {
        return "Perro{" +this.nombre+ '}';
    }
}
