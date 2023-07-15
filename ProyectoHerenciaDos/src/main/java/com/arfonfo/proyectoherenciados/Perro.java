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
 
public class Perro extends Mamifero
{
 
 // @Override
  void dormir()     //Sobreescritura de método
  {
      super.dormir();
      System.out.println("El perro debe dormir en funcion del ejericio que realiza");
  }
    
  void ladrar()
  {
      System.out.println("Es una labor social de guarda");
  }
  
  void gruñir()
  {
      System.out.println("Es un sonido ronco y sostenido");
  }
 
  @Override            //Sobreescritura de método
  void relacionar(Animal p)
  {
       System.out.println("Con el perro: " + p.nombre);
  }
  
  
  String ToString()
  {
      return this.nombre;
  }
  
}