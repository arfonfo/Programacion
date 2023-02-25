

/*
PSEUDOCÓDIGO

Programa DobleEntero

Entorno:
    numero, doble son numéricas enteras

Algoritmo:
    
    Escribir "Introduzca el número entero: "

    Leer numero

    Calcular: 

        doble <- numero * 2

    Escribir "El doble del número introducido es: ", doble

Finalgoritmo
*/

package com.arfonfo.dobleentero;

import java.util.Scanner;

/**
 *
 * @author alfon
 */
public class DobleEntero {

    public static void main(String[] args) {
        int numero, doble;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce el número entero:");
        numero = sc.nextInt();
        
        doble = numero*2;
        
        System.out.println("El doble del número introducido es: " + doble);
        
    }
}
