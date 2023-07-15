
package com.arfonfo.ej34_terramitica;

import java.util.Scanner;


public class Ej34_TerraMitica {

    public static void main(String[] args) {
        int edad, caja = 0, ninyosMenores = 0, ninyosMayores = 0, adultos = 0; 
        Scanner teclado = new Scanner(System.in);
        
        do {
            
            System.out.println("*******  INTRODUCE -1 PARA SALIR DEL PROGRAMA *******");
            System.out.println("¿Cuál es tu edad?");
            edad = teclado.nextInt();
            if (edad==-1){
                break;
            }
            if(edad < 4){
                    ninyosMenores++;
                } else if(edad >=4 && edad <=12) {
                    caja = caja + 20;
                    ninyosMayores++;
                } else {
                    caja = caja + 40;
                    adultos++;
                }
            
        } while (edad != -1);
        
        System.out.println("Han entrado " + ninyosMenores + " niños menores de 4 años");
        System.out.println("Han entrado " + ninyosMayores + " niños entre 4 y 12 años");
        System.out.println("Han entrado " + adultos + " adultos");
        System.out.println("En total han entrado " + (ninyosMenores+ninyosMayores+adultos) + " en Terra Mítica");
        System.out.println("La caja de hoy asciende a " + caja + " €");
        
        
        
    }
}
