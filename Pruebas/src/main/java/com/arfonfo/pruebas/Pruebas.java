

package com.arfonfo.pruebas;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 *
 * @author alfon
 */


class interfaz1<T> {
    public static final double PROP = 5;
    
    public void mostrar(T t){System.out.println(t);};
}


public class Pruebas{

    public static void main(String[] args) {
        
        ArrayList<Double> m1 = new ArrayList<>();
        m1.add(8.0);
        m1.add(9.2);
        m1.add(10.3);
        
        ver_arraylist(m1);
        
        TreeMap<Integer, String> cosas = new TreeMap();
        
        Collection<String> s1;
        
        // Es necesario guardarlo en la superClase Collection
        s1 = cosas.values();
        // NO SE PUEDE
        //ArrayList ar2 = (ArrayList)s1;
        
        //System.out.println(ar2.toString());
        
        
        HashMap<Object, Object> mapa = new HashMap();
        
        mapa.put(2, "Hola");
        
        Integer[] enteros = {1, 2, 3, 4};
        Double[] dobles = {1.0, 2.0, 3.0, 4.0};
        Vector<Double> v2 = new Vector(dobles);
        Vector<Integer> v1= new Vector(enteros);
        
        Long[] largos = {1l, 2l, 3l, 4l};
        Vector<Long> v3 = new Vector(largos);
        
        System.out.println(v1.compararMedia(v3));
        
    }
    
    
    public static void ver_arraylist(ArrayList <? extends Number> m)
    {  //Muestra el contenido de un arraylist teniendo en cuenta los tipos de objetos que almacena
        for (int i = 0; i < m.size(); i++) 
        {
            System.out.println(m.toString());
        }     
    }


}
