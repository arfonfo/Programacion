
package com.arfonfo.pruebas;

import java.lang.reflect.Array;

/**
 *
 * @author alfon
 * @param <E>
 */
public class Vector<E extends Number> {
    private E[] vector;
    private int tamanio;
    
    public Vector(E[] e){
        this.vector=e;
    }
    
    public Vector(Class <E> clase, int tamanio){
        try {
            if(tamanio<0)
                throw new IllegalArgumentException("Tamaño menor de cero");
            this.tamanio=tamanio;
            vector = (E[])Array.newInstance(clase, tamanio);
        } catch (IllegalArgumentException e) {
            System.out.println(e.toString());
        }
    }
    
    
    public void set(int indice, E elemento){
        try {
            if(indice<0 || indice>=this.tamanio)
                throw new ArrayIndexOutOfBoundsException("Error. Índice fuera de rango");
            this.vector[indice] = elemento;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error" + e.toString());
        }
        
    }
    
    
    public E get(int indice){
        try {
            if(indice<0 || indice>=this.tamanio)
                throw new ArrayIndexOutOfBoundsException("Error. Índice fuera de rango");
            return this.vector[indice];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error" + e.toString());
            return null;
        }
    }
    
    
    public int elementos(){
        // length devuelve un int
        return this.vector.length;
    }
    
    public void mostrar(){
        for (int i = 0; i < vector.length; i++) {
            if(this.get(i)!=null)
                System.out.println("Posición " + i + " número: " + this.get(i));
        }
    }
    
    public E maximo(){
        E max = this.vector[0];
        for(E e : vector){
            if (e!=null)
                if(e.doubleValue()>max.doubleValue()){
                    max=e;
                }
        }
        return max;
    }
    
    public E minimo(){
        E min = this.vector[0];
        for(E e : vector){
            if (e!=null)
                if(e.doubleValue()<min.doubleValue()){
                    min=e;
                }
        }
        return min;
    }
    
    public boolean EstaX(E e){
        for (int i = 0; i < vector.length; i++) {
            if(this.get(i)!=null)
                return this.get(i).equals(e);
        }
        return false;
    }
    
    
    public double media(){
        double total=0;
        int contador=0;
        for (E e : vector) {
            if(e!=null){
                total += e.doubleValue();
                contador++;
            }
                
        }
        try{
            return total/contador;
        } catch(ArithmeticException e){
            System.out.println("Array vacío");
            return 0;
        }
    }
    
    // Aunque no lanza error si no ponemos el Wildcard, es necesario para el tiempo de ejecución
    public boolean compararMedia(Vector<? extends Number> v){
        return this.media()==v.media();
    }
    
    
}
