
package com.arfonfo._menuejercicios;

import java.util.Scanner;


public class Ejercicio7_IMC {
    public static void imc() {
        double imc, peso, cms;
        Scanner teclado = new Scanner(System.in);
        
        for (int i = 1; i <= 5; i++) {
            System.out.println("Introduce el peso en Kgrs de la persona " + i);
            peso = teclado.nextInt();
            
            System.out.println("Introduce la altura en cms de la persona " + i);
            cms = teclado.nextInt();
            
            System.out.println(Math.pow((cms/100), 2));
            
            imc = peso/(Math.pow((cms/100), 2));
            
            System.out.println("El IMC de la persona " + i + " es " + imc);
            
            if(imc < 19){
                System.out.println("Está por debajo del peso normal");
            } else if (imc > 19 && imc < 25) {
                System.out.println("Se encuentra dentro del peso normal");
            } else if (imc >= 25 && imc <= 30) {
                System.out.println("Está por encima del peso normal");
            } else {
                System.out.println("Sufre de obesidad"); 
            }
        }
    }
}
