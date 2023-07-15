
package Paquete_Clases;

import Paquete_Interfaz.ColeccionInterfaz;
import java.util.ArrayList;
import java.util.NoSuchElementException;


/**
 *
 * @author alfon
 */
// En la cola los objetos se añaden al final y se extraen del principio
public class Cola implements ColeccionInterfaz{
    private ArrayList<Object> objetosCola;
    
    public Cola() {
        this.objetosCola = new ArrayList<Object>();
    }
    
    public Cola(ArrayList objetosCola) {
        this.objetosCola = new ArrayList();
        this.objetosCola = objetosCola;
    }
    
    public Cola(int entero, double real, char caracter){
        this.objetosCola = new ArrayList();
        this.objetosCola.add(entero);
        this.objetosCola.add(real);
        this.objetosCola.add(caracter);
    }

    public ArrayList getObjetosCola() {
        return objetosCola;
    }

    public void setObjetosCola(ArrayList objetosCola) {
        this.objetosCola = objetosCola;
    }
    
    @Override
    public boolean estaVacia(){
        return this.objetosCola.isEmpty();
    }
    
    @Override
    public Object extraer(){
        try{
            if(this.estaVacia())
                throw new NoSuchElementException();
            Object primeroCola = this.primero();
            this.objetosCola.remove(0);
            return primeroCola;
        } catch(NoSuchElementException e){
            System.out.println("Error, no se puede borrar " + e.getMessage());
            return null;
        }
    }
    
    
    @Override
    public Object primero(){
        try{
            if(this.estaVacia())
                throw new NoSuchElementException("No hay objetos en la Cola");
            return this.objetosCola.get(0);
        } catch(NoSuchElementException e){
            System.out.println("Error " + e.getMessage());
            return null;
        }
    }
    
    @Override
    public boolean anadir(Object obj){
        // Aquí no hay que ponerle el índice donde lo queremos añadir, porque ya lo añade al final
        // Además, el método devuelve un booleano
        return this.objetosCola.add(obj);
    }

    @Override
    public String toString() {
        return "Cola{" + "objetosCola=" + this.objetosCola + '}';
    }
}
