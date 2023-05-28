/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectocolecciones2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;

/**
 *
 * @author Profesor
 */
/////////////////////////////////////////////////////////////////////////////////
class Test
{
    public Integer num;

    Test (int num) 
    { 
        this.num=new Integer(num); 
    }
}




/////////////////////////////////////////////////////////////////////////////////
class persona
{
    public String nombre;
    public String apellido1;
    public String apellido2;
    public double sueldo;
    public boolean sexo;
    
    persona()
    {
        nombre = apellido1 = apellido2 = "";
        sueldo = 0.0;
        sexo   = false;
    }
    
    persona(String n,String ap1,String ap2,double s,boolean se)
    {
        nombre = n;
        apellido1 = ap1;
        apellido2 = ap2;
        sueldo = s;
        sexo   = se;
    }
    
    public void verDatos()
    {
        System.out.println("Nombre: " + nombre + " Apellido1: " + apellido1 + " Apellido2: " + apellido2 + " sueldo: " + sueldo + " sexo :" + sexo);        
        System.out.println("_________________________________");
    }
    
}



/////////////////////////////////////////////////////////////////////////////////
class latabla
{
   HashMap <Integer,Integer> tabla;
   
   int numtabla;
   
   latabla(int num)
   {
       tabla= new HashMap <Integer,Integer>();
       
       numtabla = num;
       
       for (int i = 0; i < 10; i++) 
            tabla.put(i,i*num);      
   }
   
   public void verDatos()
   {
         for (Integer clave:tabla.keySet()) // Recorremos el conjunto generado por keySet, contendrá las llaves. 
         {
            int valor =this.tabla.get(clave); //Para cada llave, accedemos a su valor si es necesario. 
            System.out.println(numtabla +  " * " + clave +  " = " + valor);
         }
   }
}



/////////////////////////////////////////////////////////////////////////////////
public class Principal 
{
   
