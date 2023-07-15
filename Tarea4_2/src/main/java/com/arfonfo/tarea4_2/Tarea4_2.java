package com.arfonfo.tarea4_2;

import java.util.Scanner;

public class Tarea4_2 {

    public static int[][] generarArrayAleatorio(int filas, int columnas) {
        int array[][] = new int[filas][columnas];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 100 + 1);
            }
        }

        return array;
    }

    public static int[][] generarArrayTeclado(int filas, int columnas) {
        int array[][] = new int[filas][columnas];
        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println("Introduce el elemento [" + i + "] [" + j + "] de la matriz");
                array[i][j] = teclado.nextInt();
            }
        }

        return array;
    }

    public static int[][] generarArrayUnoCero(int filas, int columnas) {
        int array[][] = new int[filas][columnas];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j) {
                    array[i][j] = 1;
                } else {
                    array[i][j] = 0;
                }
            }
        }
        return array;
    }

    // Método para mostrar una matriz de forma recursiva
    public static void mostrarMatrizRecursiva(int matriz[][], int i, int j){
        System.out.print(matriz[i][j] + " ");
        
        if(i!=matriz.length-1 || j!=matriz[i].length-1){
            if(j==matriz[i].length-1){
                i++;
                j=0;
                System.out.println("");
            } else{
                j++;
            }
            mostrarMatrizRecursiva(matriz, i, j);
        }
    }
    
    public static void mostrarArrayBidimensional(int array[][]) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static int[][] rellenarArray(int array[][]) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = i + j;
            }
        }
        return array;
    }

    public static int[][] cambiaFilasColumnas(int array[][]) {
        // al nuevo array que se genera le damos las columnas del anterior como las filas y viceversa
        int resultado[][] = new int[array[0].length][array.length];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                resultado[j][i] = array[i][j];
            }

        }

        return resultado;
    }

    public static boolean compararArraysBidimensionales(int array1[][], int array2[][]) {
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j <= array1[i].length; j++) {
                if (array1[i][j] != array2[j][i]) {
                    return false;
                }
                break;
            }
        }
        return true;
    }

    public static int[][] sumarArraysBidimensionales(int array1[][], int array2[][]) {
        int array3[][] = new int[3][3];
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                array3[i][j] = array1[i][j] + array2[i][j];
            }
        }
        return array3;
    }

    public static void sumaFilasColumnas(int array[][]) {
        int sumaFila = 0, sumaColumna = 0, columna = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sumaFila += array[i][j];
                sumaColumna += array[columna++][i];
            }
            System.out.println("La suma de la fila " + (i + 1) + " es: " + sumaFila);
            sumaFila = 0;

            System.out.println("La suma de la columna " + (i + 1) + " es: " + sumaColumna);
            columna = 0;
            sumaColumna = 0;
        }
    }

    public static double[][] generarMarcas(int filas, int columnas) {
        double array[][] = new double[filas][columnas];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = Math.round((Math.random() * 1.40 + 7.50)*10)/10d;
            }
        }

        return array;
    }
    
    public static void mostrarMarcas(String nombres[], double marcas[][]){
        for (int i = 0; i < marcas.length; i++) {
            System.out.println("El atleta " + nombres[i] + " ha obtenido las siguientes marcas: ");
            for (int j = 0; j < marcas[i].length; j++) {
                System.out.print(marcas[i][j] + " ");
            }
            System.out.println("");
        }
    }
    
    public static double mejorMarca(double marcas[][]){
        double mayor = marcas[0][0];
        for (int i = 0; i < marcas.length; i++) {
            for (int j = 0; j < marcas[i].length; j++) {
                if(marcas[i][j] > mayor)
                    mayor = marcas[i][j];
            }
        }
        return mayor;
    }

    public static void main(String[] args) {
        int ejercicio;

        Scanner teclado = new Scanner(System.in);

        do {
            System.out.println("");
            System.out.println("");
            System.out.println("*******************************************************");
            System.out.println("Introduce el número del ejercicio que quieres realizar: ");
            System.out.println("1. Generar array bidimensional de 5x5");
            System.out.println("2. Comprobar si un array de 4x4 es simétrico");
            System.out.println("3. Sumar 2 matrices de enteros de tamaño 3x3");
            System.out.println("4. Trasponer matriz de 3x3");
            System.out.println("5. Crear matriz de 7x7 donde la diagonal sea 1 y el resto 0");
            System.out.println("6. Mostrar la suma de cada fila y cada columna de una matriz de 10x10");
            System.out.println("7. Trasponer matriz de 5x9 en otro de 9x5");
            System.out.println("8. Mostrar marcas de los atletas y la mejor de la competición");
            System.out.println("0. Salir");

            ejercicio = teclado.nextInt();

            switch (ejercicio) {
                case 0:
                    System.out.println("Salió del Programa");
                    break;
                case 1:
                    int array1[][] = generarArrayAleatorio(5, 5);
                    array1 = rellenarArray(array1);
                    mostrarArrayBidimensional(array1);
                    break;
                case 2:
                    int array2[][] = generarArrayAleatorio(4, 4);
                    mostrarArrayBidimensional(array2);
                    int array2T[][] = cambiaFilasColumnas(array2);
                    System.out.println("");
                    mostrarArrayBidimensional(array2T);
                    if (compararArraysBidimensionales(array2, array2T)) {
                        System.out.println("Las matrices son simétricas");
                    } else {
                        System.out.println("Las matrices no son simétricas. Ha fallado la transposición");
                    }
                    break;
                case 3:
                    int array3[][] = generarArrayAleatorio(3, 3);
                    int array3_2[][] = generarArrayAleatorio(3, 3);
                    mostrarArrayBidimensional(array3);
                    System.out.println("");
                    mostrarArrayBidimensional(array3_2);
                    System.out.println("");
                    mostrarArrayBidimensional(sumarArraysBidimensionales(array3, array3_2));
                    break;
                case 4:
                    int array4[][] = generarArrayTeclado(3, 3);
                    mostrarArrayBidimensional(array4);
                    System.out.println("");
                    mostrarArrayBidimensional(cambiaFilasColumnas(array4));
                    break;
                case 5:
                    int array5[][] = generarArrayUnoCero(7, 7);
                    mostrarArrayBidimensional(array5);
                    break;
                case 6:
                    int array6[][] = generarArrayAleatorio(10, 10);
                    mostrarArrayBidimensional(array6);
                    sumaFilasColumnas(array6);
                    break;
                case 7:
                    int array7[][] = generarArrayAleatorio(5, 9);
                    mostrarArrayBidimensional(array7);
                    System.out.println("");
                    mostrarArrayBidimensional(cambiaFilasColumnas(array7));
                    break;
                case 8:
                    // limpiamos el buffer de entrada, teclado se queda abierto
                    teclado.nextLine();
                    // Creamos el Array de atletas y los mostramos
                    String atletas[] = new String[10];
                    // Pedimos los nombres de los atletas por teclado
                    for (int i = 0; i < atletas.length; i++) {
                        System.out.println("Introduce el nombre del atleta número " + (i + 1));
                        atletas[i] = teclado.nextLine();
                    }
                    // Mostramos los atletas
                    System.out.println("Los atletas participantes son: ");
                    for (int i = 0; i < atletas.length; i++) {
                        System.out.print(atletas[i] + " ");
                    }
                    
                    System.out.println("");

                    // Creamos el array bidimensional
                    double clasificacion[][] = generarMarcas(atletas.length, 3);
                    // Mostramos el array clasificación
//                    for (int i = 0; i < clasificacion.length; i++) {
//                        for (int j = 0; j < clasificacion[i].length; j++) {
//                            System.out.print(clasificacion[i][j] + " ");
//                        }
//                        System.out.println("");
//                    }
                    
                    // Mostramos las marcas de cada atleta llamando al método
                    mostrarMarcas(atletas, clasificacion);
                    
                    // Llamamos al método para seleccionar la mejor marca de todas
                    System.out.println("La máxima puntuación es " + mejorMarca(clasificacion));
                    break;
                default:
                    System.out.println("Selecciona un número entre el 1 y el 8");
            }

        } while (ejercicio != 0);
    }
}
