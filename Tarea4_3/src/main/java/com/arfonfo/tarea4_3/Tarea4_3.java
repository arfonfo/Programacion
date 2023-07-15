package com.arfonfo.tarea4_3;

import java.util.Scanner;


public class Tarea4_3 {

    
    public static void abecedarioMayusculas(){
        for(char i = 'A'; i <= 'Z'; i++)
            System.out.print(i + " ");
        
    }
    
    public static int numeroVocales(String cadena){
        int contador=0;
        for (int i = 0; i < cadena.length(); i++) {
             if(Character.toLowerCase(cadena.charAt(i)) == 'a' || Character.toLowerCase(cadena.charAt(i)) == 'e'|| Character.toLowerCase(cadena.charAt(i)) == 'i' || Character.toLowerCase(cadena.charAt(i)) == 'o' || Character.toLowerCase(cadena.charAt(i)) == 'u')
                 contador++;
        }
        return contador;
    }
    
    public static int buscarW(String cadena){
        cadena = cadena.toLowerCase();
        int pos = cadena.indexOf('w');
        
        return pos;
    }
    
    public static int[] buscarT(String cadena){
        cadena = cadena.toLowerCase();
        int contador = cadena.indexOf("t");
        int pos =0;
        int posiciones[] = new int[cadena.length()];
        
        while(contador >= 0){
            posiciones[pos] = contador+1;
            contador = cadena.indexOf("t", contador+1);
            pos++;
        }
        
//        for (int i = 0; i < cadena.length(); i++) {
//            if(cadena.charAt(i) == 't'){
//                posiciones[contador] = (i+1);
//                contador++;
//            }
//        }
        
        int resultado[] = new int[pos];
        
        System.arraycopy(posiciones, 0, resultado, 0, pos);
        
        return resultado;
    }
    
    public static boolean soloLetras(String texto){
        return texto.matches("^[a-z\\sA-Z]+$");
    }
    
    
    public static int sumaNumeros(String numeros){
        int suma=0;

        String cadena = numeros.replaceAll("[a-z\\sA-Z]", "0");
       
        String caracteres[] = cadena.split("");
        
        // Mostrar el array
//        for (int i = 0; i < caracteres.length; i++) {
//            System.out.println(caracteres[i]);
//        }
        
        for (int i = 0; i < caracteres.length; i++) {
            suma += Integer.valueOf(caracteres[i]);
        }
        
        return suma;
    }
    
    public static String cadenaInversa(String cadena){
        String caracteres[] = cadena.split("");
        String resultado = "";
        
        // Muestro el array de caracteres
        for (int i = 0; i < caracteres.length; i++) {
            System.out.print(caracteres[i] + " ");
        }
        
        System.out.println("");
        
        for (int i = caracteres.length-1; i >= 0; i--) {
            resultado = resultado.concat(caracteres[i]);
        }
        return resultado;
    }
    
    public static String quitarEspacios(String cadena){
        String caracteres[] = cadena.split(" ");
        String resultado = "";
        
        // Muestro el array de caracteres
//        for (int i = 0; i < caracteres.length; i++) {
//            System.out.print(caracteres[i] + " ");
//        }
        
        System.out.println("");
        
        for (int i = 0; i < caracteres.length; i++) {
            resultado = resultado.concat(caracteres[i]);
        }
        return resultado;
    }
    
    public static boolean palindromo(String cadena){
        String resultado = quitarEspacios(cadena);
        resultado = resultado.toLowerCase();
        char caracteres[] = resultado.toCharArray();
        boolean iguales = false;

        // Muestro el array de caracteres
//        for (int i = 0; i < caracteres.length; i++) {
//            System.out.print(caracteres[i] + " ");
//        }

        // Comparo los char del array
        for (int i = 0; i < caracteres.length; i++) {
            if(caracteres[i] != caracteres[caracteres.length-1-i])
                iguales = false;
            else
                iguales = true;
        }
        return iguales;
    }
    
