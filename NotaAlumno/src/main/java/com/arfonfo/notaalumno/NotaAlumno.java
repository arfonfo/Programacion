/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.arfonfo.notaalumno;

import java.util.Scanner;

/**
 *
 * @author alfon
 */
public class NotaAlumno {

    public static void main(String[] args) {
        int nota;
        Scanner teclado = new Scanner(System.in);
        
        
        System.out.println("Introduzca la nota del alumno: ");
        nota = teclado.nextInt();
        
        if (nota >= 0 && nota < 5) {
            System.out.println("El alumno está suspenso.");
        } else if (nota >= 5 && nota <=10) {
            System.out.println("El alumno está aprobado.");
        } else {
            System.out.println("El número introducido no está entre 0 y 10");
        }
    }
}
