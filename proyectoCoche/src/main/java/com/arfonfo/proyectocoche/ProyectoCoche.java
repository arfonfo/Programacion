
package com.arfonfo.proyectocoche;

/**
 *
 * @author alfon
 */
public class ProyectoCoche {

    public static void main(String[] args) {
        
        Coche c1 = new Coche("Ford", "Focus", "Gris", "Diesel", "Manual", 4, 1000);
        Coche c2 = new Coche("FoRd", "FocUS", "gRIS", "Diesel", "Manual", 4, 1000);
        c1.setPrecio(-2000);
        c2.setCambio("automatico");
        System.out.println(c1.toString());
        System.out.println(c2.toString());
        
        System.out.println(c1.equals(c2) ? "Son iguales" : "Son diferentes");
    }
}
