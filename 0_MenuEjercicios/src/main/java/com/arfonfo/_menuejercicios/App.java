
package com.arfonfo._menuejercicios;

import java.util.Scanner;


public class App {

    public static void main(String[] args) {
        int ejercicio;
        Scanner teclado = new Scanner(System.in);
        
        
        do {
            System.out.println("");
            System.out.println("");
            System.out.println("*******************************************************");
            System.out.println("Introduce el número del ejercicio que quieres realizar: ");
            System.out.println("1. Calcula el perímetro de un rectángulo");
            System.out.println("2. Pasar temperatura de Celsius a Farenheit");
            System.out.println("3. Calcular el área y el volumen de un cilindro");
            System.out.println("4. Resolver ecuación de primer grado: ax + b = 0");
            System.out.println("5. Calcular la energía de un cuerpo a través de su masa");
            System.out.println("6. Convertir kilómetros a millas");
            System.out.println("7. Calcular IMC de 5 personas");
            System.out.println("8");
            System.out.println("9");
            System.out.println("10. Calcular suma de las potencias de 2 de 2 números");
            System.out.println("11. Contar el número de Ceros entre 10 números");
            System.out.println("12. Contar el número de CEROS");
            System.out.println("13");
            System.out.println("14");
            System.out.println("15");
            System.out.println("16");
            System.out.println("17");
            System.out.println("18");
            System.out.println("19");
            System.out.println("20");
            System.out.println("21");
            System.out.println("22");
            System.out.println("23");
            System.out.println("24");
            System.out.println("25");
            System.out.println("26");
            System.out.println("27");
            System.out.println("28");
            System.out.println("29");
            System.out.println("30");
            System.out.println("31");
            System.out.println("32");
            System.out.println("0. Salir");
            
            ejercicio = teclado.nextInt();
            
            switch (ejercicio) {
                case 0:
                    System.out.println("Salió del Programa");
                    break;
                case 1:
                    Ejercicio1_Perimetro.calculoPerimetro();
                    break;
                case 2:
                    Ejercicio2_Temperatura.calculoTemperatura();
                    break;
                case 3:
                    Ejercicio3_Cilindro.radioVolumen();
                    break;
                case 4:
                    Ejercicio4_Ecuacion.ecuacionPrimergrado();
                    break;
                case 5:
                    Ejercicio5_Energia.masaEnergia();
                    break;
                case 6:
                    Ejercicio6_kmMillas.kmMillas();
                    break;
                case 7:
                    Ejercicio7_IMC.imc();
                    break;
                case 8:
                    
                    break;
                case 9:
                    
                    break;
                case 10:
                    int numero1, numero2;
                    System.out.println("Introduce el primer número: ");
                    numero1 = teclado.nextInt();
                    
                    System.out.println("Introduce el segundo número: ");
                    numero2 = teclado.nextInt();
                    
                    System.out.println("La suma de las potencias de 2 de los números es: " + Ejercicio10_SumaPotenciasDos.SumaPotencias(numero1, numero2));
                    break;
                case 11:
                    System.out.println("El número de ceros es: " + Ejercicio11_NumerosIgualesCero.IgualesCero());
                    break;
                case 12:
                    System.out.println("El número de ceros es: " + Ejercicio12_NumerosIgualesCero2.NumerosCero());
                    break;
                case 13:
                    
                    break;
                case 14:
                    
                    break;
                case 15:
                    
                    break;
                case 16:
                    
                    break;
                case 17:
                    
                    break;
                case 18:
                    
                    break;
                case 19:
                    
                    break;
                case 20:
                    
                    break;
                case 21:
                    
                    break;
                case 22:
                    
                    break;
                case 23:
                    
                    break;
                case 24:
                    
                    break;
                case 25:
                    
                    break;
                case 26:
                    
                    break;
                case 27:
                    
                    break;
                case 28:
                    
                    break;
                case 29:
                    
                    break;
                case 30:
                    
                    break;
                case 31:
                    
                    break;
                case 32:
                    
                    break;
                default:
                    System.out.println("Selecciona un número entre el 1 y el 32");
            }
            
        } while (ejercicio!=0);
    }
}
