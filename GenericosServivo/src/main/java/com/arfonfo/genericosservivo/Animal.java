
package com.arfonfo.genericosservivo;

/**
 *
 * @author alfon
 */
public class Animal extends Servivo{
    
    public Animal(String nombre){
        super(nombre);
    }
    
    @Override
    public String toString() {
        return "Animal{" + this.nombre + '}';
    }
}
