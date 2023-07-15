
package Paquete_Clases;

import Paquete_Excepciones.*;
import Paquete_Interfaces.Vendible;

/**
 *
 * @author alfon
 */
public class Viaje implements Vendible{
    private String origen;
    private String destino;
    private int ndias;
    private double precio;
    
    private final static double IVA = 0.21;
    
    public Viaje(String origen, String destino, int ndias, double precio){
        try {
            if(precio < 0)
                throw new PrecioIncorrecto();
            if(ndias < 0)
                throw new DiasIncorrectos("El número de días no puede ser negativo");
            if(origen.trim().equals("") || destino.trim().equals(""))
                throw new CadenaVacia("Debe introducir tanto el origen como el destino");
            if(origen.trim().equalsIgnoreCase(destino.trim()))
                throw new OrigenDestinoIguales();
            this.ndias = ndias;
            this.precio = precio;
            this.origen = origen.trim();
            this.destino = destino.trim();
        } catch (PrecioIncorrecto | DiasIncorrectos | CadenaVacia | OrigenDestinoIguales e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
        
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        try {
            if(origen.trim().equals("") || destino.trim().equals(""))
                throw new CadenaVacia("Debe introducir tanto el origen como el destino");
            if(origen.trim().equalsIgnoreCase(this.destino.trim()))
                throw new OrigenDestinoIguales();
            this.origen = origen.trim();
        } catch (CadenaVacia | OrigenDestinoIguales e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        try {
            if(origen.trim().equals("") || destino.trim().equals(""))
                throw new CadenaVacia("Debe introducir tanto el origen como el destino");
            if(destino.trim().equalsIgnoreCase(this.origen.trim()))
                throw new OrigenDestinoIguales();
            this.destino = destino.trim();
        } catch (CadenaVacia | OrigenDestinoIguales e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }

    public int getNdias() {
        return ndias;
    }

    public void setNdias(int ndias) {
         try {
            if(ndias < 0)
                throw new DiasIncorrectos("El número de días no puede ser negativo");
            this.ndias = ndias;
        } catch (DiasIncorrectos e) {
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
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static double getIva() {
        return IVA;
    }  
    
    @Override
    public double precioIva(){
        return Math.round((this.getPrecio()+(this.getPrecio()*IVA))*100.0)/100.0;
    }
    
    // No lleva Override porque no extiende la clase abstracta Producto
    // por lo que implementa su propio método verDatos()
    public void verDatos(){
        System.out.println("VIAJE:\n" + "Origen: " + this.origen + "\nDestino: " + this.destino + "\nNúmero de días: " + this.ndias +
                "\nPrecio sin IVA: " + this.precio + "\nIVA: " + IVA*100 + "%" + "\nPrecio con IVA: " + this.precioIva());
    }
    
}
