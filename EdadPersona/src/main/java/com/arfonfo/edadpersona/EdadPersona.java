

package com.arfonfo.edadpersona;

import java.io.*;
import java.util.Scanner;

/**
 *
 * @author alfon
 */
public class EdadPersona {

    public static void main(String[] args) {
        int edad;
        boolean correcto = false;
        Scanner teclado = new Scanner(System.in);
        
            try {
                System.out.println("Introduce la edad de la persona: ");
                edad = teclado.nextInt();

                correcto = true;
                System.out.println((edad >= 0 && edad <= 120) ? "Edad introducida correctamente" : "La edad introducida no es correcta");

            } catch (Exception e) {
                System.out.println("No has introducido un número.");
            }
        
    }
}
