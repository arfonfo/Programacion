
package com.arfonfo.proyectocolecccionespropio;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.TreeSet;
/**
 *
 * @author alfon
 */


class Test{
    public Integer num;
    
    Test(int num){
        this.num = new Integer(num);
    }
}


/////////////////////////////////////////////////
class persona{
    public String nombre;
    public String apellido1;
    public String apellido2;
    public double sueldo;
    public boolean sexo;
    
    persona(){
        this.nombre = this.apellido1 = this.apellido2 = "";
        sueldo=0.0;
        sexo=false;
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


/////////////////////////////////////////////////////
class latabla{
    HashMap<Integer, Integer> tabla;
    int numtabla;
    
    
    latabla(int num){
        this.tabla = new HashMap<Integer,Integer>();
        this.numtabla=num;
        
        // Rellenamos la tabla con su clave(i) y su valor(i*i)
        for (int i = 0; i < 10; i++) {
            tabla.put(i, i*num);
        }
        
    }
    
    public void verDatos(){
        // Recorremos las llaves
        for(Integer clave:tabla.keySet()){
            // Accedemos al valor de cada llave
            int valor=this.tabla.get(clave);
            System.out.println(this.numtabla + " * " + clave + " = " + valor);
        }
    }
    
    
    
}


public class ProyectoColecccionesPropio {

    public static void main(String[] args) {
        latabla mitabla = new latabla(5);
        mitabla.verDatos();
        
        
        
        ///////////////////////////////////////////////
        //Conjunto: colección de elementos no repetidos
        HashSet<Integer> conjunto = new HashSet<Integer>();
    
        for (int i =0; i<10; i++){
            conjunto.add(new Integer(i));
        }
        
        if(conjunto.add(new Integer(5))==false)
            System.out.println("Número ya existe en el conjunto");
        
        for (Integer i:conjunto)
            System.out.println("Elemento del conjunto" + i);
        
        
        //////////////////////////////////////////////////
        // En un treeset los elementos se insertan siempre de forma ordenada
        // Si hacemos un Treeset de una clase que hayamos creado
        // debemos asegurarnos que esa clase implements Comparable
        // y sobreescribe el método compareTo
        // El método compareTo:
        // Positivo: el objeto que lo ha llamado va después del objeto que recibe
        // Negativo: el objeto que lo ha llamado va antes
        // Cero: son iguales
        TreeSet<Integer> ts = new TreeSet<Integer>();
        
        ts.add(new Integer(4));
        ts.add(new Integer(3));
        ts.add(new Integer(1));
        if(ts.add(new Integer(99))==false)
            System.out.println("Duplicado");
        
        for (Integer t : ts) {
            System.out.println(t);
        }
        
        TreeSet<Character> ts2 = new TreeSet<Character>();
        ts2.add(new Character('h')); 

        ts2.add(new Character('z')); 

        ts2.add(new Character('y'));     

        ts2.add(new Character('a'));
        
        for (Character c : ts2) {
            System.out.println(c);
        }
        
        
        
        ///////////////////////////////////////////////////////
        // En un LinkedHashSet no hay orden
        // En lugar de utilizar los métodos de ArrayList
        // Utiliza los métodos de los LinkedList
        
        LinkedHashSet <Integer> t = new LinkedHashSet <Integer>();
        t.add(new Integer(4));

        t.add(new Integer(3));

        t.add(new Integer(1));

        t.add(new Integer(99));
        
        Iterator iterador = t.iterator();
        while(iterador.hasNext()){ // Mientras haya elementos
            Integer ent = (Integer) iterador.next(); // Es necesario castear
            // Nos devuelve un objeto que es el índice del Integer
            System.out.println(ent.intValue());
        }

        for (Integer i:t) 
            System.out.println(i);
        
        
        
        /////////////////////////////////////////////////
        // Solo se pueden guardar objetos
        // Los Map guardan parejas de objetos: clave:valor
        // No se pueden repetir las claves
        
        HashMap<String, Integer> hm = new HashMap<String, Integer>();
        
        hm.put("11111111A", 10000);
        hm.put("22222222B", 20000);
        hm.put("33333333C", 30000);
        hm.put("44444444D", 40000);

        hm.put("44444444D", 80000);

        int sueldo = hm.get("44444444D");
        
        System.out.println("Sueldo " + sueldo);
        
        hm.remove("44444444D");
        
        try {
            sueldo = hm.get("");
            System.out.println("El sueldo del empleado " + sueldo);
        } catch(NullPointerException e){
            System.out.println("Error en clave");
        } catch (Exception e) {
            System.out.println("Error General");
        }
        
        
        ////////////
        HashMap <Integer, Integer> mapa = new HashMap<Integer, Integer>();
        
        // Insertamos datos de prueba en el mapa
        for (int i = 0; i < 10; i++) {
            mapa.put(i, i*i);
        }
        
        // Recorremos el conjunto generado por KeySet
        // que tiene las llaves
        for (Integer llave : mapa.keySet()) {
            // Obtenemos el valor
            Integer valor = mapa.get(llave);
            System.out.println("Clave: " + llave + "  Valor: " + valor.intValue());
        }
        
        
        
        ////////////////////////
        HashMap<String, persona> hm2 = new HashMap<String, persona>();
        
        persona p1 = new persona("Pepe", "Ruiz", "Sanchez", 25000, true);
        
        hm2.put("11111111A", p1);
        hm2.put("22222222B", new persona("Ana", "Moreno", "Ortiz", 100000, false));    
        hm2.put("33333333C", new persona("Felipe", "González", "Orbegozo", 30000, true));    
        hm2.put("44444444D", new persona("Ernesto", "Rocamora", "Martínez", 40000, true));
        
        try {
            persona per = hm2.get("44444444D");
            
            per.verDatos();
            
        } catch (NullPointerException e) {
            System.out.println("Error, la persona no existe en la base de datos");
        } catch (Exception e){
            System.out.println("Error general");
        }
        
        // Recorremos el conjunto generado de personas
        for(String clave:hm2.keySet()){
            persona per=hm2.get(clave);
            System.out.println("DNI: " + clave);
            per.verDatos();
        }
        
        
        ///////////////////////////////////////////////////////
        // En este ejemplo HashMap contendrá para cada clave un objeto
        // un objeto de la clase mitabla
        // que a su vez contiene un hashmap
        
        HashMap<Integer, latabla> tablageneral = new HashMap<Integer, latabla>();
        
        for (int i = 0; i < 10; i++) {
            latabla mitabla2 = new latabla(i);
            tablageneral.put(i, mitabla2);
        }
        
        // Recorremos el conjunto generado por KeySet
        for (Integer clave : tablageneral.keySet()) {
            System.out.println("Tabla del número: " + clave + " ");
            // Se puede hacer así o declara un objeto latabla
            tablageneral.get(clave).verDatos();
            System.out.println("________________________________");
        }
        
        
        ArrayList<Integer> arrEnt = new ArrayList<Integer>();
        System.out.println(arrEnt.add(9));
        
        arrEnt.add(1, 9);
        
        //int rep = arrEnt.set(1, 10);
        
        //System.out.println(rep);
        
        System.out.println(arrEnt.get(0));
        System.out.println(arrEnt.get(1));
        
        
        System.out.println(arrEnt.remove(new Integer(9)));
        
        System.out.println(arrEnt.size());
        System.out.println(arrEnt.get(0));
        // Ha borrado el último 9 que hemos insertado, por eso
        // da error al intentar imprimirlo
        System.out.println(arrEnt.get(1));
        
        
    }
    
    
}
    
    
    
