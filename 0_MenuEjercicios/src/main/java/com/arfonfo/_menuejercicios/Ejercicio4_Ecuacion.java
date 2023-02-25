
package com.arfonfo._menuejercicios;

import java.util.Scanner;


public class Ejercicio4_Ecuacion {
    public static void ecuacionPrimergrado (){
        double a, b, x;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introduce el valor de a: ");
        a = teclado.nextDouble();
        System.out.println("Introduce el valor de b: ");
        b = teclado.nextDouble();
        
        if(a == 0 && b == 0){
            System.out.println("Solución indeterminada");
        } else if(a == 0 && b !=0) {
            System.out.println("La solución es imposible");
        } else {
            x = -b/a;
            System.out.println("La solución es " + x);
        }
    }
}
