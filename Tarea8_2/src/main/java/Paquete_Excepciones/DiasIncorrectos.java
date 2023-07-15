
package Paquete_Excepciones;

/**
 *
 * @author alfon
 */
public class DiasIncorrectos extends IllegalArgumentException{
    
    public DiasIncorrectos(){
        super("Los días son incorrectos");
    }
    
    public DiasIncorrectos(String s){
        super(s);
    }
}
