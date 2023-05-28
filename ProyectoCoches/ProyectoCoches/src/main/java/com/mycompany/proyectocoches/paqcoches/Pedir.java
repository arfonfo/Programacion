/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectocoches.paqcoches;

/**
 *
 * @author Profesor
 */
public class Pedir {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        Coches c1 = new Coches();
        Coches c2 = new Coches("Seat", "Leon es un modelo de seat", "Rojo", "Gasolina", "Manual", 7, 20000);
        Coches c3 = new Coches(c2);
        
        System.out.println(c1.toString());
        c2.ver_Datos();
        c3.ver_Datos();
        
        System.out.println("Numero puertas c2: " + c2.getNumpuertas());
        c2.setNumPuertas(3);
        
        System.out.println("Numero puertas c2: " + c2.getNumpuertas());
        
        c3.setDatos("Lamborghini", "Huracán", "Negro", "Gasolina", "Manual", 7, 50000);
        System.out.println(c3.toString());
        
        if (c2.equals(c3))
            System.out.println("C2 y C3 son iguales");
        else
            System.out.println("C2 y C3 NO son iguales");
        
           
    }
    
}
