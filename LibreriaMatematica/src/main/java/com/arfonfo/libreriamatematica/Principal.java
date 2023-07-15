
package com.arfonfo.libreriamatematica;

import java.awt.BorderLayout;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author alfon
 */
public class Principal {

    
    public static void mostrarArrayRacional(racional[] rac1) {
        for (int i = 0; i < rac1.length; i++) {
            rac1[i].mostrarRacional();
        }
    }
    
    public static void mostrarArrayComplejo(complejo[] com1) {
        for (int i = 0; i < com1.length; i++) {
            System.out.println(com1[i].toString() + "\n");
        }
    }
    
    public static void main(String[] args) {
        
        // Inicializamos 2 arrays con 10 elementos de cada clase
        racional rac1[] = new racional[10];
        
        complejo com1[] = new complejo[10];
        
        Scanner teclado = new Scanner(System.in);
        int num = 0;

        // Llenamos los arrays
        for (int i = 0; i < rac1.length; i++) {
            rac1[i] = new racional((int)(Math.random()*100+1), (int)(Math.random()*100+1));
        }
        
        for (int i = 0; i < com1.length; i++) {
            com1[i] = new complejo((double)(Math.random()*100+1), (double)(Math.random()*100+1));
        }
        
        // Mostramos los arrays
//        mostrarArrayRacional(rac1);
//        
//        mostrarArrayComplejo(com1);

        // PROBAMOS LOS MÉTODOS DE LA CLASE RACIONAL
        System.out.println("Métodos de la clase Racional");
        // Controlamos las entradas de datos
        try {
            System.out.println("Introduce el entero que quieres convertir a racional: ");
            num = teclado.nextInt();
            racional.inmersionEntero(num);
        } catch (InputMismatchException e) {
            System.out.println("Debe introducir un número entero. " + e);
        }
        
        System.out.println("");

        boolean salir = false;
        do {
            mostrarArrayRacional(rac1);
            int num1 = 0;
            int num2 = 0;
            
            try {
                
                System.out.println("Elige uno de los 10 números racionales: ");
                num1 = teclado.nextInt();
                System.out.println("Elige otro de los 10 números racionales: ");
                num2 = teclado.nextInt();
                
                // Probamos el método equivalencia de la clase racional
                if(racional.equivalencia(rac1[num1-1], rac1[num2-1])){
                    System.out.println("Los racionales elegidos son iguales.\n");
                } else {
                    System.out.println("Los números elegidos no son iguales.\n");
                }
                
                if (num1==num2) {
                    throw new Exception();
                }
                salir = true;
                
                
            } catch (IndexOutOfBoundsException e){
                System.out.println("No has elegido un número entre 1 y 10. \n" + e);
            } catch (InputMismatchException e) {
                System.out.println("Debes introducir un número entero. \n" + e);
                teclado.next();
            } catch (Exception e){
                System.out.println("Has elegido los mismos números. Vuelve a elegir: \n");
            }
            
        } while (!salir);
        
        System.out.println("");
        
        // Probamos el método simplificación de la clase racional
        rac1[5].setNumerador(80);
        rac1[5].setDenominador(40);
        System.out.println("Número racional antes de simplicarlo: ");
        rac1[5].mostrarRacional();
        System.out.println("Número racional después de simplificarlo: ");
        rac1[5].simplificacion().mostrarRacional();
        
        System.out.println("");
        
        // Probamos el método de orden
        int ord1 = (int) (Math.random()*10);
        int ord2 = (int) (Math.random()*10);
        System.out.println("Primer racional: ");
        rac1[ord1].mostrarRacional();
        System.out.println("Segundo racional: ");
        rac1[ord2].mostrarRacional();
        System.out.println(racional.orden(rac1[ord1], rac1[ord2]) ? "El primero es menor que el segundo" : "El primero es mayor que el segundo");
        
        System.out.println("");
        
        // Probamos los métodos set con excepciones
        try {
            System.out.println("Selecciona uno de los 10 racionales que quieres cambiar: ");
            num = teclado.nextInt()-1;

            System.out.println("Indica el numerador del racional: ");
            rac1[num].setNumerador(teclado.nextInt());

            try {
                System.out.println("Indica el denominador del racional: ");
                rac1[num].setDenominador(teclado.nextInt());
            } catch (ArithmeticException e) {
                System.out.println("El denominador no puede ser 0");
            }
            
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Has introducido un número que no se encuentra entre 1 y 10");
        } catch (Exception e){
            System.out.println("No has introducido un número");
        }
        
        
        System.out.println("");
        
        // Probamos el método suma
        System.out.println("Probando los métodos Suma, Resta, Multiplicación y División: ");
        System.out.println("Primer racional: ");
        rac1[8].mostrarRacional();
        System.out.println("Segundo racional: ");
        rac1[9].mostrarRacional();
        System.out.println("Suma: ");
        rac1[8].suma(rac1[9]).mostrarRacional();
        
        // Probamos el método resta
        System.out.println("Resta: ");
        rac1[8].resta(rac1[9]).mostrarRacional();
        
        // Probamos el método multiplicación
        System.out.println("Multiplicación: ");
        rac1[8].multiplicacion(rac1[9]).mostrarRacional();
        
        // Probamos el método división
        System.out.println("División: ");
        rac1[8].division(rac1[9]).mostrarRacional();
        
        
        System.out.println("");
        System.out.println("");
        System.out.println("***********************************************");
        System.out.println("Métodos de la clase Complejo");
        
        // PROBAMOS LOS MÉTODOS DE LA CLASE COMPLEJO
        
        // Probamos el método estático equals
        System.out.println(com1[2].toString());
        System.out.println(com1[4].toString());
        System.out.println(complejo.equals(com1[2], com1[4]) ? "Los números complejos son iguales" : "Los números complejos no son iguales");
        
        
        System.out.println("Probamos los métodos Suma, Resta, Multiplicación y División con parámetro un número complejo");
        System.out.println("");
        System.out.println("Primer número\n" + com1[4].toString());
        System.out.println("");
        System.out.println("Segundo número\n" + com1[5].toString());
        System.out.println("");
        // Probamos el método Suma
        System.out.println("Suma\n" + com1[4].complejoSuma(com1[5]).toString());
        System.out.println("");
        //Probamos el método Resta
        System.out.println("Resta\n" + com1[4].complejoResta(com1[5]).toString());
        System.out.println("");
        //Probamos el método Multiplicación
        System.out.println("Multiplicación\n" + com1[4].complejoProducto(com1[5]).toString());
        System.out.println("");
        //Probamos el método División
        System.out.println("División\n" + com1[4].complejoCociente(com1[5]).toString());
        System.out.println("");
        
        System.out.println("***************************************************");
        System.out.println("");
        
        System.out.println("Probamos los métodos Suma, Resta, Multiplicación y División pasando por parámetro el número real y el imaginario\n");
        
        System.out.println("Hemos seleccionado este número complejo: \n");
        System.out.println(com1[6].toString());

        System.out.println("");
        
        System.out.println("Ahora crea tú el otro para hacer los cálculos.");

        System.out.println("");
            
        boolean correcto = false;
        double real = 0;
        double imaginario = 0;
        do {
            try {
                System.out.println("Itroduce el número real: ");
                real = teclado.nextDouble();
            
                System.out.println("Introduce el número imaginario: ");
                imaginario = teclado.nextDouble();
                
                correcto = true;
                
            } catch (InputMismatchException e) {
                System.out.println("No has introducido un número.\n" + e);
                teclado.next();
            }
            
        } while (!correcto);
            
        complejo com2 = new complejo(real, imaginario);

        System.out.println("");
        System.out.println("Primer número\n" + com1[6].toString());
        System.out.println("");
        System.out.println("Segundo número\n" + com2.toString());
        System.out.println("");
        // Probamos el método Suma
        System.out.println("Suma\n" + com1[6].complejoSumaParam(real, imaginario).toString());
        System.out.println("");
        //Probamos el método Resta
        System.out.println("Resta\n" + com1[6].complejoRestaParam(real, imaginario).toString());
        System.out.println("");
        //Probamos el método Multiplicación
        System.out.println("Multiplicación\n" + com1[6].complejoProductoParam(real, imaginario).toString());
        System.out.println("");
        //Probamos el método División
        System.out.println("División\n" + com1[6].complejoCocienteParam(real, imaginario).toString());
        System.out.println("");
            
    }

    
}
