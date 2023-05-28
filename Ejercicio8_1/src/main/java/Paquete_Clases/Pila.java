
package Paquete_Clases;

import Paquete_Interfaz.ColeccionInterfaz;
import java.util.ArrayList;
import java.util.NoSuchElementException;

/**
 *
 * @author alfon
 */
// A la hora de añadir 1 elemento debe de añadirlo al principio
public class Pila implements ColeccionInterfaz{
    private ArrayList<Object> objetosPila;

    public Pila() {
        this.objetosPila = new ArrayList();
    }
    
    public Pila(ArrayList objetosPila) {
        this.objetosPila = new ArrayList();
        this.objetosPila = objetosPila;
    }
    
    public Pila(int entero, double real, char caracter){
        this.objetosPila = new ArrayList();
        this.objetosPila.add(0, entero);
        this.objetosPila.add(0, real);
        this.objetosPila.add(0, caracter);
    }

    public ArrayList getObjetosPila() {
        return objetosPila;
    }

    public void setObjetosPila(ArrayList objetosPila) {
        this.objetosPila = objetosPila;
    }
    
    @Override
    public boolean estaVacia(){
        return this.objetosPila.isEmpty();
    }
    
    @Override
    public Object extraer(){
        try{
            if(this.estaVacia())
                throw new NoSuchElementException();
            // Nos devuelve el objeto que está borrando
            return this.objetosPila.remove(0);
        } catch(NoSuchElementException e){
            System.out.println("Error, no se puede borrar " + e.getMessage());
            return null;
        }
    }
    
    @Override
    public Object primero(){
        try{
            if(this.estaVacia())
                throw new NoSuchElementException("No hay objetos en la Pila");
            return this.objetosPila.get(0);
        } catch(NoSuchElementException e){
            System.out.println("Error " + e.getMessage());
            return null;
        }
    }
    
    @Override
    public boolean anadir(Object obj){
        this.objetosPila.add(0, obj);
        return this.primero()==obj;
    }

    @Override
    public String toString() {
        return "Pila{" + "objetosPila=" + this.objetosPila + '}';
    }
    
    
    
    
    
}
