
package com.arfonfo.proyectoautomoviles;

import java.util.Random;


public class Principal {


    public static String generarMatricula(){
        String letras = "BCDFGHJKLMNPRSTVWXYZ";
        String primeraLetra = "BCDFGHJKLM";
        String numeros = "0123456789";
        String matricula = "";
        
        for (int i = 0; i < 7; i++) {
            if(i < 4){
                matricula += numeros.charAt((int)(Math.random()*9+1));
            } else if(i==4){
                matricula += primeraLetra.charAt((int)(Math.random()*9+1));
            } else {
                matricula += letras.charAt((int)(Math.random()*19+1));
            }
        }
        return matricula;
    }
    
    public static void main(String[] args) {
//        Automovil auto1 = new Automovil();
//        Automovil auto2 = new Automovil();
//        Automovil auto3 = new Automovil();
//        Automovil auto4 = new Automovil();
        // Arrays con los datos que van a tener los automóviles creados
        String marcas[] = {"Renault", "Audi", "Mercedes", "Fiat", "Ford", "Mazda", "Lexus", "Volkswagen"};
        String modelos[] = {"Urbano", "Coupe", "Sedan", "Deportivo", "Suv", "Pickup", "Furgoneta", "Monovolumen"};
        String propietarios[] = {"Juan", "Alberto", "Alfonso", "Elena", "Fátima", "Raquel", "Irene", "Guillermo"};
        
        // Para la potencia hacer un Math.random entre 75cv y 200cv
        // Para el precio igual, pero el rango varía entre 10.000€ y 120.000€
        
        Automovil autos[] = new Automovil[10];
        
        for (int i = 0; i < autos.length; i++) {
            int posicion = (int) (Math.random()*8);
            
            String matricula = generarMatricula();
            int potencia = (int) ((Math.random()*126) +75);
            double precio = Math.round(((Math.random()*110001) +10000)*100)/100d;
            Random rd = new Random();
            autos[i] = new Automovil(matricula, marcas[posicion], modelos[posicion], propietarios[posicion], potencia, precio, rd.nextBoolean());
            if(autos[i]!=null){
                autos[i].Ver_Datos_Automovil();
            }
            System.out.println("");
        }
        
//        auto1.Introducir_Datos_Automovil();
//        auto4.Introducir_Datos_Automovil();
//        auto1.Ver_Datos_Automovil();
//        auto4.Ver_Datos_Automovil();
//        auto1.Cambiar_Datos_Automovil("9816KDH", "FORD", "FOCUS", "Alphone", 125, 18000, false);
//        auto1.Ver_Datos_Automovil();
//        System.out.println((auto1.Comparar_Potencia_Automoviles(auto4)) ? "Auto1 tiene más potencia que Auto4": "Auto4 tiene más potencia que Auto1");
//        System.out.println((Automovil.Comparar_Precio_Automoviles(auto1, auto4)) ? "Auto1 es más caro que Auto4": "Auto4 es más caro que Auto1");
        
        
    }
    
}