    public static void main(String[] args) 
    {
        // TODO code application logic here
        
   ///////////////////////////////////////////////////////////    
   //Uso de iteradores en ArrayList 
       
    ArrayList <Integer> lista=new ArrayList<Integer>();

    for (int i=0;i<10;i++) 
        lista.add(new Integer(i));
    
    Iterator <Integer> it=lista.iterator();

    while (it.hasNext()) 
    {
            Integer t=it.next();
            if (t%2==0) it.remove();
    }
  
    for (int i = 0; i < lista.size(); i++)    
            System.out.println(lista.get(i).intValue());

        
    for (Integer i: lista) 
        System.out.println("Elemento:" + i); // Muestra la lista.  


 ///////////////////////////////////////////////////////////    
    //Lista doblemente enlazada

   
    LinkedList<Integer> lili=new LinkedList<Integer>(); // Declaración y creación del LinkedList de enteros.

      
    lili.add(1); // Añade un elemento al final de la lista.

    lili.add(3); // Añade otro elemento al final de la lista.

    lili.add(1,2); // Añade en la posición 1 el elemento 2.

    lili.add(lili.get(1)+lili.get(2)); // Suma los valores contenidos en la posición 1 y 2, y lo agrega al final.

       
    lili.remove(0); // Elimina el primer elementos de la lista.

  //  for (int i = 0; i < lili.size(); i++) 
  //      System.out.println("Elemento:" + lili.get(i).intValue()); // Muestra la lista.  
     
    for (Integer i: lili) 
        System.out.println("Elemento:" + i); // Muestra la lista.  

    
        
        
        
 ///////////////////////////////////////////////////////////   
 // Ahora el LinkeedList contendrá objetos de una clase definidad por el usuario


    Test p1=new Test(11); // Se crea un objeto Test donde el entero que contiene vale 11.

    Test p2=new Test(12); // Se crea otro objeto Test donde el entero que contiene vale 12.

    LinkedList<Test> lili2=new LinkedList<Test>(); // Creamos una lista enlazada para objetos tipo Test.

    lili2.add(p1); // Añadimos el primero objeto test.

    lili2.add(p2); // Añadimos el segundo objeto test. 
   
 //   for (int i = 0; i < lili2.size(); i++) 
 //       System.out.println("Elemento:" + lili2.get(i).num); // Muestra la lista.  

    for (Test i:lili2 )
        System.out.println("Elemento:" + i.num); // Muestra la lista.          

    
    
    p1.num=44; 

    for (Test p:lili2) 
        System.out.println("Elemento:" + p.num);    // Muestra la lista. 
   
    lili2.get(1).num = 99;
    
    System.out.println("p2.num: " + p2.num);
    
    
    
    //El resultado de ejecutar el código anterior es que se muestran los números 44 y 12. 
    //El número ha sido modificado y no hemos tenido que volver a insertar el elemento en la lista para que en la lista se cambie también. 
    //Esto es porque en la lista no se almacena una copia del objeto Test, sino un apuntador a dicho objeto
    //(solo hay una copia del objeto a la que se hace referencia desde distintos lugares). 
   
      
    
    
    
    ///////////////////////////////////////////////////////////        
    //Conjunto: colección de elementos no repetidos 

 
 
    HashSet <Integer> conjunto=new HashSet <Integer> ();

    for (int i = 0; i < 10; i++) 
         conjunto.add(new Integer(i));
    
    if (conjunto.add(new Integer(5))==false) 
        System.out.println("Número ya existe en el conjunto");

    for (Integer i: conjunto) 
     System.out.println("Elemento almacenado:" +i); 
 
   
  
        
    ///////////////////////////////////////////////////////////   
    //En un treeset los elementos se insertan siempre de forma ordenada    
    
    TreeSet <Integer> ts = new TreeSet <Integer>();     

    ts.add(new Integer(4)); 
    
    ts.add(new Integer(3));
    
    ts.add(new Integer(1));

    ts.add(new Integer(99));

    for (Integer i:ts) 
        System.out.println(i);
    
         
    
    TreeSet <Character> ts2 = new TreeSet <Character>();     

    ts2.add(new Character('h')); 

    ts2.add(new Character('z')); 
    
    ts2.add(new Character('y'));     

    ts2.add(new Character('a'));     
    
    for (Character i:ts2) 
        System.out.println(i);    
        
 
        
        
 ///////////////////////////////////////////////////////////    
    //En un LinkedHashSet no hay orden     
   
    LinkedHashSet <Integer> t = new LinkedHashSet <Integer> ();     

    t.add(new Integer(4));

    t.add(new Integer(3));

    t.add(new Integer(1));

    t.add(new Integer(99));

    for (Integer i:t) 
        System.out.println(i);

 
        
        
        
///////////////////////////////////////////////////////////    
    //Los Map guardan parejas de objetos:   clave:valor
    // No se pueden repetir las claves
  
 
    HashMap <String,Integer> hm=new HashMap <String,Integer>();
    
    
    hm.put("11111111A", 10000);
    hm.put("22222222B", 20000);
    hm.put("33333333C", 30000);
    hm.put("44444444D", 40000);
 
      
    hm.put("44444444D", 80000);

    
    int sueldo = hm.get("44444444D");
    
    System.out.println("Sueldo: " + sueldo);
 
    hm.remove("44444444D");
  
    try
    {
        sueldo = hm.get("33333333C");
    
        System.out.println("El sueldo del empeado es: " + sueldo);
    }
    catch (java.lang.NullPointerException e) {System.out.println("Error en clave");}
    catch (Exception e) {System.out.println("Error GENERAL");}    
       
    
        
        
        
        
    
    HashMap <Integer,Integer> mapa = new HashMap <Integer,Integer> ();

    
    for (int i=0;i<10;i++) 
        mapa.put(i, i*i); // Insertamos datos de prueba en el mapa.

     
            
    for (Integer llave:mapa.keySet()) // Recorremos el conjunto generado por keySet, contendrá las llaves.
    {
           Integer valor=mapa.get(llave); //Para cada llave, accedemos a su valor si es necesario. 
           
           System.out.println("Clave: " + llave + "   Valor: " + valor.intValue());
    }
 
    
        
        
        
        
    HashMap <String,persona> hmp=new HashMap <String,persona>();
    
    persona p11 = new persona("Pepe", "Ruiz", "Sanchez", 25000, true);
    
    hmp.put("11111111A", p11);
    hmp.put("22222222B", new persona("Ana", "Moreno", "Ortiz", 100000, false));    
    hmp.put("33333333C", new persona("Felipe", "González", "Orbegozo", 30000, true));    
    hmp.put("44444444D", new persona("Ernesto", "Rocamora", "Martínez", 40000, true));        
    
    
    try
    {
        persona per = hmp.get("44444444D");
    
        System.out.println("El sueldo del empleado es: " + per.sueldo);
        per.verDatos();
    }
    catch (java.lang.NullPointerException e) {System.out.println("Error, la persona no existe en la base de datos");}
    catch (Exception e) {System.out.println("Error GENERAL");}    
     
        System.out.println("*******************************************");
    
    
    for (String clave:hmp.keySet()) // Recorremos el conjunto generado por keySet, contendrá las llaves.
    {
           persona per=hmp.get(clave); //Para cada llave, accedemos a su valor si es necesario. 
           
           System.out.print("DNI: " + clave +  " ");
           per.verDatos();
    }
    System.out.println("___________________________________");

    
  //////////////////////////////////////////////////////////////////
  //En este ejemplo es HasMap contendrá para cada clave un objeto de la clase latabla 
  //que a su vez contendrá un hashmap
    
    HashMap <Integer,latabla> tablageneral = new HashMap <Integer,latabla>();
    
    for (int i = 0; i < 10; i++) 
    {
        latabla mitabla = new latabla(i);
        tablageneral.put(i, mitabla);
    }
    
    
    for (Integer clave:tablageneral.keySet()) // Recorremos el conjunto generado por keySet, contendrá las llaves.
    {
           latabla lt = tablageneral.get(clave); //Para cada llave, accedemos a su valor si es necesario. 
           
           System.out.println("Tabla del número; " + clave +  " ");
           lt.verDatos();
           System.out.println("__________________________________");
    }
     
   }
    
  
    
}
