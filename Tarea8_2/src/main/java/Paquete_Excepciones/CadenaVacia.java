
package Paquete_Excepciones;

/**
 *
 * @author alfon
 */
public class CadenaVacia extends IllegalArgumentException{
    public CadenaVacia(){
        super("Debe introducir una palabra");
    }
    
    public CadenaVacia(String s){
        super(s);
    }
}
