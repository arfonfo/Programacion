package com.arfonfo.tarea4_1;

import java.util.Arrays;
import java.util.Scanner;

public class Tarea4_1 {
    
    public static void mostrarArray(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void mismoOrden() {
        Scanner teclado = new Scanner(System.in);
        int num[] = new int[5];

        for (int i = 0; i < num.length; i++) {
            System.out.println("Introduce el número " + (i + 1));
            num[i] = teclado.nextInt();
        }
        System.out.println("***********************");
        for (int i = 0; i < num.length; i++) {
            System.out.println("El " + (i + 1) + " número introducido es " + num[i]);
        }
    }

    public static void inversoOrden() {
        Scanner teclado = new Scanner(System.in);
        int num[] = new int[5];

        for (int i = 0; i < num.length; i++) {
            System.out.println("Introduce el número " + (i + 1));
            num[i] = teclado.nextInt();
        }
        System.out.println("***********************");
        for (int i = num.length - 1; i >= 0; i--) {
            System.out.println("El " + (i + 1) + " número introducido es " + num[i]);
        }
    }

    public static void numerosAzar() {
        int aleatorio, positivos = 0, contadorPos = 0, negativos = 0, contadorNeg = 0, ceros = 0;
        int[] num = new int[5];

        for (int i = 0; i < 5; i++) {
            // Math.random()*203-100  ->  porque incluimos el -100, el 100 y el 0
            aleatorio = (int) Math.floor(Math.random() * ((101 - (-100 + 1))) + (-100));
            System.out.print((num[i] = aleatorio) + " ");
        }

        System.out.println("");

        for (int i = 0; i < num.length; i++) {
            if (num[i] > 0) {
                positivos += num[i];
                contadorPos++;

            } else if (num[i] < 0) {
                negativos += num[i];
                contadorNeg++;

            } else {
                ceros++;
            }

        }

        System.out.println("La media de los positivos generados es: " + positivos / contadorPos);
        System.out.println("La media de los negativos generados es: " + negativos / contadorNeg);
        System.out.println("El número de ceros generados es: " + ceros);

    }

    public static void reordenar() {
        Scanner teclado = new Scanner(System.in);
        int[] enteros = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.println("Introduce un elemento del array: ");
            enteros[i] = teclado.nextInt();
        }

        for (int i = 0; i < enteros.length / 2; i++) {
            System.out.print(enteros[i] + " ");
            System.out.print(enteros[(enteros.length - 1) - i] + " ");
        }
    }

    public static void mezclarArrays() {
        int[] vector1 = new int[10], vector2 = new int[10], vector3 = new int[20];
        int aleatorio, contador = 0;
        
        // Aquí generamos y mostramos el array1
        for (int i = 0; i < 10; i++) {
            aleatorio = (int) ((Math.random() * 100) + 1);
            vector1[i] = aleatorio;
            System.out.print(vector1[i] + " ");
        }

        System.out.println("");
        
        // Aquí generamos el array2
        for (int i = 0; i < 10; i++) {
            aleatorio = (int) ((Math.random() * 101) + 1);
            vector2[i] = aleatorio;
            System.out.print(vector2[i] + " ");
        }

        
        for (int i = 0; i < vector1.length; i++) {
            // introducimos el primer elemento del primer array en la primera posición del tercero
            vector3[contador] = vector1[i];
            contador++;
            // introducimos el primer elemento del segundo array en la segunda posición del tercero
            vector3[contador] = vector2[i];
            contador++;
        }

        System.out.println("");

        for (int i = 0; i < vector3.length; i++) {
            System.out.print(vector3[i] + " ");
        }

    }

    public static void mezclarArraysTres() {
        Scanner teclado = new Scanner(System.in);
        int[] vector1 = new int[12];
        int[] vector2 = new int[12];
        int[] vector3 = new int[vector1.length + vector2.length];
        int a = 0;

        // Rellena el vector1
        for (int i = 0; i < 12; i++) {
            System.out.println("Introduce el elemento " + (i + 1) + " del primer array: ");
            vector1[i] = teclado.nextInt();
        }

        //Rellena el vector2
        for (int i = 0; i < 12; i++) {
            System.out.println("Introduce el elemento " + (i + 1) + " del segundo array: ");
            vector2[i] = teclado.nextInt();
        }

        //Rellenamos el vector3
        for (int i = 0; i < vector3.length / 2; i += 3) {
            for (int j = 0; j < 3; j++) {
                vector3[a++] = vector1[i + j]; //i=0
                //a=3
            }
            for (int j = 0; j < 3; j++) {
                vector3[a++] = vector2[i + j]; //i=0

            }
        }
        //Mostramos el vector3
        for (int i = 0; i < vector3.length; i++) {
            System.out.print(vector3[i] + " ");
        }

    }

