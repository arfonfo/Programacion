
/*
PSEUDOCÓDIGO

Programa CalculoIMC

Entorno:
    peso, altura, IMC son numéricas de coma flotante

Algoritmo:
    
    Escribir "Introduce tu peso en kilogramos: "

    Leer peso

    Escribir "Introduce tu altura en metros: "

    Leer altura

    Calcular: 

        imc <- peso/(altura*altura)

    Escribir "El valor de tu índice de masa corporal es: ", imc

Finalgoritmo
*/


package com.arfonfo.calculoimc;

import java.util.Scanner;

public class CalculoIMC {

    public static void main(String[] args) {
        double peso, altura, imc;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce tu peso en kilogramos: ");
        peso = sc.nextDouble();
        
        System.out.println("Introduce tu altura en metros: ");
        altura = sc.nextDouble();
        
        imc = peso/(altura*altura);
        
        System.out.println("El valor de tu índice de masa corporal es: " + imc);
    }
}
