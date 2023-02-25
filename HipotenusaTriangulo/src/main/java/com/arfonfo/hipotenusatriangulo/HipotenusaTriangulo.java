
/*
PSEUDOCÓDIGO

Programa HipotenusaTriangulo

Entorno:
    cateto1, cateto2 son numéricas enteras 
    hipotenusa es numérica de coma flotante

Algoritmo:
    
    Escribir "Introduzca el valor del primer cateto: "

    Leer cateto1

    Escribir "Introduzca el valor del segundo cateto: "

    Leer cateto2

    Calcular: 

        hipotenusa <- RaizCuadrada((cateto1^2) + (cateto2^2))

    Escribir "El valor de la hipotenusa del triángulo es: ", hipotenusa

Finalgoritmo
*/

package com.arfonfo.hipotenusatriangulo;

import java.util.Scanner;

/**
 *
 * @author alfon
 */
public class HipotenusaTriangulo {

    public static void main(String[] args) {
        double hipotenusa;
        int cateto1, cateto2;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduzca el valor del primer cateto: ");
        cateto1 = sc.nextInt();
        
        System.out.println("Introduzca el valor del segundo cateto: ");
        cateto2 = sc.nextInt();
        
        
        hipotenusa = Math.sqrt((Math.pow(cateto1, 2)+Math.pow(cateto2, 2)));
        
        System.out.println("El valor de la hipotenusa del triángulo es: " + hipotenusa);
    }
}
