
package paqGenericas;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 *
 * @author arfon
 */
public class Vector<E extends Number> implements Comparable<E>{
    
    private E vector[];
    private int tamanio;
    
    public Vector(E vector[]){
        this.vector=vector;
        this.tamanio = this.vector.length;
    }
    
    public Vector(Class <E> clase, int tamanio){
        try {
            // No nos deja inicializar un array normal de tipo E
            // this.vector = new E[tamanio];
            // Por eso se utiliza un método de Array que nos permite instanciar un nuevo Array
            // de clase Class <E> y de tamanio
            if(tamanio<0)
                throw new IllegalArgumentException("El tamaño no puede ser negativo");
            this.vector = (E[])Array.newInstance(clase, tamanio);
        this.tamanio=tamanio;
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    public E[] getVector() {
        return vector;
    }

    public void setVector(E[] vector) {
        this.vector = vector;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }
    
    public void set(int i, E elemento){
        try {
            if((i < this.tamanio) & (i >=0))
                this.vector[i]=elemento;
            else
                throw new ArrayIndexOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: no existe ese índice en el array");
        }
        
    }
    
    // El índice siempre va a ser un entero
    public E get(int i){
        try {
            if((i < this.tamanio) & (i >=0))
                return this.vector[i];
            else
                throw new ArrayIndexOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: no existe ese índice en el array");
            return null;
        }
    }
    
    public int elementos(){
        int contador=0;
        for (E e : this.vector) {
            if(e!=null)
                contador++;
        }
        this.tamanio=contador;
        return contador;
    }
    
//    public void mostrar(){
//        for (int i = 0; i < this.tamanio i++) {
//            if(this.get(i)!=null)
//                System.out.print(vector[i] + " ");
//        }
//    }
    
    public void mostrar() {
        for (E element : this.vector) {
            if(element!=null)
                System.out.print(element + " ");
        }
        System.out.println();
        
        
//        for (int i = 0; i < this.tamanio; i++) {
//            if(this.get(i)!=null)
//                System.out.println("posicion " + i + " valor " + this.get(i));
//        }
    }
    
    
    public E minimo2(){
        this.ordenarASC();
        return this.get(0);
    }
    
    
    public E maximo(){
        E max=this.vector[0];
        for (E e : this.vector) {
            if(e!=null)
                if(e.doubleValue() > max.doubleValue())
                    max=e;
        }
        return max;
    }
    
    public E minimo(){
         E min=this.get(0);
        for (E e : this.vector) {
            if(e!=null)
                if(e.doubleValue() < min.doubleValue())
                    min=e;
        }
        return min;
    }
    
    public boolean estaX(<? extends Number> objeto)
    {
          for (int i = 0; i < this.tamanio; i++) 
            if (this.get(i)!=null)
                if (this.get(i).equals(objeto))
                    return true;
          
          return false;
        
//       for (E e:this.vector) 
//            if (e.equals(objeto))
//                return true;
//       
//       return false;        
    } 
    
    // Lo ponemos como double porque en todos los casos la media devuelve un double
    public double media(){
        double suma=0;
        int contador =0;
        for (E e : this.vector) {
            if(e!=null){
                suma += e.doubleValue();
                contador++;
            }
        }
        
        try {
            suma = suma/contador;
        } catch (ArithmeticException e) {
            System.out.println("Array vacío");
            suma=0;
        }
        return suma;
    }
    
    // Ponemos el wildcard para indicar que no sabemos el tipo del parámetro de entrada que vamos a comparar
    public boolean comparaMedia(Vector otro){
        // (Vector otro) No funciona porque no sabe de qué tipo es el parámetro de entrada
        return this.media()==otro.media();
    }

    
    public void ordenarASC(){
        // Si lo hacemos de esta forma y no rellenamos el vector al completo nos da error en los null
        Arrays.sort(this.vector);
        E temp = this.vector[0];
        for (int i = 0; i < this.vector.length; i++) {
            for (int j = 0; j < this.vector.length-i-1; j++) {
                if(this.vector[j]!=null && this.vector[j+1]!=null){
                    if(this.vector[j].doubleValue()>this.vector[j+1].doubleValue()){
                        temp = this.vector[j];
                        this.vector[j] = this.vector[j+1];
                        this.vector[j+1]=temp;
                    }
                }
                
           }
            
        }
    }

    @Override
    public int compareTo(E t) {
        for (E e : vector) {
            if(e.equals(t))
                return 1;
        }
        return 0;
    }


    
    
    
}