    public static void ordenArray() {
        Scanner teclado = new Scanner(System.in);
        int[] nums = new int[10];
        boolean creciente = false, decreciente = false;

        for (int i = 0; i < nums.length; i++) {
            System.out.println("Introduce el elemento " + (i + 1) + " del array");
            nums[i] = teclado.nextInt();
        }

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] < nums[i + 1]) {
                creciente = true;
            } else if (nums[i] > nums[i + 1]) {
                decreciente = true;
            }
        }

        if (creciente && decreciente) {
            System.out.println("Los elementos están desordenados");
        }
        if (creciente && decreciente == false) {
            System.out.println("Los elementos están ordenados de forma creciente");
        }
        if (creciente == false && decreciente) {
            System.out.println("Los elementos están ordenados de forma decreciente");
        }
        if (creciente == false && decreciente == false) {
            System.out.println("Los elementos son el mismo número");
        }

    }

    public static void insertarEntero() {
        int array1[] = new int[10];
        int numero, posicion;
        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i < array1.length - 2; i++) {
            System.out.println("Introduce el elemento " + (i + 1) + " del array");
            array1[i] = teclado.nextInt();
        }

        System.out.println("Introduce el número que quieres introducir en el array: ");
        numero = teclado.nextInt();

        System.out.println("Ahora indica la posición en la que quieres introducir el número(del 1 al 10):");
        posicion = teclado.nextInt() - 1;

        for (int i = array1.length - 1; i > posicion; i--) {
            array1[i] = array1[i - 1];
        }

        array1[posicion] = numero;

        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }
    }

    public static int[] moverArray(int array[]) {
        int aux;

        aux = array[array.length - 1];

        for (int i = array.length - 1; i > 0; i--) {
            array[i] = array[i - 1];
        }
        array[0] = aux;

        return array;
    }

    public static int[] desplazarArray(int array[], int posiciones) {
        int aux;
        
        // Repetimos el bucle de mover 1 posición tantas veces como lo indique posiciones
        for (int i = 0; i < posiciones; i++) {
            aux = array[array.length - 1];

            for (int j = array.length - 1; j > 0; j--) {
                array[j] = array[j - 1];
            }
            array[0] = aux;
        }

        return array;
    }

    public static int[] borrarPosicion(int array[], int posicion) {
        int array2[] = new int[array.length - 1];

        if (posicion != array.length) {
            for (int i = posicion; i < array.length; i++) {
                array[i - 1] = array[i];
            }

            for (int i = 0; i < array2.length; i++) {
                array2[i] = array[i];
            }
        }else {
            for (int i = 0; i < array2.length; i++) {
                array2[i] = array[i];
            }
        }

        return array2;
    }
    
    
    public static int[] paresImpares(int array[]) {
        int array2[] = new int[array.length];
        int contadorPar = 0, contadorImpar = 0;
        
        for (int i = 0; i < array.length; i++) {
            if(array[i]%2==0){
                array2[contadorPar++] = array[i];
            } else {
                array2[(array.length-1)-contadorImpar] = array[i];
                contadorImpar++;
            }
        }
        
        return array2;
    }
    
    public static int[] mezclarArraysOrden(int array1[], int array2[]) {
        int array3[] = new int [array1.length + array2.length];
        int contador = 0;
        
        for (int i = 0; i < array3.length; i++) {
            if(i<(array3.length/2)) {
               array3[i] = array1[i];
            } else {
               array3[i] = array2[contador++];
            }
        }
        
        array3 = ordenarCreciente(array3);
        
        return array3;
    }
    
    public static void buscarNumero(int array[]) {
        int n;
        boolean encontrado = false;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce el número que quieres buscar en el array: ");
        n = sc.nextInt();
        
        // Sin utilizar binarySearch
        for (int i = 0; i < array.length; i++) {
            if(array[i] == n){
                System.out.println("El número " + n + " se encuentra en la posicón " + (i+1) + " del array");
                encontrado = true;    
            }
            
        }
        if(!encontrado)
            System.out.println("El número " + n + " no se encuentra en el array");
        
        //binarySearch devuelve -1 si no encuentra el número
//        indice = Arrays.binarySearch(array, n);
//        System.out.println(indice);
//
//        System.out.println(n + ((indice!=-1)? (" está en el índice " + (indice+1)) : (" no está en el arreglo")));

    }
    
    public static int[] ordenarCreciente(int array[]){
        int aux = 0;
        // Vamos haciendo vueltas hasta que nos aseguremos que quedan todos ordenados
        for (int i = 0; i < array.length; i++) {
            // Llega hasta array.length-i porque siempre vamos dejando el mayor en el final
            // Ponemos -1 para que no falle al intentar obtener el valor array[j+1] en la primera vuelta
            // ya que en la primera i=0
            for (int j = 0; j < array.length-i-1; j++) {
                if(array[j] > array[j+1]){
                    aux = array[j];
                    array[j] = array[j+1];
                    array[j+1] = aux;
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int ejercicio;

        Scanner teclado = new Scanner(System.in);

        do {
            System.out.println("");
            System.out.println("");
            System.out.println("*******************************************************");
            System.out.println("Introduce el número del ejercicio que quieres realizar: ");
            System.out.println("1. Lee 5 números y muéstralos en el mismo orden");
            System.out.println("2. Lee 5 números y muéstralos en orden inverso");
            System.out.println("3. Genera 5 números al azar entre -100 y 100. Media de positivos y negativos, y número de ceros");
            System.out.println("4. Lee 10 números enteros y devuelve en orden primero-último");
            System.out.println("5. Generar y mezclar arrays");
            System.out.println("6. Mezclar 2 arrays de 3 en 3 en un tercero");
            System.out.println("7. Leer por teclado 10 números e indicar su orden: creciente, decreciente, desordenados");
            System.out.println("8. Insertar número en array");
            System.out.println("9. Hacer array de 10 números y moverlos una posición a la derecha");
            System.out.println("10.Hacer array de 10 números y desplazarlo las posiciones que se indiquen");
            System.out.println("11.Elimina posición del array");
            System.out.println("12.Ordenar pares e impares");
            System.out.println("13.Introducir 2 arrays y obtener un tercero ordenado");
            System.out.println("14.Devolver la posición de un número en un array de 10 números");
            System.out.println("0. Salir");

            ejercicio = teclado.nextInt();

            switch (ejercicio) {
                case 0:
                    System.out.println("Salió del Programa");
                    break;
                case 1:
                    mismoOrden();
                    break;
                case 2:
                    inversoOrden();
                    break;
                case 3:
                    numerosAzar();
                    break;
                case 4:
                    reordenar();
                    break;
                case 5:
                    mezclarArrays();
                    break;
                case 6:
                    mezclarArraysTres();
                    break;
                case 7:
                    ordenArray();
                    break;
                case 8:
                    insertarEntero();
                    break;
                case 9:
                    int array[] = new int[10];
                    int arrayDerecha[];
                    for (int i = 0; i < array.length; i++) {
                        System.out.println("Introduce el elemento " + (i + 1) + " del array");
                        array[i] = teclado.nextInt();
                    }
                    arrayDerecha = moverArray(array);
                    mostrarArray(arrayDerecha);
                    break;
                case 10:
                    int array10[] = new int[10];
                    int arrayDesplazado[];
                    int posiciones;

                    for (int i = 0; i < array10.length; i++) {
                        System.out.println("Introduce el elemento " + (i + 1) + " del array");
                        array10[i] = teclado.nextInt();
                    }

                    do {
                        System.out.println("Indica el número de posiciones que quieres desplazar los números: ");
                        posiciones = teclado.nextInt();
                    } while (posiciones > 10 || posiciones < 0);

                    arrayDesplazado = desplazarArray(array10, posiciones);
                    mostrarArray(arrayDesplazado);
                    break;
                case 11:
                    int array11[] = new int[10];
                    int arraySin[];
                    int posicion;

                    for (int i = 0; i < array11.length; i++) {
                        System.out.println("Introduce el elemento " + (i + 1) + " del array");
                        array11[i] = teclado.nextInt();
                    }

                    do {
                        System.out.println("Indica la posición del array que quieres borrar: ");
                        posicion = teclado.nextInt();
                    } while (posicion > 10 || posicion < 0);

                    arraySin = borrarPosicion(array11, posicion);
                    mostrarArray(arraySin);
                    break;
                case 12:
                    int array12[] = new int[10];
                    int arrayParesImpares[];
                    
                    for (int i = 0; i < array12.length; i++) {
                        System.out.println("Introduce el elemento " + (i + 1) + " del array");
                        array12[i] = teclado.nextInt();
                    }

                    arrayParesImpares = paresImpares(array12);
                    mostrarArray(arrayParesImpares);
                    break;
                case 13:
                    int array13[] = new int[10];
                    int array132[] = new int[10];
                    int arrayMix[];
                    
                    for (int i = 0; i < array13.length; i++) {
                        System.out.println("Introduce el elemento " + (i + 1) + " del array 1");
                        array13[i] = teclado.nextInt();
                    }
                    for (int i = 0; i < array132.length; i++) {
                        System.out.println("Introduce el elemento " + (i + 1) + " del array 2");
                        array132[i] = teclado.nextInt();
                    }
                    
                    array13 = ordenarCreciente(array13);
                    array132 = ordenarCreciente(array132);

                    arrayMix = mezclarArraysOrden(array13, array132);
                    mostrarArray(arrayMix);
                    break;
                case 14:
                    int array14[] = new int[10];
                    
                    for (int i = 0; i < array14.length; i++) {
                        System.out.println("Introduce el elemento " + (i + 1) + " del array");
                        array14[i] = teclado.nextInt();
                    }

                    array14 = ordenarCreciente(array14);

                    buscarNumero(array14);
                    
                    break;
                default:
                    System.out.println("Selecciona un número entre el 1 y el 14");
            }

        } while (ejercicio != 0);
    }

    

}
