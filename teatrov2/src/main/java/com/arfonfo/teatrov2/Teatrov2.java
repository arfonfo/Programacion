

package com.arfonfo.teatrov2;
import java.util.ArrayList;
import java.util.Arrays;
import paq_Clases.Funcion;
import paq_Clases.Teatro;
/**
 *
 * @author alfon
 */
public class Teatrov2 {

    public static void main(String[] args) {
        try{
           Funcion func = new Funcion("Obra1", 30);
           Funcion func2 = new Funcion("Obra2", 30);
           Funcion func3 = new Funcion("Obra3", 30);
           Funcion func4 = new Funcion("Obra4", 30);
           Funcion func5 = new Funcion("Obra5", 30);
           
           // Si no pongo el sout dentro del try no me reconoce func
           System.out.println(func.toString());
           
           Funcion[] funciones = {func, func2, func3, func4};
           
           Teatro tea = new Teatro("Vivaldi");
           
           tea.addFuncion(func5);
           
            System.out.println(tea.containsFuncion(func));
            
           tea.removeFuncion(func5);
           tea.addFuncion(func);
           tea.addFuncion(func2);
           tea.addFuncion(func3);
           tea.addFuncion(func4);
           
//           tea.removeFuncion(func3);
           tea.addFuncion(func5);
           
           System.out.println(tea.toString());
           
           // Aunque se llaman y valen lo mismo
           // El método busca el objeto func, no func2
           // por ubicación en memoria
           // por eso no lo encuentra
//           tea.removeFuncion(func2);
           
        } catch(IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        } catch(Exception e){
            System.out.println(e);
        }
        
        
        int[] p = new int[10];
        p[0]=1;
        p[1]=2;
        p[2]=3;
        
        String cadena = Arrays.toString(p).replaceAll("0", "");
        
        for (int i = 0; i < p.length; i++) {
            if(p[i] != 0)
                cadena = cadena.concat(Integer.toString(p[i]) + "\n");
        }
        
        
        System.out.println(cadena);
        
//        ArrayList enteros = new ArrayList();
//        enteros.add(3);
//        enteros.add(5);
//        enteros.add(6);
//        enteros.add(7);
//        
//        System.out.println(enteros);
//        
//        Teatro t = new Teatro("Romea", enteros);
//        
//        System.out.println(t.toString());
        
        
        
        
    }
}
