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



public class Gato extends Mamifero
{
 
 // @Override
  void dormir()     //Sobreescritura de método
  {
      super.dormir();
      System.out.println("El gato se pasa todo el día durmiendo");
  }
    
  void maullar()
  {
      System.out.println("Es lo que hacen los gatos");
  }
  
 
 
  @Override            //Sobreescritura de método
  void relacionar(Animal p)
  {
       System.out.println("Con el gato: " + p.nombre);
  }
  
  
  
}