/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectocolecciones;
import java.util.*;

/**
 *
 * @author Juan Pedro
 */

abstract class otra implements Collection
{
    
}

interface micoleccion extends Collection
{
    public void otrometodo();
}

abstract class otraclase implements micoleccion
{
    otraclase()
    {
        
    }
    
    @Override
    public void otrometodo()
    {
        
    }
}






class miclase
{
    public int at1;
    public int at2;
    
    miclase(int a,int b)
    {
        this.at1 = a;
        this.at2 = b;
    }
    
    public void metodo1()
    {
        System.out.println("at1: " + this.at1 + "    at2: " + this.at2); 
        System.out.println("____________________________");
    }
    
    public int getAt1()
    {
        return this.at1;
    }
    
    public int getAt2()
    {
        return this.at2;
    } 
    
    public void setAt(int a,int b)
    {
        this.at1 = a;
        this.at2 = b;
    }
                
}



class miclase2
{
    public int at1;
    public int at2;
    
    miclase2(int a,int b)
    {
        this.at1 = a;
        this.at2 = b;
    }
    
    public void metodo2()
    {
        System.out.println("at1: " + this.at1 + "    at2: " + this.at2); 
        System.out.println("____________________________");
    }
    
    public int getAt1()
    {
        return this.at1;
    }
    
    public int getAt2()
    {
        return this.at2;
    } 
    
    public void setAt(int a,int b)
    {
        this.at1 = a;
        this.at2 = b;
    }
                
}


