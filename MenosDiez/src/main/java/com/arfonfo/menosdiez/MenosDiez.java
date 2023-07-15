/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.arfonfo.menosdiez;

import java.util.Scanner;

/**
 *
 * @author alfon
 */
public class MenosDiez {

    public static void main(String[] args) {
        int numero;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introduce un número entero positivo o negativo: ");
        numero = teclado.nextInt();
        
        if(numero == -10){
            System.out.println("El número introducido es igual a " + numero);
        } else {
            System.out.println("El número es diferente de -10");
        }
        
    }
}
