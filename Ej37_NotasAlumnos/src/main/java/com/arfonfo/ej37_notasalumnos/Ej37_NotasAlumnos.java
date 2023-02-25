
package com.arfonfo.ej37_notasalumnos;

import java.util.Scanner;


public class Ej37_NotasAlumnos {

    public static void main(String[] args) {
        int nota, sumaNotas = 0, aprobados = 0, suspensos = 0;
        double notaMedia;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Para salir del programa introduce -1");
        
        do {
            System.out.println("Introduce la nota del alumno ");
            nota = teclado.nextInt();

            if(nota ==-1){
                break;
            }
            sumaNotas = nota + sumaNotas;
            if(nota >= 5)
                aprobados++;
            else
                suspensos++;
            
        } while(nota!=-1);
        
        if(sumaNotas == 0){
            System.out.println("No ha introducido ninguna nota");
            
        } else {
            System.out.println("Hay " + aprobados + " aprobados");
            System.out.println("Hay " + suspensos + " suspensos");

            notaMedia = (double) sumaNotas/(aprobados+suspensos);
            System.out.println("La media de las notas es " + notaMedia);
        }
        
    }
}
