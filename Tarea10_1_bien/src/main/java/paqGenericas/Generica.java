
package paqGenericas;

import java.util.ArrayList;
import paqPersona.Persona;

/**
 *
 * @author arfon
 * @param <T>
 */
public class Generica<T extends Persona> {
    
    private ArrayList<T> lista;

    public Generica() {
        this.lista = new ArrayList<T>();
    }
    
    public Generica(ArrayList<T> l){
        this.lista = l;
    }

    public ArrayList<T> getLista() {
        return lista;
    }

    public void setLista(ArrayList<T> lista) {
        this.lista = lista;
    }
    
    public boolean estaVacia(){
        return this.lista.isEmpty();
    }
    
    public void aniadir(<?> objeto){
        this.lista.add(objeto);
    }
    
    public T primero(){
        try {
            if(this.lista.isEmpty())
                throw new IllegalArgumentException();
            return this.lista.get(0);
        } catch (IllegalArgumentException e) {
            System.out.println("La lista está vacía " + e.getMessage());
            return null;
        }
    }
    
    public T extraer(){
        // Se supone que el método primero ya lanza la excepción
        T primero;
        primero = this.primero();
        this.lista.remove(primero);
        return primero;
    }

    @Override
    public String toString() {
//        String cadena="";
//        
//        for (int i=0; i<this.lista.size(); i++){
//            cadena += this.lista.get(i).getNombre() + " - ";
//        }
//        
//        return cadena;
        String cadena = "";
        for (T t : this.lista) {
            cadena += t.getNombre() + " - " + t.getApellido1() + " - " + t.getApellido2() + "\n";
        }
        return cadena;
    }

    
    
    
    
}
