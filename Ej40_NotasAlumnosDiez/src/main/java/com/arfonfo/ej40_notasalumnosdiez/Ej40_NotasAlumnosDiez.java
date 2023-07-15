

package com.arfonfo.ej40_notasalumnosdiez;

import java.util.Scanner;


public class Ej40_NotasAlumnosDiez {

    public static void main(String[] args) {
        int nota, salir=0, notaDiez = 0;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Para salir del programa introduce -1");
        
        do {
            System.out.println("Introduce la nota del alumno ");
            nota = teclado.nextInt();

            if(nota ==-1){
                break;
            }
            salir++;
            if(nota == 10)
                notaDiez++;
            
        } while(nota!=-1);
        
        if(salir!=0) {
            if(notaDiez == 0){
                System.out.println("Ningún alumno a sacado un 10");

            } else {
                System.out.println(notaDiez + " alumno/s ha/n sacado un 10");
            }
        } else {
            System.out.println("No ha introducido ninguna nota");
        }

        
    }
}
