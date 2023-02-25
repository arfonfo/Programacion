/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.arfonfo._menuejercicios;

import java.util.Scanner;

/**
 *
 * @author alfon
 */
public class Ejercicio12_NumerosIgualesCero2 {
    public static int NumerosCero() {
        int numero, contadorCeros =0;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Para terminar de introducir números escribe -1");
        
        do {            
            System.out.println("Introduce un número ");
            numero = teclado.nextInt();
            
            if(numero == 0) contadorCeros++;
        } while (numero != -1);
        
        return contadorCeros;
    }
}
