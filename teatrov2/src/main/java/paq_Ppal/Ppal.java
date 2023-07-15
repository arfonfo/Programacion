
package paq_Ppal;

import paq_Clases.Funcion;
import paq_Clases.Teatro;

/**
 *
 * @author alfon
 */
public class Ppal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            Funcion f1 = new Funcion("Bodas de sangre", 10);
            Funcion f2 = new Funcion("Magia", 18);
            Funcion f3 = new Funcion("La casa de Bernarda Alba", 12);
            Funcion f4 = new Funcion("Garbancito", 8);

            Funcion[] v = new Funcion[4];

            v[0] = f1;
            v[1] = f2;
            v[2] = f3;

            Teatro romea = new Teatro("Romea", v);
            
            System.out.println(romea.toString());
            
            Funcion[] w = romea.getFunciones();
            
            for(Funcion f: w){
                if(f != null)
                    System.out.println(f.toString());
            }
            
            
            Funcion f5 = new Funcion("Cascanueces", 20);
            
            romea.addFuncion(f5);
            
            System.out.println(romea.toString());
            
            if(romea.containsFuncion(f5)!=-1)
                System.out.println("La función está");
            
            romea.removeFuncion(f5);
            
            System.out.println(romea.toString());
            
            if(romea.containsFuncion(f3) != -1){
                romea.getFunciones()[romea.containsFuncion(f3)].setPrecio(19);
            }
            
            System.out.println(romea.toString());
            
            
        } catch(IllegalArgumentException ex){
            System.out.println("Error: " + ex.getMessage());
        }
        
        
    }
    
}
