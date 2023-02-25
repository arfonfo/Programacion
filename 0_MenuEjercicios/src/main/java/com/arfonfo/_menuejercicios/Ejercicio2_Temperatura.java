
package com.arfonfo._menuejercicios;

import java.util.Scanner;


public class Ejercicio2_Temperatura {
    public static void calculoTemperatura () {
        double celsius, farenheit;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introduce la temperatura a transformar de Celsius a Farenheit: ");
        celsius = teclado.nextDouble();
        
        farenheit = ((celsius*9)/5) + 32;
        
        System.out.println("La temperatura en Farenheit es " + farenheit);
    }
}