public class Principal 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        
        
        
        ////////////////////////////////////////////////////////////////////////////
        //int a[];    //Creación de array de enteros
        //a = new int[5];
        
        //miclase b[];   //Creación de array de objetos de miclase
        //b = new miclase[5];
        
        
        
        
        
        
        ////////////////////////////////////////////////////////////////////
        //ArrayList de objetos de la clase entero
         
      
        ArrayList <Integer> miarray;
        miarray = new ArrayList <Integer>();  //Declaración y creación
        
        
        for (int i = 0; i < 10; i++) 
            miarray.add(i*10);                 //Añadimos 10 elementos al arraylist
        
        for (int i = 0; i < miarray.size(); i++) 
            System.out.println(miarray.get(i));   //Obtenemos los 10 objetos insertados previamente y mostramos sus valores
        
        System.out.println("________________________________");
        
        System.out.println("Posición del valor 20: " + miarray.indexOf(20));   // Obtenemos la posición del elemento cuyo valor es 20
        
        
        
        miarray.remove(5);                 //Eliminamos el elemento que ocupa la posición 5
        
        
        for (int i = 0; i < miarray.size(); i++) 
            System.out.println(miarray.get(i));
        System.out.println("________________________________");        
        
      
        miarray.set(0, 99);                //Actualizamos con el valor 99 el objeto de la posición 0
        miarray.set(miarray.indexOf(20), 999);  //Actualizamos con el valor 999 el objeto cuya posición tiene el valor 20
        
          
         
        for (int i = 0; i < miarray.size(); i++) 
            System.out.println(miarray.get(i));   //Mostramos los valores de los objetos del arraylist
        System.out.println("________________________________");      
        
       // Otra forma de recorrer el array
        for(Integer inte:miarray)
            System.out.println( inte.intValue() );
        System.out.println("________________________________");    
      
         
        
        
        
        
        
        ////////////////////////////////////////////////////////////////////
        //ArrayList de objetos de la clase miclase
        
       
        ArrayList <miclase> miArray = new ArrayList <miclase> ();   //Declaramos y creamos un arraylist de objetos de miclase
        
        for (int i = 0; i < 5; i++) 
        {
            miclase m = new miclase(i,i);   
            
            miArray.add(m);  //Insertamos 5 objetos de miclase en el arraylist
            
        }
        
        
        for (int i = 0; i < miArray.size(); i++) 
            miArray.get(i).metodo1();   //Mostramos los valores que almacenan los objetos del arraylist
        
     
       miclase m;
       m = miArray.get(2);       //Dejamos en el objeto m el objeto que ocupa la posición2 en el arraylist
 
       
       m.metodo1();               //Mostramos los valores del objeto m
       System.out.println("*********************************");
       
       m.setAt(99, 99);           //Modificamos los valores del objeto m
       
       
       for (int i = 0; i < miArray.size(); i++) 
            miArray.get(i).metodo1();  //Mostramos los valores que almacenan los objetos del arraylist
                                       //Se ha modificado también el objeto del arrayList 
      
       if (miArray.contains(m))         //Este método sirve para comprobar si un objeto está dentro de un arrayList
            System.out.println("El objeto existe");
       else
            System.out.println("El objeto NO existe");           
           
      
       System.out.println("El número de elementos de miArray es: " + miArray.size());
    
     
       
      // miArray.remove(7);  //Error puees no hay ningún objeto en dicha posición
       
          
       try
       {
         //miArray.remove(miArray.get(3));
        miArray.remove(7);    //Ahora el error se controla a través de un try..catch
        //miArray.remove(m);
        
        System.out.println("Elemento borrado");
       
       }
       catch ( java.lang.IndexOutOfBoundsException e) {System.out.println("Elemento NO existe"); }
       
        for (int i = 0; i < miArray.size(); i++) 
                miArray.get(i).metodo1();
            
           
      
       System.out.println("El número de elementos de miArray es: " + miArray.size());
        
       m.metodo1(); 
       
       
       //Otra forma de recorrer un arrayList es a través de un objeto Iterator que se asocia con él.
       miclase mi;
       Iterator iterador= miArray.iterator();
       
       while(iterador.hasNext())
       { 
            mi= (miclase) iterador.next();
            
            mi.metodo1();
       }
       
       
          
      
       
        
        
       
      
        ////////////////////////////////////////////////////////////////////
        //ArrayLIst que contiene elementos de diferentes clases 
        
        
        
        ArrayList al = new ArrayList ();
        al.add(new miclase(1,1));
        al.add(new Integer(8));
        al.add(new miclase2(6,7));
        
        
        
      
   
    
        ////////////////////////////////////////////////////////////////////
        //ArrayLIst que contiene elementos de diferentes clases, es equivalente al caso anterior        
        
        //Declaramos y creamos un arrayList que contendrán objetos de la clase Object.
        //Como Object es la superclase de Java, admite objetos de cualquier clase
       
        ArrayList <Object> miarraylist = new ArrayList <Object>();
        
        for (int i = 0; i < 5; i++) 
        {
            miclase c = new miclase(i,i);
            
            miarraylist.add(c);  
        }
        
        
        for (int i = 0; i < 5; i++) 
        {
            miclase2 c = new miclase2(i,i);
            
            miarraylist.add(c);  
        }
        
        
        System.out.println("Tamaño del arraylist: " + miarraylist.size());
        
        Principal.ver_arraylist(miarraylist);
        
        int posicion = (int) (Math.random()*10);
        System.out.println("Voy a borrar el elemento de posición: " + posicion);
        
        miarraylist.remove(posicion);
        
        Principal.ver_arraylist(miarraylist);
        
        
        miarraylist.remove(Math.random()*10);
        
        
        System.out.println("Hago copia de miarraylist: ");
        
        ArrayList <Object> m3 = new ArrayList <Object>();
        m3 = Principal.copiar_arraylist(miarraylist);
        Principal.ver_arraylist(m3);
        
        
    }
    
    public static void ver_arraylist(ArrayList <Object> m)
    {  //Muestra el contenido de un arraylist teniendo en cuenta los tipos de objetos que almacena
        for (int i = 0; i < m.size(); i++) 
        {
            if (m.get(i) instanceof miclase)
            {
                miclase m1;
                m1 = (miclase) m.get(i);
                m1.metodo1();
            }
            
            if (m.get(i) instanceof miclase2)
            {
                miclase2 m2;
                m2 = (miclase2) m.get(i);
                m2.metodo2();            
            }
        }     
    }
    
    
    public static ArrayList <Object> copiar_arraylist(ArrayList <Object> m)
    {
        //Hace una copia de un arraylist en otro
        
        ArrayList <Object> m2 = new ArrayList <Object>();
        
        m2.addAll(m);
        
        return m2;
    }
    
    
}
