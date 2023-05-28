
package Paquete_Principal;

import Paquete_Interfaz.*;
import Paquete_Clases.*;
import java.util.ArrayList;

/**
 *
 * @author arfon
 */
public class Ppal {

    public static void main(String[] args) {
        Integer entero1=5, entero2=7, entero3=8, entero4=9, entero5=0;
        Double real = 6.34;
        Character caracter='a';
        
        Pila cosasPila = new Pila(entero1, real, caracter);
        Cola cosasCola = new Cola(entero1, real, caracter);
        
        Pila pilaVacia = new Pila();
        
        cosasPila.anadir(entero2);
        cosasPila.anadir(entero3);
        cosasPila.anadir(entero4);
        cosasPila.anadir(entero5);
        
        cosasCola.anadir(entero2);
        cosasCola.anadir(entero3);
        cosasCola.anadir(entero4);
        cosasCola.anadir(entero5);
        
        
        System.out.println(cosasPila.toString());
        System.out.println(cosasCola.toString());
        
        System.out.println(cosasPila.estaVacia());
        System.out.println(cosasCola.estaVacia());
        System.out.println(cosasPila.primero());
        System.out.println(cosasCola.primero());
        System.out.println(cosasPila.extraer());
        System.out.println(cosasCola.extraer());
        System.out.println(cosasPila.primero());
        System.out.println(cosasCola.primero());
        
        System.out.println(pilaVacia.estaVacia());
        System.out.println(pilaVacia.primero());
        System.out.println(pilaVacia.extraer());
        
        
        ArrayList<ColeccionInterfaz> coleccion = new ArrayList();
        
        coleccion.add(cosasPila);
        coleccion.add(cosasCola);
        
        for (int i = 0; i < coleccion.size(); i++) {
            System.out.println(coleccion.get(i));
            
        }
        
        
        
    }
}
