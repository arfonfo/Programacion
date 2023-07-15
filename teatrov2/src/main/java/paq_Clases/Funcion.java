
package paq_Clases;

import java.util.Objects;



/**
 *
 * @author alfon
 */
public class Funcion {
    private String nombre;
    private double precio;
    
    
    public Funcion(){
        this.nombre="";
        this.precio=0;
    }
    
    public Funcion(String n, double p) throws IllegalArgumentException{
        this.nombre= n;
        if(p < 0)
            throw new IllegalArgumentException("El precio no puede ser negativo");
        this.precio = p;
    }
    
    public Funcion(Funcion f) throws IllegalArgumentException{
        this(f.nombre, f.precio);
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public double getPrecio(){
        return this.precio;
    }
    
    public void setNombre(String nuevoNombre){
        this.nombre=nuevoNombre;
    }
    
    public void setPrecio(double nuevoPrecio) throws IllegalArgumentException{
        if(nuevoPrecio < 0)
            throw new IllegalArgumentException("El precio no puede ser negativo");
        this.precio=nuevoPrecio;
    }
    
    @Override
    public String toString(){
        return "La Función " + this.getNombre() + " cuesta " + this.getPrecio() + " €";
    }
    
    public boolean equals(Funcion f) {
        return (this.getNombre().equalsIgnoreCase(f.getNombre()) && (this.getPrecio()==f.getPrecio()));
    }
    
    
    
}
