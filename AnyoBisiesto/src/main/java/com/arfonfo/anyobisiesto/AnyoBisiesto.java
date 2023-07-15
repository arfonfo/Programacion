/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.arfonfo.anyobisiesto;

import java.util.Scanner;

/**
 *
 * @author alfon
 */
public class AnyoBisiesto {

    public static void main(String[] args) {
        int anyo;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introduce un año: ");
        anyo = teclado.nextInt();
        
        if ((anyo % 4 == 0 && anyo % 100 != 0) || (anyo % 100 == 0 && anyo % 400 == 0)) {
            System.out.println("El año " + anyo + " es bisiesto");
        } else {
            System.out.println("El año " + anyo + " no es bisiesto");
        }
    }
}
