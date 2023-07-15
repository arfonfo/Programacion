
package paq_Clases;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author alfon
 */
public class Teatro {

    /**
     * @param funciones the funciones to set
     */
    private String nombre;
    private Funcion[] funciones = new Funcion[4];
    
    public Teatro(String n, Funcion[] f) throws IllegalArgumentException{
        this.nombre=n;
        if(f.length != 4)
            throw new IllegalArgumentException("El número de funciones ha de ser 4");
        this.funciones=f;
    }
    
    public Teatro(){
        this.nombre="";
        this.funciones = new Funcion[4];
    }
    
    public Teatro(String n){
        this.nombre=n;
        this.funciones= new Funcion[4];
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public Funcion[] getFunciones(){
        return this.funciones;
    }
    
    public void setNombre(String nuevoNombre){
        this.nombre= nuevoNombre;
    }
    
    public void setFunciones(Funcion[] nuevasFunciones) throws IllegalArgumentException{
        if(nuevasFunciones.length != funciones.length)
            throw new IllegalArgumentException("Solo se admiten 4 funciones");
        this.funciones = nuevasFunciones;
    }
    
    public void addFuncion(Funcion f) throws IllegalArgumentException{
        for(int i = 0; i<this.funciones.length; i++){
            if(this.funciones[i]==null){
                funciones[i]=f;
                break;
            } else if(i==this.funciones.length-1 && this.funciones[i]!=null){
                throw new IllegalArgumentException("No se pueden añadir más de 4");
            }
        }
        
    }
    
    public int containsFuncion(Funcion f){
        for (int i = 0; i < this.funciones.length; i++) {
            if(funciones[i] == f){
                return i;
            }
                
        }
        return -1;
    }
    
    public void removeFuncion(Funcion f) throws IllegalArgumentException{
        if(this.containsFuncion(f)==-1)
            throw new IllegalArgumentException("No se ha encontrado la función que quiere borrar");
        this.funciones[this.containsFuncion(f)]=null;
        System.out.println("Función borrada con éxito");
    }
    
    @Override
    public String toString(){
        // Para asegurar que no se muestran valores null
        // podemos crear un nuevo array y llenarlo con las funciones
        // del array anterior que no sean null
        // o hacerlo con un for y 1 string con concat
//        Funcion[] funcActuales = null;
//        for(int i=0; i<this.funciones.length; i++){
//                    if(funciones[i]!=null)
//                        funcActuales[i]=funciones[i];
//                }

        String cadena = "";

        for(int i=0; i<this.funciones.length; i++){
                    if(funciones[i]!=null)
                        cadena=cadena.concat(funciones[i] + "\n");
                }

        return "Nombre: " + this.getNombre() + 
                "\nFunciones: \n" + cadena;
    }
}
