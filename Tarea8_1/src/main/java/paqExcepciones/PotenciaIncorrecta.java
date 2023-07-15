
package paqExcepciones;

/**
 *
 * @author alfon
 */
public class PotenciaIncorrecta extends IllegalArgumentException{
    public PotenciaIncorrecta() {
        super("La potencia es incorrecto");
    }
    
    public PotenciaIncorrecta(String error){
        super(error);
    }
}
