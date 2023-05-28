
package com.arfonfo.genericosservivo;

/**
 *
 * @author alfon
 */
public class Gato extends Animal{
    
    public Gato(String nombre){
        super(nombre);
    }
    
    @Override
    public String toString() {
        return "Gato{" +this.nombre+ '}';
    }
}
