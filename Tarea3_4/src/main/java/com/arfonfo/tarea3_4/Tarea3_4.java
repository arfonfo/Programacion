package com.arfonfo.tarea3_4;

import java.util.Scanner;

public class Tarea3_4 {

    public static void main(String[] args) {
        int ejercicio;
        
        Scanner teclado = new Scanner(System.in);

        do {
            System.out.println("");
            System.out.println("");
            System.out.println("*******************************************************");
            System.out.println("Introduce el número del ejercicio que quieres realizar: ");
            System.out.println("1. Cálculo de una ecuación de segundo grado");
            System.out.println("2. Media de los enteros generados al azar");
            System.out.println("3. Sumar potencias de 2 hasta el número que introduzcas");
            System.out.println("4. Cuenta los números pares hasta introducir -1");
            System.out.println("5. Genera al azar un número entre 1 y 10 y devuelve su tabla de multiplicar");
            System.out.println("6. Comprobar si un número es primo o no");
            System.out.println("7. Imprime los 10 primeros números primos");
            System.out.println("0. Salir");

            ejercicio = teclado.nextInt();

            switch (ejercicio) {
                case 0:
                    System.out.println("Salió del Programa");
                    break;
                case 1:
                    double a, b, c;
                    System.out.println("Introduce el valor de ax²: ");
                    a = teclado.nextDouble();
                    System.out.println("Introduce el valor de bx: ");
                    b = teclado.nextDouble();
                    System.out.println("Introduce el valor de c: ");
                    c = teclado.nextDouble();
                    ec_2_grado(a, b, c);
                    break;
                case 2:
                    int num;
                    System.out.println("Introduce un número entero: ");
                    num = teclado.nextInt();
                    System.out.println("La media de los " + num + " números generados al azar es " + media_aritmetica(num));
                    break;
                case 3:
                    int numPotencia;
                    System.out.println("Introduce un número entero: ");
                    numPotencia = teclado.nextInt();
                    System.out.println("La suma de las potencias de 2 es: " + suma_potencias(numPotencia));
                    break;
                case 4:
                    System.out.println("La cantidad de números pares introducida es: " + contar_pares());
                    break;
                case 5:
                    tabla_multiplicar();
                    break;
                case 6:
                    int numPrimo;
                    System.out.println("Introduce un número: ");
                    numPrimo = teclado.nextInt();
                    if (es_primo(numPrimo)) {
                        System.out.println("El número es primo");
                    } else {
                        System.out.println("El número NO es primo");
                    }
                    break;
                case 7:
                    primeros_10_primos();
                    break;
                default:
                    System.out.println("Selecciona un número entre el 1 y el 7");
            }

        } while (ejercicio != 0);
    }

    public static void ec_2_grado(double a, double b, double c) {
        double solucion1, solucion2, raizPosible;

        raizPosible = Math.pow(b, 2) - (4 * a * c);

        if (a != 0 && raizPosible >= 0) {
            solucion1 = ((-b) + Math.sqrt(raizPosible)) / (2 * a);
            solucion2 = ((-b) - Math.sqrt(raizPosible)) / (2 * a);
            System.out.println("Una solución de x es: " + solucion1);
            System.out.println("Otra solución de x es: " + solucion2);
        } else {
            System.out.println("No existe solución para los valores introducidos");
        }
    }

    public static int media_aritmetica(int numero) {
        int suma = 0, media = 0, aleatorio;

        for (int i = 1; i <= numero; i++) {
            aleatorio = (int) ((Math.random() * 100)+1);
            System.out.print(aleatorio + " ");
            suma += aleatorio;
        }
        
        media = suma/numero;
        
        System.out.println("");
        
        return media;
    }

    public static int suma_potencias(int numero) {
        int suma = 0;
        for (int i = 0; i < numero; i++) {
            suma += Math.pow(2, i);
        }
        return suma;
    }

    public static int contar_pares() {
        int num, contador = 0;
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.println("Introduce un número entero: ");
            num = teclado.nextInt();

            if (num % 2 == 0) {
                contador++;
            }

        } while (num != -1);

        return contador;
    }

    public static void tabla_multiplicar() {
        int aleatorio;
        aleatorio = (int) (Math.random() * 10 + 1);
        System.out.println("Tabla de multiplicar del " + aleatorio);
        System.out.println("***********************************");
        System.out.println("");

        for (int i = 0; i <= 10; i++) {
            System.out.println(aleatorio * i);
        }
    }

    public static boolean es_primo(int numero) {
        if (numero == 0 || numero == 1) {
            return false;
        }

        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void primeros_10_primos() {
        int contador = 0, num = 0;
        while (contador < 10) {
            if (es_primo(num)) {
                System.out.println(num);
                contador++;
            }
            num++;
        }

    }
}
