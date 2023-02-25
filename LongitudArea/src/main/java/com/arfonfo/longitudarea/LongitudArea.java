

/*
PSEUDOCÓDIGO

Programa LongitudArea

Entorno:
    radio, longitud, area son numéricas de coma flotante
    PI es constante numérica de coma flotante

Algoritmo
    
    Escribir "Introduce el radio: "
    
    Leer radio

    Calcular:
        
        longitud <- PI * (radio*2)

        area <- PI * (radio^2)

    Escribir "La longitud de la circunferencia es: ", longitud
    
    Escribir "El área del círculo es: ", area
    
Finalgoritmo

*/

package com.arfonfo.longitudarea;

import java.util.Scanner;

/**
 *
 * @author alfon
 */
public class LongitudArea {

    public static void main(String[] args) {
        
        double radio, longitud, area;
        final double PI = Math.PI;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce el radio: ");
        radio = sc.nextDouble();
        
        longitud = PI * (radio*2);
        area = PI * (Math.pow(radio, 2));
        
        System.out.println("La longitud de la circunferencia es: " + longitud);
        System.out.println("El área del círculo es: " + area);
        
        
    }
}
