
package paqVehiculo;

/**
 *
 * @author alfon
 */
public class PotenciaIncorrecta extends IllegalArgumentException{

    public PotenciaIncorrecta() {
        super("La potencia es incorrecta");
    }

    public PotenciaIncorrecta(String s) {
        super(s);
    }
    
}
