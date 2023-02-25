
package com.arfonfo._menuejercicios;

import java.util.Scanner;


public class Ejercicio5_Energia {
    public static void masaEnergia(){
        final double C = 299729458;
        double masa, energia;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introduce la masa en Kg del cuerpo: ");
        masa = teclado.nextDouble();
        
        energia = masa*Math.pow(C, 2);
        
        System.out.println("Según la fórmula E=mc2, la energía del cuerpo es " + energia);
    }
}
