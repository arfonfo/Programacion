
package com.arfonfo.ej38_sumadieznaturales;


public class Ej38_SumaDiezNaturales {

    public static void main(String[] args) {
        int suma = 0;
        
        for (int i = 1; i <= 10; i++) {
            suma = i + suma;
        }
        
        System.out.println("La suma de los 10 primeros números naturales es: " + suma);
    }
}
