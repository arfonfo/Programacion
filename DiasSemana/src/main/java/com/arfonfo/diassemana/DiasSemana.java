
package com.arfonfo.diassemana;

import java.util.Scanner;


public class DiasSemana {

    public static void main(String[] args) {
        int dia;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introduce el número del día de la semana: ");
        dia = teclado.nextInt();
        
        if(dia >= 1 && dia <= 7){
            switch (dia) {
                case 1:
                    System.out.println("LUNES");
                    break;
                case 2:
                    System.out.println("MARTES");
                    break;
                case 3:
                    System.out.println("MIÉRCOLES");
                    break;
                case 4:
                    System.out.println("JUEVES");
                    break;
                case 5:
                    System.out.println("VIERNES");
                    break;
                case 6:
                    System.out.println("SÁBADO");
                    break;
                case 7:
                    System.out.println("DOMINGO");
                    break;
                default:
                    throw new AssertionError();
            }
        } else {
            System.out.println("El valor introducido no está entre 1 y 7");
        }
        
        
    }
}
