
package com.arfonfo.salariosemanal;

import java.util.Scanner;

/**
 *
 * @author alfon
 */
public class SalarioSemanal {

    public static void main(String[] args) {
        int horas;
        double precioHora, sueldoSemanal;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Horas trabajadas esta semana: ");
        horas = teclado.nextInt();
        
        System.out.println("Precio por hora del trabajador: ");
        precioHora = teclado.nextDouble();
        
        if (horas <= 40) {
            sueldoSemanal = horas*precioHora;
            System.out.println("El salario semanal del empleado es: " + sueldoSemanal + " €");
        } else {
            sueldoSemanal = (40 * precioHora) + ((horas-40) *(precioHora*1.5));
            System.out.println("El sueldo semanal del empleado es: " + sueldoSemanal + " €");
        }
    }
}
