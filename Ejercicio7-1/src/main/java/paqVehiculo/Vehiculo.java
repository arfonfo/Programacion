
package paqVehiculo;

import paqFecha.Fecha;
/**
 *
 * @author alfon
 */
public class Vehiculo {
    private String modelo;
    private int precio;
    private Fecha fechaCompra;

    public Vehiculo() {
        this.modelo = "";
        this.precio = 0;
        this.fechaCompra = new Fecha();
    }
    
    public Vehiculo(String mod, int p, int d, int m, int a){
        this.modelo = mod;
        this.setPrecio(p);
        this.fechaCompra = new Fecha(d, m, a);
    }
    
    public Vehiculo(String mod, int p, Fecha f){
        this.modelo = mod;
        this.setPrecio(p);
        this.fechaCompra = f;
    }
    
    public Vehiculo(Vehiculo v){
        this(v.getModelo(), v.getPrecio(), v.getFechaCompra());
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        try {
            if(precio < 0)
            throw new PrecioIncorrecto("El precio no puede ser negativo");
        this.precio = precio;
        } catch (PrecioIncorrecto e) {
            System.out.println("Error " + e);
        } catch(Exception e){
            System.out.println("Algo ha fallado");
        }
    }

    public Fecha getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(Fecha fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    @Override
    public String toString() {
        return "Vehiculo\n" + "modelo= " + modelo + "\nprecio= " + precio + "\nfechaCompra= " + fechaCompra.toString();
    }

    public boolean equals(Vehiculo v) {
        return (this.modelo.equals(v.modelo) && (this.precio==v.precio) && (this.fechaCompra.equals(v.fechaCompra)));
    }
    
    public void setVehiculo(String mod, int p, int d, int m, int a){
        this.modelo = mod;
        this.setPrecio(p);
        this.fechaCompra = new Fecha(d, m, a);
    }
    
    public void setVehiculo(String mod, int p, Fecha f){
        this.modelo = mod;
        this.setPrecio(p);
        this.fechaCompra = f;
    }
    public void setVehiculo(Vehiculo v){
        this.setVehiculo(v.getModelo(), v.getPrecio(), v.getFechaCompra());
    }
    
}
