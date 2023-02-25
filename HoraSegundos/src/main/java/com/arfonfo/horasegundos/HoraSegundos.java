
/*
PSEUDOCÓDIGO

Programa HorasSegundos

Entorno:
    
    hora, minutos, segundos, totalSegundos son numéricas enteras

Algoritmo:

    Escribir "Introduzca la hora: "

    Leer hora

    Escribir "Introduzca los minutos: "

    Leer minutos

    Escribir "Introduzca los segundos: "

    Leer segundos

    Calcular:

        totalSegundos <- (hora*3600) + (minutos*60) + segundos

        Escribir "El total de segundos es: ", totalSegundos

Finalgoritmo

*/

package com.arfonfo.horasegundos;

import java.util.Scanner;

/**
 *
 * @author alfon
 */
public class HoraSegundos {

    public static void main(String[] args) {
        int hora, minutos, segundos, totalSegundos;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduzca las horas: ");
        hora = sc.nextInt();
        
        System.out.println("Introduzca los minutos: ");
        minutos = sc.nextInt();
        
        System.out.println("Introduzca los segundos: ");
        segundos = sc.nextInt();
        
        totalSegundos = (hora*3600) + (minutos*60) + segundos;
        
        System.out.println("El total de segundos es: " + totalSegundos);
        
    }
}
