package com.arfonfo.tarea4_4;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Tarea4_4 {

    // MÉTODOS DE ARRAYS UNIDIMENSIONALES
    
    // Este método permite al usuario introducir valores para cada posición del array a través del teclado
    public static int[] arrayTeclado(int array[]) {
        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            System.out.println("Introduce la posición " + (i + 1) + " del array: ");
            array[i] = teclado.nextInt();
        }
        return array;

    }

    // Este método muestra los valores del array en pantalla
    public static void mostrarArray(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("");
    }

    // Este método mueve todos los valores del array una posición a la derecha
    // haciendo que el último valor pase a ser el primero
    public static int[] moverUnaArray(int array[]) {
        int aux = array[array.length - 1];
        for (int i = array.length - 1; i > 0; i--) {
            array[i] = array[i - 1];
        }
        array[0] = aux;

        return array;
    }

    // Mueve el array una cantidad de posiciones N
    public static int[] moverArray(int array[]) {
        int pos;
        Scanner teclado = new Scanner(System.in);
        System.out.println("¿Cuántas posiciones quieres mover el array?");
        pos = teclado.nextInt();
        // Llamamos al método que mueve una posición el array
        // tantas veces como el usuario haya indicado
        for (int i = 0; i < pos; i++) {
            array = moverUnaArray(array);
        }
        return array;
    }

    // Ordena el array de forma creciente
    public static int[] ordenarCreciente(int array[]) {
        int aux = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    aux = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = aux;
                }
            }
        }
        return array;
    }

    // Combina dos arrays en uno solo
    public static int[] mezclarArrays(int array1[], int array2[]) {
        int array3[] = new int[array1.length + array2.length];
        int contador1 = 0, contador2 = 0;

        for (int i = 0; i < array3.length; i++) {
            // cuando el contador de posiciones del array1 sea igual a su longitud
            // comenzamos a introducir los elementos del array2
            array3[i] = (contador1 != array1.length) ? array1[contador1++] : array2[contador2++];
        }
        return array3;
    }

    // Método para introducir los nombres de los atletas en un array
    public static String[] nombreAtletas(int longitud) {
        String[] atletas = new String[longitud];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < atletas.length; i++) {
            System.out.println("Introduce el nombre del atleta número " + (i + 1));
            atletas[i] = sc.next();
        }
        return atletas;
    }

    // MÉTODOS DE ARRAYS BIDIMENSIONALES
    
    // Muestra por pantalla una matriz de Strings
    public static void mostrarArrayBidimensional(String array[][]) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println("");
        }
    }

    // Muestra por pantalla una matriz de enteros
    public static void mostrarArrayBidimensionalEnteros(int array[][]) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println("");
        }
    }

    // Genera de forma aleatoria las marcas de los atletas entre 7,50 y 8,90
    // y crea una matriz con el array de sus nombres y las marcas de cada uno
    public static String[][] generarMarcasAtletas() {
        String atletas[] = nombreAtletas(10);
        String array[][] = new String[atletas.length][4];

        for (int i = 0; i < array.length; i++) {
            array[i][0] = atletas[i];
            for (int j = 1; j < array[i].length; j++) {
                array[i][j] = String.valueOf(Math.round((Math.random() * 1.40 + 7.50) * 10) / 10d);
            }
        }
        return array;
    }

    // Determina cual es la marca más alta de toda la matriz
    public static double mejorMarca(String marcas[][]) {
        double mayor = Double.parseDouble(marcas[0][1]);
        for (int i = 0; i < marcas.length; i++) {
            for (int j = 1; j < marcas[i].length; j++) {
                // transformamos el String en double para poder comparar los números
                if (Double.parseDouble(marcas[i][j]) > mayor) {
                    mayor = Double.parseDouble(marcas[i][j]);
                }
            }
        }
        return mayor;
    }

    // Permite la creación de una matriz introduciendo los datos por teclado
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

    // Método que suma 2 matrices y devuelve el resultado en una tercera
    public static int[][] sumarArraysBidimensionales(int array1[][], int array2[][]) {
        int array3[][] = new int[3][3];
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                array3[i][j] = array1[i][j] + array2[i][j];
            }
        }
        return array3;
    }

    // Cambia las filas por las columnas de una matriz
    public static int[][] transponerMatriz(int[][] matriz) {
        // Asignamos a la nueva matriz la longitud de columnas de la anterior como longitud de filas, y viceversa
        int transpuesta[][] = new int[matriz[0].length][matriz.length];

        // Mediante dos for anidados asignamos los valores de la matriz de entrada
        // cambiando filas por columnas
        for (int i = 0; i < transpuesta.length; i++) {
            for (int j = 0; j < transpuesta[i].length; j++) {
                transpuesta[i][j] = matriz[j][i];
            }
        }
        return transpuesta;
    }

    
    // MÉTODOS DE STRING
    
    // Cuenta las vocales de un String pasado como parámetro
    public static int contarVocales(String cadena) {
        int contador = 0;
        cadena = cadena.toLowerCase();

        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == 'a' || cadena.charAt(i) == 'e' || cadena.charAt(i) == 'i' || cadena.charAt(i) == 'o' || cadena.charAt(i) == 'u') {
                contador++;
            }
        }

        return contador;
    }

    // Devuelve en un array de enteros las posiciones de las "T"
    // que encuentre en el texto introducido por teclado
    public static int[] contarT(String cadena) {
        cadena = cadena.toLowerCase();
        int posiciones[] = new int[cadena.length()];
        int contador = 0;
        int pos = cadena.indexOf("t");

        while (pos >= 0) {
            Arrays.fill(posiciones, contador, (contador + 1), pos);
            pos = cadena.indexOf("t", pos + 1);
            contador++;
        }

        // Copiamos las posiciones encontradas en un nuevo array
        // cuya longitud es igual al número de "T" encontradas
        int resultado[] = new int[contador];
        System.arraycopy(posiciones, 0, resultado, 0, contador);
        return resultado;
    }

    // Devuelve el String inverso al pasado como parámetro
    public static String invertirCadena(String cadena) {
        String invertida = "";

        for (int i = cadena.length() - 1; i >= 0; i--) {
            invertida = invertida.concat(String.valueOf(cadena.charAt(i)));
        }

        return invertida;
    }

    // Elimina los espacios en blanco de un texto
    public static String quitarEspacios(String cadena) {
        String cadenaSinespacios = "";
        // Con replaceAll buscamos todos los espacios y los sustituimos por nada
        cadenaSinespacios = cadena.replaceAll(" ", "");
        return cadenaSinespacios;
    }

    
    // Método para comprobar si el texto introducido es un palíndromo
    // usamos los métodos quitarEspacios e invertirCadena para comprobar si son iguales
    public static boolean palindromo(String cadena) {
        cadena = quitarEspacios(cadena);
        return cadena.equalsIgnoreCase(invertirCadena(cadena));
    }

    // Método para comprobar si el DNI introducido se corresponde con el formato de 8 números y una letra mayúscula al final
    // por medio de expresiones regulares
    public static boolean validarFormatoDNI(String dni) {
        return dni.matches("^[0-9]{8}[A-Z]$");
    }

    // Método que comprueba que la letra introducida por el usuario corresponde con los números introducidos
    // devuelve la letra correcta
    public static String validarLetraDNI(String numero) {
        String letras[] = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};
        int posicionLetra = Integer.parseInt(numero) % 23;
        String letradni = letras[posicionLetra];
        return letradni;
    }

    // Devuelve true si los 8 primeros dígitos son números, si no false
    public static boolean validarNumeroDni(String numero) {
        // con el try-catch comprobamos si se puede convertir a entero
        // si es posible devuelve true
        // si no captura la excepción y devuelve false
        try {
            int num = Integer.parseInt(numero);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    // Comprueba que el noveno dígito sea una letra mayúscula entre A y Z
    public static boolean validarPosLetra(String letra) {
        for (char i = 'A'; i <= 'Z'; i++) {
            if (letra.charAt(0) == i) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int ejercicio = 0;
        boolean salir = false;
        Scanner teclado = new Scanner(System.in);

        do {
            System.out.println("");
            System.out.println("");
            System.out.println("*******************************************************");
            System.out.println("1. Mover una posición a la derecha los elementos de un array");
            System.out.println("2. Desplazar el array las posiciones indicadas");
            System.out.println("3. Mezclar 2 arrays en un tercero que esté ordenado de forma creciente");
            System.out.println("4. Mostrar las marcas de 10 atletas y la mejor marca");
            System.out.println("5. Sumar 2 arrays de 3x3");
            System.out.println("6. Devolver la transpuesta de una matriz");
            System.out.println("7. Contar el número de vocales de una palabra/frase");
            System.out.println("8. Mostrar las posiciones en las que aparece 'T'(mayúscula y minúscula) en una palabra/frase");
            System.out.println("9. Invierte una palabra o frase");
            System.out.println("10. Quitar los espacios en blanco de una frase");
            System.out.println("11. Comprobar si la palabra o frase es palíndromo");
            System.out.println("12. Comprobar si el DNI introducido es correcto");
            System.out.println("0. Salir");

            try {
                System.out.println("Introduce el número del ejercicio que quieres realizar: ");
                ejercicio = teclado.nextInt();

                switch (ejercicio) {
                    case 0:
                        salir = true;
                        System.out.println("Salió del Programa");
                        break;
                    case 1:
                        int longitud = 0;
                        System.out.println("Indica la longitud del array: ");
                        longitud = teclado.nextInt();
                        int array1[] = new int[longitud];
                        array1 = arrayTeclado(array1);
                        System.out.println("Array original: ");
                        mostrarArray(array1);
                        array1 = moverUnaArray(array1);
                        System.out.println("Al mover una posición a la derecha el Array queda de la siguiente manera: ");
                        mostrarArray(array1);
                        break;
                    case 2:
                        int longitud2 = 0;
                        System.out.println("Indica la longitud del array: ");
                        longitud2 = teclado.nextInt();
                        int array2[] = new int[longitud2];
                        array2 = arrayTeclado(array2);
                        System.out.println("Array original: ");
                        mostrarArray(array2);
                        array2 = moverArray(array2);
                        System.out.println("El nuevo array queda de la siguiente manera: ");
                        mostrarArray(array2);
                        break;
                    case 3:
                        // Creamos el primer array
                        int longitud3_1 = 0;
                        System.out.println("Indica la longitud del primer array: ");
                        longitud3_1 = teclado.nextInt();
                        int array3_1[] = new int[longitud3_1];
                        array3_1 = arrayTeclado(array3_1);
                        array3_1 = ordenarCreciente(array3_1);

                        // Creamos el segundo array
                        int longitud3_2 = 0;
                        System.out.println("Indica la longitud del segundo array: ");
                        longitud3_2 = teclado.nextInt();
                        int array3_2[] = new int[longitud3_2];
                        array3_2 = arrayTeclado(array3_2);
                        array3_2 = ordenarCreciente(array3_2);

                        // Generamos el tercer array ordenado
                        int[] array3_3 = mezclarArrays(array3_1, array3_2);
                        array3_3 = ordenarCreciente(array3_3);
                        // Mostramos los arrays
                        System.out.println("Primer array ordenado: ");
                        mostrarArray(array3_1);
                        System.out.println("Segundo array ordenado: ");
                        mostrarArray(array3_2);
                        System.out.println("Tercer array ordenado: ");
                        mostrarArray(array3_3);
                        break;
                    case 4:
                        String atletas[][] = generarMarcasAtletas();
                        mostrarArrayBidimensional(atletas);
                        System.out.println("La mejor marca de todas es: " + mejorMarca(atletas));
                        break;
                    case 5:
                        int array5_1[][] = generarArrayTeclado(3, 3);
                        int array5_2[][] = generarArrayTeclado(3, 3);
                        mostrarArrayBidimensionalEnteros(array5_1);
                        System.out.println("");
                        mostrarArrayBidimensionalEnteros(array5_2);
                        System.out.println("");
                        int array5_3[][] = sumarArraysBidimensionales(array5_1, array5_2);
                        System.out.println("La suma de los arrays es la siguiente: ");
                        mostrarArrayBidimensionalEnteros(array5_3);
                        break;
                    case 6:
                        int filas, columnas;
                        System.out.println("Introduce el número de filas de la matriz: ");
                        filas = teclado.nextInt();
                        System.out.println("Introduce el número de columnas de la matriz: ");
                        columnas = teclado.nextInt();
                        int array6[][] = generarArrayTeclado(filas, columnas);
                        System.out.println("La matriz original es la siguiente: ");
                        mostrarArrayBidimensionalEnteros(array6);
                        int matrizTranspuesta[][] = transponerMatriz(array6);
                        System.out.println("Si transponemos la matriz queda de la siguiente manera: ");
                        mostrarArrayBidimensionalEnteros(matrizTranspuesta);
                        break;
                    case 7:
                        // Le indicamos a Scanner que se sitúe en la línea siguiente
                        // Si no va a intentar leer la línea anterior, en la que se ha quedado next
                        teclado.nextLine();
                        String cadena7;
                        System.out.println("Introduce una palabra o frase: ");
                        // Usamos nextLine para que lea toda la línea hasta presionar Enter
                        cadena7 = teclado.nextLine();
                        System.out.println("La palabra/frase introducida contiene " + contarVocales(cadena7) + " vocales");
                        break;
                    case 8:
                        teclado.nextLine();
                        String cadena8;
                        System.out.println("Introduce una palabra o frase: ");
                        cadena8 = teclado.nextLine();
                        int array8[] = contarT(cadena8);
                        if (array8.length == 0) {
                            System.out.println("La letra 'T' no se encuentra en la frase");
                        } else {
                            mostrarArray(array8);
                        }
                        break;
                    case 9:
                        teclado.nextLine();
                        String cadena9;
                        System.out.println("Introduce una palabra o frase: ");
                        cadena9 = teclado.nextLine();
                        System.out.println("La palabra/frase introducida es: " + cadena9);
                        System.out.println("La palabra/frase invertida es: " + invertirCadena(cadena9));
                        break;
                    case 10:
                        teclado.nextLine();
                        String cadena10;
                        System.out.println("Introduce una frase: ");
                        cadena10 = teclado.nextLine();
                        System.out.println("La frase original es: " + cadena10);
                        System.out.println("La frase sin espacios en blanco es: " + quitarEspacios(cadena10));
                        break;
                    case 11:
                        teclado.nextLine();
                        String cadena11;
                        System.out.println("Introduce una palabra o frase: ");
                        cadena11 = teclado.nextLine();
                        if (cadena11.equals("") || cadena11.equals(" ")) {
                            System.out.println("No ha introducido una frase o palabra válida");
                        } else {
                            System.out.println("La palabra/frase introducida es: " + cadena11);
                            System.out.println(palindromo(cadena11) ? "La frase es un palíndromo" : "La frase no es un palíndromo");
                        }
                        break;
                    case 12:
                        teclado.nextLine();
                        String dni;

                        do {
                            System.out.println("Introduce el DNI completo(8 dígitos y una letra en mayúscula): ");
                            dni = teclado.nextLine();
                        } while (dni.length() != 9);

                        String letraDni = dni.substring(8);
                        String numDni = dni.substring(0, 8);
                        if (validarFormatoDNI(dni)) {
                            System.out.println("El formato introducido es correcto");
                            if (letraDni.equals(validarLetraDNI(numDni))) {
                                System.out.println("La letra del DNI introducido corresponde a los dígitos");
                            } else {
                                System.out.println("La letra no corresponde con esos dígitos. El DNI es incorrecto");
                            }
                        } else {
                            System.out.println("El formato introducido no es correcto");
                            if (!validarNumeroDni(numDni) && !validarPosLetra(letraDni)) {
                                System.out.println("Los 8 primeros dígitos no son números y el último dígito no es una letra en mayúsculas");
                            } else if (!validarPosLetra(letraDni)) {
                                System.out.println("Los 8 primeros dígitos no son números");
                            } else if (!validarPosLetra(letraDni)) {
                                System.out.println("El último dígito no es una letra en mayúsculas");
                            } else {
                                System.out.println("Revise de nuevo el DNI introducido.");
                            }
                        }
                        break;
                    default:
                        System.out.println("Selecciona un número entre el 1 y el 12");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debe introducir un número");
                teclado.next();
            }
        } while (!salir);
    }
}
