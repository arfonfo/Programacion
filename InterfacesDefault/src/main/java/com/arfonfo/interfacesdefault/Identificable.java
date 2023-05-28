
package com.arfonfo.interfacesdefault;

/**
 *
 * @author alfon
 */
public interface Identificable<T> {
    
    public default void mostrarIdentificacion(){
        System.out.println(this.toString());
    }
    
    
}
