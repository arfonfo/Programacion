
package paqExcepciones;

/**
 *
 * @author alfon
 */
public class PrecioIncorrecto extends IllegalArgumentException{

    public PrecioIncorrecto() {
        super("El precio es incorrecto");
    }
    
    public PrecioIncorrecto(String error){
        super(error);
    }
    
}
