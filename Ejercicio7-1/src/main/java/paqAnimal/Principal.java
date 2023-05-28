
package paqAnimal;

import paqFecha.Fecha;
import paqAnimal.Animal;
import paqAnimal.Hombre;
import paqAnimal.Vertebrado;

/**
 *
 * @author alfon
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // PRUEBAS DE LAS CLASES FECHA, ANIMAL, VERTEBRADO Y HOMBRE
        
        Fecha f1 = new Fecha(4, 10, 2001);
        
        Animal a1 = new Animal(3, f1);
        
        Vertebrado v1 = new Vertebrado(14, a1);
        
        int[] edades = {3, 16, 7, 18, 10};
        String[] nombres = {"Pepe", "Carlos", "Maria", "Juan", "Ana"};
        
        Hombre h1 = new Hombre(v1, "Pedro Pérez", true, 5, nombres, edades);
        
        for (int i = 0; i < h1.getNamesHijos().length; i++) {
            System.out.println("Nombre del Hijo " + (i+1) + ": " + h1.getNamesHijos()[i]);
            System.out.println("Edad del Hijo " + (i+1) + ": " + h1.getEdadHijos()[i]);
            System.out.println("");            
        }
        
        // DownCasting - no es necesario hacer el casting explícito, pues la clase Animal engloba a Hombre
        a1 = h1;
        
        // También le cambia el peso al objeto h1 de la subclase Hombre
        a1.setPeso(45);
        
        // Tiene valor 45
        System.out.println("El peso del hombre es " + h1.getPeso() + " kg");
        
        // h1 tiene un nuevo hijo
        h1.tenerHijos("Raquel", 20);
        
        System.out.println(h1.toString());
        
        // h1 muere
        h1.morir();
        
        // Mostrar la edad del hijo menor y su nombre
        System.out.println("La edad del hijo menor es " + h1.edadHijoMenor() + " años");
        System.out.println("Y su nombre es " + h1.nombreHijoMenor());
        
        // hh1 muere de nuevo
        h1.morir();
        
    }
    
}
