
package com.arfonfo.ej33_notasaprobadossuspensos;

import java.util.Scanner;


public class Ej33_NotasAprobadosSuspensos {

    public static void main(String[] args) {
        double aprobados = 0, suspensos = 0;
        double porcAprobados, porcSuspensos;
        int nota;
        Scanner teclado = new Scanner(System.in);
        
        for (int i = 1; i <= 15; i++) {
            System.out.println("Introduce la nota del alumno " + i);
            nota = teclado.nextInt();
            
            if(nota >= 5)
                aprobados++;
            else
                suspensos++;
        }
        
        porcAprobados = (aprobados/15)*100;
        porcSuspensos = (suspensos/15)*100;
        
        System.out.println("El porcentaje de aprobados es " + porcAprobados + ", y el de suspensos es " + porcSuspensos);
    }
}
