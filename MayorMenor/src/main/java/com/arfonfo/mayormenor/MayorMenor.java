

package com.arfonfo.mayormenor;

import java.util.Scanner;


public class MayorMenor {

    public static void main(String[] args) {
        int num1, num2;
        Scanner teclado = new Scanner(System.in);
        
        
        System.out.println("Introduce un número entero: ");
        num1 = teclado.nextInt();
        
        System.out.println("Introduce otro número entero: ");
        num2 = teclado.nextInt();
        
        if(num1 < num2){
            System.out.println(num2 + " es mayor que " + num1);
        } else if(num1 > num2) {
            System.out.println(num1 + " es mayor que " + num2);
        } else {
            System.out.println("Son el mismo número.");
        }
    }
}
