
package paqExcepciones;

import java.util.InputMismatchException;

/**
 *
 * @author alfon
 */
// Excepción propia cuando se introduce un formato de DNI no adecuado
public class DniFormatoExcepcion extends InputMismatchException{

    public DniFormatoExcepcion() {
        super();
    }

    public DniFormatoExcepcion(String s) {
        super(s);
    }
    
    
}
