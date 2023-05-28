/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arfonfo.proyectoherenciados;

/**
 *
 * @author Juan Pedro
 */
 

public class Mamifero extends Animal
{
   
    @Override
    void reproducir()                     //Sobreescritura de método
    {
        System.out.println("La reproduccion es vivipara");
    }
    
    //@Override
    void relacionar(Animal m)
    {
        System.out.println("Con el mamifero: " + m.nombre);
    }
}