    public static void main(String[] args) {
        int ejercicio;

        Scanner teclado = new Scanner(System.in);

        do {
            System.out.println("");
            System.out.println("");
            System.out.println("*******************************************************");
            System.out.println("Introduce el número del ejercicio que quieres realizar: ");
            System.out.println("1. Mostrar el abecedario en Mayúsculas");
            System.out.println("2. Indicar número de vocales de una cadena introducida por teclado");
            System.out.println("3. Encontrar la 'W' en el texto e indicar la posición que ocupa en la cadena");
            System.out.println("4. Encontrar todas la posiciones que ocupa la 'T' en una cadena");
            System.out.println("5. Comprueba si el texto está compuesto solo por letras");
            System.out.println("6. Sumar los números introducidos con la frase");
            System.out.println("7. Devolver la cadena inversa a la introducida");
            System.out.println("8. Devolver el texto introducido sin espacios");
            System.out.println("9. Comprobar si una frase es un palíndromo");
            System.out.println("0. Salir");

            ejercicio = teclado.nextInt();

            switch (ejercicio) {
                case 0:
                    System.out.println("Salió del Programa");
                    break;
                case 1:
                    abecedarioMayusculas();
                    break;
                case 2:
                    teclado.nextLine();
                    String frase2;
                    System.out.println("Introduce una palabra o una frase: ");
                    frase2 = teclado.nextLine();
                    System.out.println("La frase que has introducido contiene " + numeroVocales(frase2) + " vocales");
                    break;
                case 3:
                    teclado.nextLine();
                    String frase3;
                    System.out.println("Introduce una palabra o una frase: ");
                    frase3 = teclado.nextLine();
                    System.out.println((buscarW(frase3) == -1) ? "La letra 'W' no se encuentra en la frase" : "La letra 'W' se encuentra en la posicion " + buscarW(frase3));
                    break;
                case 4:
                    teclado.nextLine();
                    String frase4;
                    System.out.println("Introduce una palabra o una frase: ");
                    frase4 = teclado.nextLine();
                    int posicionesT[] = buscarT(frase4);
                    if(posicionesT.length != 0){
                        System.out.println("La letra T se encuentra en las siguientes posiciones de la frase: ");
                        for (int i = 0; i < posicionesT.length; i++) {
                            System.out.print(posicionesT[i] + " ");
                        }
                    }else{
                        System.out.println("La letra T no se encuentra en la frase");
                    }
                    break;
                case 5:
                    teclado.nextLine();
                    String frase5;
                    System.out.println("Introduce una palabra o una frase: ");
                    frase5 = teclado.nextLine();
                    System.out.println(soloLetras(frase5) ? "El texto está compuesto solo por letras" : "El texto contiene más caracteres además de letras");
                    break;
                case 6:
                    teclado.nextLine();
                    String frase6;
                    System.out.println("Introduce una palabra o una frase: ");
                    frase6 = teclado.nextLine();
                    // Comprobamos primero que la frase que hemos introducido contenga algún número
                    if(frase6.matches(".*[0-9]*.")){
                        System.out.println(sumaNumeros(frase6));
                    } else {
                        System.out.println("La palabra introducida no contiene números");
                    }
                    break;
                case 7:
                    teclado.nextLine();
                    String frase7;
                    System.out.println("Introduce una palabra o una frase: ");
                    frase7 = teclado.nextLine();
                    System.out.println("El orden inverso de la cadena es: " + cadenaInversa(frase7));
                    break;
                case 8:
                    teclado.nextLine();
                    String frase8;
                    System.out.println("Introduce una palabra o una frase: ");
                    frase8 = teclado.nextLine();
                    System.out.println("Eliminando los espacios en blanco queda de la siguiente manera: " + quitarEspacios(frase8));
                    break;
                case 9:
                    teclado.nextLine();
                    String frase9;
                    System.out.println("Introduce una palabra o una frase: ");
                    frase9 = teclado.nextLine();
                    System.out.println(palindromo(frase9) ? "Es un palíndromo" : "No es un palíndromo");
                    break;
                default:
                    System.out.println("Selecciona un número entre el 1 y el 9");
            }

        } while (ejercicio != 0);
    }
}
