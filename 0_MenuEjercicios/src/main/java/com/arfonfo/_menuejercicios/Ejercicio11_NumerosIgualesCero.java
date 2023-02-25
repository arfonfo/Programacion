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
public class Ejercicio11_NumerosIgualesCero {
    public static int IgualesCero (){
        int numero, contadorCeros =0;
        Scanner teclado = new Scanner(System.in);
        
        for (int i = 1; i <= 10; i++) {
            System.out.println("Introduce el número " + i);
            numero = teclado.nextInt();
            
            if(numero == 0) contadorCeros++;
        }
        
        
        return contadorCeros;
    }
}
