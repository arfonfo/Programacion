
package com.arfonfo._menuejercicios;

import java.util.Scanner;


public class Ejercicio1_Perimetro {
    public static void calculoPerimetro(){
        int base, altura, perimetro;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introduzca la base del rectángulo");
        base = teclado.nextInt();
        
        System.out.println("Introduzca la altura del rectángulo");
        altura = teclado.nextInt();
        
        perimetro = (base + altura)*2;
        
        System.out.println("El perímetro del rectángulo es " + perimetro);
        
    }
}
