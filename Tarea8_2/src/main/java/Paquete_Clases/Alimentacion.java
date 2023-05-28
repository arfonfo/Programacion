
package Paquete_Clases;

import Paquete_Abstractas.*;

/**
 *
 * @author alfon
 */
public class Alimentacion extends Producto{
    private final static double IVA = 0.04;
    
    public Alimentacion(String nombre, double precio){
        super(nombre, precio);
    }

    public double getIva() {
        return IVA;
    }
    
    
    // Override del método que hereda de la interfaz Vendible
    // la hereda de la clase Producto
    @Override
    public double precioIva(){
        return Math.round((this.getPrecio()+(this.getPrecio()*IVA))*100.0)/100.0;
    }
    
    // Método que hereda de la clase abstracta Producto
    @Override
    public void verDatos(){
        System.out.println("Nombre: " + this.getNombre() + "\nPrecio sin IVA: " + this.getPrecio() + "\nIVA: " + IVA*100 + "%" + "\nPrecio con IVA: " + this.precioIva());
    }
    
    
}
