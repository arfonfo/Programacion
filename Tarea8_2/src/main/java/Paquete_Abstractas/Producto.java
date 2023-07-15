
package Paquete_Abstractas;

import Paquete_Interfaces.*;
import Paquete_Excepciones.*;

/**
 *
 * @author alfon
 */
// La clase abstracta no tiene porqué implementar los métodos
// de la interfaz que implementa
public abstract class Producto implements Vendible{
    private String nombre;
    private double precio;

    public Producto(String nombre, double precio){
        try {
            if(precio < 0)
                throw new PrecioIncorrecto();
            if(nombre.trim().equals(""))
                throw new CadenaVacia();
            this.precio = precio;
            this.nombre = nombre.trim();
        } catch (PrecioIncorrecto | CadenaVacia e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
        
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        try {
            if(nombre.trim().equals(""))
                throw new CadenaVacia();
            this.nombre = nombre.trim();
        } catch (CadenaVacia e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        try {
            if(precio < 0)
                throw new PrecioIncorrecto();
            this.precio = precio;
        } catch (PrecioIncorrecto e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e){
            System.out.println("Error " + e.getMessage());
        }
    }
    
    @Override
    public abstract double precioIva();
    

    
    public abstract void verDatos();
}
