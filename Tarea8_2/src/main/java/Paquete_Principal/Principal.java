
package Paquete_Principal;

import Paquete_Clases.*;
import Paquete_Interfaces.Vendible;
import java.util.ArrayList;
/**
 *
 * @author alfon
 */
public class Principal {
    
    public static void main(String[] args) {
        try {
            
            Alimentacion leche = new Alimentacion("Leche", 0.4);
            Alimentacion huevos = new Alimentacion("Huevos", 0.35);

            Ropa blusaRosa = new Ropa("Blusa Rosa", 18);
            Ropa pantalon = new Ropa("Pantalón", 20);

            Viaje murciaMadrid = new Viaje("Murcia", "Madrid", 3, 400);

            Carrito carroCompra = new Carrito();
            
            Carrito<Ropa> mercadona = new Carrito<Ropa>();
            mercadona.addCarrito(pantalon);
            
            // Método estático que imprime cualquier carrito que derive de Vendible
            Carrito.muestraCarritoStatic(mercadona);
            
            /////// ejemplo ///////////////
            Vendible v = new Ropa("ropa", 200);
            v.mostrar();
            Vendible.metodoStatico();
            ///////////////////////

            carroCompra.addCarrito(leche);
            carroCompra.addCarrito(huevos);
            carroCompra.addCarrito(blusaRosa);
            carroCompra.addCarrito(pantalon);
            carroCompra.addCarrito(murciaMadrid);
            
            System.out.println("");
            System.out.println("****************************************************************");
            System.out.println("");

            carroCompra.muestraCarrito();
            
            System.out.println("");
            System.out.println("****************************************************************");
            System.out.println("");

            System.out.println("El precio total del carrito es: " + carroCompra.precioTotalCarrito() + "€");
            
            System.out.println("");
            System.out.println("****************************************************************");
            System.out.println("");

            carroCompra.mostrarCarritoViajes();
            
            System.out.println("");
            System.out.println("****************************************************************");
            System.out.println("");

            carroCompra.mostrarCarritoDestinoViajes();

            
        } catch (Exception e) {
            System.out.println("Error. " + e.getMessage());
        }
        
        
        
    }
}
