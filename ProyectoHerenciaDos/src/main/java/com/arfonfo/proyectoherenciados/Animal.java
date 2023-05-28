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
 

public class Animal
{
    String nombre;
    
    void comer()
    {
        System.out.println("Necesita comer diarimente para sobrevivir");
    }
    
    void dormir()
    {
        System.out.println("Dormir es indispensable para descansar"); 
    }
    
    void reproducir()
    {
        System.out.println("Originar nuevos seres vivos");     
    }
    
    void relacionar(Animal a)
    {
        System.out.println("Con el animal: " + a.nombre);
    }
}
