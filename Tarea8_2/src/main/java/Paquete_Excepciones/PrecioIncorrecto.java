
package Paquete_Excepciones;

/**
 *
 * @author alfon
 */
public class PrecioIncorrecto extends IllegalArgumentException{
    
    public PrecioIncorrecto(){
        super("El precio es incorrecto");
    }
    
    public PrecioIncorrecto(String s){
        super(s);
    }
}
