
package com.arfonfo.parimpar;

import java.util.Scanner;


public class ParImpar {

    public static void main(String[] args) {
        int numero;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introduce un número entero: ");
        numero = teclado.nextInt();
        
        if (numero%2 == 0) {
            System.out.println("El número es par");
        } else {
            System.out.println("El número es impar");
        }
    }
}
