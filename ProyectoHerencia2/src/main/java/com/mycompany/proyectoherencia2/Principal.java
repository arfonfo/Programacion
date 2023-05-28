/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectoherencia2;

import com.arfonfo.proyectoherenciados.Mamifero;
import com.arfonfo.proyectoherenciados.Animal;
import com.arfonfo.proyectoherenciados.Perro;
import com.arfonfo.proyectoherenciados.Gato;

/**
 *
 * @author Juan Pedro
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        
           
        
       Perro toby = new Perro();
       
       toby.comer();
       toby.dormir();
       toby.gruñir();
       toby.ladrar();
       toby.reproducir();
        
            
       Animal culebra = new Animal();
       Mamifero ballena = new Mamifero();
       Perro perrito = new Perro();
       Animal jacobo = new Animal();
       Gato gatito =new Gato();
       
       jacobo = culebra;
       jacobo.comer();
       jacobo=ballena;
       jacobo.reproducir();
       jacobo=perrito;
       jacobo.dormir();
       jacobo = gatito;
       
        System.out.println("perrito: " + perrito.ToString());
  
     
        
        jacobo = perrito;
        
        
        if (jacobo instanceof Animal)
            System.out.println("Ahora mismo jacobo es un animal");
       
        if (jacobo instanceof Mamifero)
                        System.out.println("Ahora mismo jacobo es un mamifero");
      
        if  (jacobo instanceof Perro)
                        System.out.println("Ahora mismo jacobo es un perro");
       
        if  (jacobo instanceof Gato)
                        System.out.println("Ahora mismo jacobo es un lindo gatito");
         
        
       
       
       
       
       
    }
    
}
