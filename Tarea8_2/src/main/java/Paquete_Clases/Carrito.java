
package Paquete_Clases;

import Paquete_Abstractas.Producto;
import Paquete_Interfaces.*;
import java.util.ArrayList;

/**
 *
 * @author alfon
 */
// Con esto podemos hacer un carrito de lo que queramos, no solo de Vendible
public class Carrito <T extends Vendible> {
    private ArrayList<T> listaCarrito;
    
    public Carrito(){
        this.listaCarrito = new ArrayList<T>();
    }

    public ArrayList<T> getListaCarrito() {
        return listaCarrito;
    }

    public void setListaCarrito(ArrayList<T> listaCarrito) {
        this.listaCarrito = listaCarrito;
    }

    
    public void addCarrito(T v){
        
        if(v instanceof Alimentacion){
            System.out.println("Ha añadido un producto de alimentación al carrito");
        } else if(v instanceof Ropa){
            System.out.println("Ha añadido ropa al carrito");
        } else if(v instanceof Viaje){
            System.out.println("Ha añadido un viaje al carrito");
        }
        
        this.listaCarrito.add(v);
    }
    
    public static void muestraCarritoStatic(Carrito<? extends Vendible> lc){
        for (Vendible v : lc.getListaCarrito()) {
            if(v instanceof Producto) ((Producto)v).verDatos();
            if(v instanceof Viaje) ((Viaje)v).verDatos();
        }
    }
    
    public void muestraCarrito(){
        if(this.listaCarrito.isEmpty()){
            System.out.println("No ha añadido ningún producto a su carrito");
        }else{
            System.out.println("Los productos añadidos al carrito son los siguientes: ");
            for(Vendible v : this.listaCarrito){
                System.out.println("");
                if(v instanceof Viaje) ((Viaje) v).verDatos();
                else ((Producto) v).verDatos();
            }
//            for (int i = 0; i < this.listaCarrito.size(); i++) {
//            System.out.println("");
//            if(this.listaCarrito.get(i) instanceof Viaje)
//                ((Viaje)this.listaCarrito.get(i)).verDatos();
//            else
//                ((Producto)this.listaCarrito.get(i)).verDatos();
//            }
        }
    }
    
    public double precioTotalCarrito(){
        double precioTotal=0;
        
        for(Vendible v : this.listaCarrito)
            precioTotal += v.precioIva();
        
//        for (int i = 0; i < this.listaCarrito.size(); i++) {
//            precioTotal += this.listaCarrito.get(i).precioIva();
//        }
        
        return precioTotal;
    }
    
    
    public void mostrarCarritoViajes(){
        System.out.println("Los viajes incluidos en el carrito son los siguientes: ");
//        ArrayList<Viaje> viajes = new ArrayList();
//        for (Vendible v : listaCarrito) {
//            if(v instanceof Viaje) viajes.add((Viaje)v);
//        }
//        for (Viaje viaje : viajes) {
//            viaje.verDatos();
//        }
        boolean hayViajes = false;
        for (int i = 0; i < this.listaCarrito.size(); i++) {
            if(this.listaCarrito.get(i) instanceof Viaje){
                ((Viaje)this.listaCarrito.get(i)).verDatos();
                hayViajes=true;
            }
        }
        if(!hayViajes)
            System.out.println("No ha añadido ningún viaje al carrito.");
    }
    
    public void mostrarCarritoDestinoViajes(){
        System.out.println("Los destinos de los viajes son los siguientes: ");
        boolean hayDestino = false;
        for (int i = 0; i < this.listaCarrito.size(); i++) {
            if(this.listaCarrito.get(i) instanceof Viaje){
                System.out.println(((Viaje)this.listaCarrito.get(i)).getDestino());
                hayDestino=true;
            }
        }
         if(!hayDestino)
            System.out.println("No hay ningún destino porque no ha añadido ningún viaje al carrito.");
    }
    
    
    
}
