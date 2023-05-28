
package Paquete_Clases;

import Paquete_Abstractas.Producto;

/**
 *
 * @author alfon
 */
public class Ropa extends Producto{
    private final static double IVA = 0.1;
    
    public Ropa(String nombre, double precio){
        super(nombre, precio);
    }
    
    public double getIVA(){
        return IVA;
    }
    

    @Override
    public double precioIva(){
        return Math.round((this.getPrecio()+(this.getPrecio()*IVA))*100.0)/100.0;
    }
    
    @Override
    public void verDatos(){
        System.out.println("Nombre: " + this.getNombre() + "\nPrecio sin IVA: " + this.getPrecio() + "\nIVA: " + IVA*100 + "%" + "\nPrecio con IVA: " + this.precioIva());
    }
    
}
