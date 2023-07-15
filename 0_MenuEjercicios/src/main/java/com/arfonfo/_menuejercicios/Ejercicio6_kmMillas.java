
package com.arfonfo._menuejercicios;

import java.util.Scanner;


public class Ejercicio6_kmMillas {
    public static void kmMillas(){
        final double millaM = 1.852, millaT = 1.609;
        double km, millas;
        char tipo;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introduce los Kilómetros");
        km = teclado.nextDouble();
        
        System.out.println("¿Deseas realizar la conversión a millas marinas o terrestres?\nMarinas(M)\nTerrestres(T)");
        tipo = teclado.next().charAt(0);
        
        switch (tipo) {
            case 'M':
                millas = km/millaM;
                System.out.println(km + " kilómetros son " + millas + " millas marinas");
                break;
            case 'T':
                millas = km/millaT;
                System.out.println(km + " kilómetros son " + millas + " millas terrestres");
                break;
            default:
                System.out.println("La letra introducida no es correcta");
        }
    }
}
