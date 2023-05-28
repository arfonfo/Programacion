

package paqPrincipal;

import paqGenericas.*;
import paqPersona.*;

/**
 *
 * @author alfon
 */
public class Principal {

    public static void main(String[] args) {
        Number[] arrN = {1, 2.0, 3.0, 4};
        
        Vector<Number> v = new Vector<Number>(arrN);
        
        v.estaX(5.0);
        
    }
}
