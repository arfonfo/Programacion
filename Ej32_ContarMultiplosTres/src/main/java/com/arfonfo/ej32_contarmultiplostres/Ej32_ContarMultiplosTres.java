

package com.arfonfo.ej32_contarmultiplostres;


public class Ej32_ContarMultiplosTres {

    public static void main(String[] args) {
        int contador = 0;
        for (int i = 45; i <= 59; i++) {
            if(i%3==0){
                contador++;
            }
        }
        
        System.out.println("Hay " + contador + " múltiples de 3 entre 45 y 59");
    }
}


