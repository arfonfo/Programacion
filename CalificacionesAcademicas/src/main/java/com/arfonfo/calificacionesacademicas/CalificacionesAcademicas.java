

package com.arfonfo.calificacionesacademicas;

import java.util.Scanner;


public class CalificacionesAcademicas {

    public static void main(String[] args) {
        boolean salir = true;
        char letra;
        Scanner teclado = new Scanner(System.in);
        
        do{
            System.out.println("Indica qué calificación ha sacado el alumno: A, B, C, D ó E\nEscriba S para salir");
            letra = teclado.next().charAt(0);
            
            switch (letra) {
                case 'A':
                    System.out.println("La nota del alumno está entre 9 ó 10");
                    break;
                case 'B':
                    System.out.println("La nota del alumno está entre 7 ó 8");
                    break;
                case 'C':
                    System.out.println("La nota del alumno está entre 5, 6 ó 7");
                    break;
                case 'D':
                    System.out.println("La nota del alumno está entre 3 ó 4");
                    break;
                case 'E':
                    System.out.println("La nota del alumno está entre 2, 1 ó 0");
                    break;
                case 'S':
                    System.out.println("Saliendo del programa");
                    salir = false;
                    break;
                default:
                    System.out.println("No ha introducido ninguna de las letras indicadas.");
            }
            
            
        } while(salir);
        
        
        
    }
}
