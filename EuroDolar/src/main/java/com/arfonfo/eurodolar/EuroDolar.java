/*

PSEUDOCÓDIGO

Programa EuroDolar

Entorno:
    euros, cotizacion son numéricas de coma flotante

Algoritmo:

    Escribir "Introduce una cantidad de euros: "
    
    Leer euros

    Escribir "Introduce la cotización del Euro en Dólares: "

    Leer cotización

    Escribir "La cantida de  ", euros " euros se corresponde con ", (euros*cotizacion) " dólares"


Finalgoritmo

*/

package com.arfonfo.eurodolar;

import java.util.Scanner;


public class EuroDolar {

    public static void main(String[] args) {
        
        double euros, cotizacion;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce una cantidad de euros: ");
        euros = sc.nextDouble();
        
        System.out.println("Introduce la cotización del Euro en Dólares: ");
        cotizacion = sc.nextDouble();
        
        System.out.println("La cantidad de " + euros + " euros se corresponde con " + (euros*cotizacion) + " dólares");       
        
    }
}
