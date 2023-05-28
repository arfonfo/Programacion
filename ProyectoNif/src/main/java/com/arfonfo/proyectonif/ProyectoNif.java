
package com.arfonfo.proyectonif;

/**
 *
 * @author alfon
 */
public class ProyectoNif {

    public static void main(String[] args) {
        
        String nombre = "alfon";
        String apellido = "sanchez";
        
        String nombreCompleto = nombre + apellido;
        
        char letra = nombreCompleto.charAt(nombreCompleto.length()-1);
        
        System.out.println(letra);
        
        System.out.println(nombreCompleto);
        
    }
}
