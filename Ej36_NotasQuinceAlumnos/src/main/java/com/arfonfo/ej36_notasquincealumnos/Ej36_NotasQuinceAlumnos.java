
package com.arfonfo.ej36_notasquincealumnos;

import java.util.Scanner;


public class Ej36_NotasQuinceAlumnos {

    public static void main(String[] args) {
        int nota, sumaNotas = 0, aprobados = 0, suspensos = 0;
        double notaMedia;
        Scanner teclado = new Scanner(System.in);
        
        
        for (int i = 1; i <= 15; i++) {
            System.out.println("Introduce la nota del alumno " + i);
            nota = teclado.nextInt();
            
            sumaNotas = nota + sumaNotas;
            
            if(nota >= 5)
                aprobados++;
            else
                suspensos++;
        }
        
        System.out.println("Hay " + aprobados + " aprobados");
        System.out.println("Hay " + suspensos + " suspensos");
        
        notaMedia = (double) sumaNotas/15;
        System.out.println("La media de las notas es " + notaMedia);
    }
}
