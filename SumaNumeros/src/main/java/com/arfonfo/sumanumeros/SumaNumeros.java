/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.arfonfo.sumanumeros;

import java.util.Scanner;

/**
 *
 * @author alfon
 */
public class SumaNumeros {

    public static void main(String[] args) {
        int a, b ,c;
        Scanner teclado = new Scanner(System.in);
        
        
        System.out.println("Introduce el primer número: ");
        a = teclado.nextInt();
        
        System.out.println("Introduce el segundo número: ");
        b = teclado.nextInt();
        
        System.out.println("Introduce el tercer número: ");
        c = teclado.nextInt();
        
        if((a == b + c) || (b == a + c) || (c == b+a)) {
            System.out.println("Sí, uno de ellos es la suma de los otros");
        } else {
            System.out.println("Ningún número coincide con la suma de los otros");
        }
        
        
    }
}
