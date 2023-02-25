
package com.arfonfo._menuejercicios;

import java.util.Scanner;


public class Ejercicio3_Cilindro {
    public static void radioVolumen (){
        double radio, altura, area, volumen;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introduce el radio del cilindro");
        radio = teclado.nextDouble();
        
        System.out.println("Introduce la altura del cilindro");
        altura = teclado.nextDouble();
        
        volumen = Math.PI*Math.pow(radio, 2)*altura;
        area = 2*Math.PI*radio*(radio+altura);
        
        System.out.println("El área del cilindro es " + area + " y su volumen es " + volumen);
        
        
    }
}
