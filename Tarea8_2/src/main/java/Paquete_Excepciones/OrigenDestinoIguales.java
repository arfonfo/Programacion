
package Paquete_Excepciones;

/**
 *
 * @author alfon
 */
public class OrigenDestinoIguales extends IllegalArgumentException{
    public OrigenDestinoIguales(){
        super("El origen y el destino son el mismo");
    }
    
    public OrigenDestinoIguales(String s){
        super(s);
    }
}
