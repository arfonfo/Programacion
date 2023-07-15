
package com.arfonfo.ej39_factorialsiete;


public class Ej39_FactorialSiete {

    public static void main(String[] args) {
        int factorial=1;
//        for (int i = 7; i > 0; i--) {
//            factorial = factorial * i;
//        }

        for (int i = 1; i <= 7; i++) {
            factorial = factorial * i;
        }
        
        System.out.println("El factorial de 7 es " + factorial);
        
    }
}
