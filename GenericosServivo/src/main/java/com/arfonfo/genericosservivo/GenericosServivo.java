
package com.arfonfo.genericosservivo;

import java.util.ArrayList;

/**
 *
 * @author alfon
 */
public class GenericosServivo {

    public static void main(String[] args) {
        
        ArrayList<Animal> animales = new ArrayList<>();
        animales.add(new Animal("Jirafa"));
        animales.add(new Animal("Halcon"));
        animales.add(new Gato("Silvestre, lindo gatito"));
        
        // Con este sí funciona si el método recibe un ArrayList de animales
        muestra1(animales);
        
        // Pero si hacemos un ArrayList de Perro
        ArrayList<Perro> perros = new ArrayList<>();
        perros.add(new Perro("Pluto"));
        perros.add(new Perro("Toby"));
        
        // No acepta el arraylist de perros, por lo que hay pasarle un wildcard al método
        muestra1(perros);
        
        // No funciona porque el método está limitado para meter solo listas que sean de Servivo o superiores
        // cargaDatos(perros);
        
        ArrayList<Servivo> seresvivos = new ArrayList<>();
        
        cargaDatos(seresvivos);
        
        Double a = 7.0;
        
        muestraNum(a);
        
        
    }
    
    // También podemos hacer que extienda Servivo por si pasamos un ArrayList de Servivo
    public static void muestra1(ArrayList<? extends Servivo> listaAnimales){
        System.out.println("------------LISTADO DE ANIMALES--------------");
        for (Servivo a : listaAnimales) {
            System.out.println(a.toString());
        }
    }
    
    // Si solo añadimos el Wildcard no lo acepta, porque no reconoce el tipo
    // Tampoco funciona con extends - porque se podría pasar una lista de Gatos y no podemos añadir un Servivo, que está por encima
    // Por ello hay que limitar por debajo con super, para decirle que la lista mínima que le voy a pasar es de Servivo
    // y asegurar que el método va a poder introducir cualquier valor por debajo
    // si le pasáramos una lista de Animales con super, daría error si intentáramos meter un Servivo
    public static void cargaDatos(ArrayList<? super Servivo> listaAnimales){
        System.out.println("----CARGA DE SERES VIVOS-----");
        listaAnimales.add(new Gato("Luna"));
        listaAnimales.add(new Servivo("protozoo"));
        listaAnimales.add(new Animal("elefante"));
    }
    
    public static void muestraNum(Number e){
        System.out.println("------------ENTEROS--------------");
        System.out.println(e);
    }
    
    
}
