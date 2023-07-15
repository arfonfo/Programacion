/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.arfonfo.proyectoherenciados;

/**
 *
 * @author alfon
 */
public class ProyectoHerenciaDos {

    public static void main(String[] args) {
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
