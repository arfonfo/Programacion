


/*
PSEUDOCÓDIGO

Programa AreaRectangulo

Entorno:
    base, altura, Area son numéricas enteras

Algoritmo:
    
    Escribir "Introduzca el valor de la base: "

    Leer base

    Escribir "Introduzca el valor de la altura: "

    Leer altura

    Calcular:

        Area <- base * altura

    Escribir "El área del rectángulo es: ", Area

Finalgoritmo
*/

package com.arfonfo.arearectangulo;

import java.util.Scanner;

/**
 *
 * @author alfon
 */
public class AreaRectangulo {

    public static void main(String[] args) {
        int base, altura, area;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce la base del rectángulo: ");
        
        base = sc.nextInt();
        
        System.out.println("Introduce la altura del rectángulo: ");
        
        altura = sc.nextInt();
        
        area = base * altura;
        
        System.out.println("El área del rectángulo es: " + area);
    }
}
