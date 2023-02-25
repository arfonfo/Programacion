
package paqVehiculo;

/**
 *
 * @author alfon
 */
public class PrecioIncorrecto extends IllegalArgumentException{

    public PrecioIncorrecto() {
        super("El precio es incorrecto");
    }

    public PrecioIncorrecto(String s) {
        super(s);
    }
    
    
    
    
}
