
package paqVehiculo;

import paqFecha.Fecha;
import paqExcepciones.*;

/**
 *
 * @author alfon
 */
public class Vehiculo {
    private String modelo;
    private int precio;
    private Fecha fechaCompra;
    
    public Vehiculo(){
        this.modelo="";
        this.precio = 0;
        this.fechaCompra = new Fecha();
    }
    
    public Vehiculo(String modelo, int precio, int dia, int mes, int anyo) {
        try {
            if(precio < 0)
                throw new PrecioIncorrecto();
            this.precio = precio;
            this.modelo = modelo;
            this.fechaCompra = new Fecha(dia, mes, anyo);
        } catch (PrecioIncorrecto e) {
            System.out.println("Error: " + e.getMessage());
        }
        
    }
    

    public Vehiculo(String modelo, int precio, Fecha fechaCompra) {
        this.modelo = modelo;
        this.precio = precio;
        this.fechaCompra = fechaCompra;
    }
    
    public Vehiculo(Vehiculo v){
        this(v.modelo, v.precio, v.fechaCompra);
    }
    
    
    
    
    
}
