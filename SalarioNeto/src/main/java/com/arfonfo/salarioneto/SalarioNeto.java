/*
PSEUDOCÓDIGO

Programa SalarioNeto

Entorno:

    nombre es una cadena
    horasTrabajo, precioHora, salarioBruto, salarioNeto son numéricas de coma flotante

Algoritmo:
    
    Escribir "Nombre del trabajador: "
    Leer nombre

    Escribir "Horas trabajadas: "
    Leer horasTrabajo

    Escribir "Precio de la hora: "
    Leer precioHora

    Calcular:

        salarioBruto <- horasTrabajo*precioHora
        salarioNeto <- salarioBruto - (salarioBruto*10/100)

    Escribir "El salario neto del trabajor ", nombre, " es ", salarioNeto


Finalgoritmo
    
*/
package com.arfonfo.salarioneto;

import java.util.Scanner;


public class SalarioNeto {

    public static void main(String[] args) {
        String nombre;
        double horasTrabajo, precioHora, salarioBruto, salarioNeto;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Nombre del trabajador: ");
        nombre = sc.nextLine();
        
        System.out.println("Horas trabajadas: ");
        horasTrabajo = sc.nextDouble();
        
        System.out.println("Precio de la hora: ");
        precioHora = sc.nextDouble();
        
        salarioBruto = horasTrabajo*precioHora;
        
        salarioNeto = salarioBruto - (salarioBruto*10/100);
        
        System.out.println("El salario neto del trabajador " + nombre + " es " + salarioNeto);
        
    }
}
