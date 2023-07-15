
package paqExcepciones;

/**
 *
 * @author alfon
 */
public class CantidadNegativaExcepcion extends IllegalArgumentException{

    public CantidadNegativaExcepcion() {
        super();
    }

    public CantidadNegativaExcepcion(String s) {
        super(s);
    }
    
}
