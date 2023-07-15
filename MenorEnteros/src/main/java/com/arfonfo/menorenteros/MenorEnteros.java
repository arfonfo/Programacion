

package com.arfonfo.menorenteros;

import java.util.Scanner;


public class MenorEnteros {

    public static void main(String[] args) {
        int a, b, c, menor;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("****** COMPARA 3 NÚMEROS ********");
        
        System.out.println("Introduce el primer número: ");
        a = teclado.nextInt();
        
        System.out.println("Introduce el segundo número: ");
        b = teclado.nextInt();
        
        System.out.println("Introduce el tercer número: ");
        c = teclado.nextInt();
        
        
        switch ((a<=b) ? 1 : (b<=c) ? 2 : 3) {
            case 1:
                menor = a;
                break;
            case 2:
                menor = b;
                break;
            case 3:
                menor = c;
                break;
            default:
                throw new AssertionError();
        }
     
        System.out.println("El menor de los tres es " + menor);
        
    }
}
