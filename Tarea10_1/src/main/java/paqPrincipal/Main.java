

package paqPrincipal;

import java.lang.reflect.Array;
import paqGenericas.Generica;
import paqGenericas.Vector;
import paqPersona.*;

/**
 *
 * @author arfon
 */
public class Main {

    public static void main(String[] args) {
        Profesor pf1 = new Profesor(2, "Física", 1300, "33333333C", "Pedro", "Martinez", "Garcia", "C/ Sin Salida");
        Profesor pf2 = new Profesor(10, "Biología", 2000, "44444444D", "Nuria", "Sanchez", "Canovas", "C/ Silencio");

        Alumno a1 = new Alumno(2, "Bajo", "55555555F", "Sara", "Acosta", "Gonzalez", "C/ Constitucion");
        Alumno a2 = new Alumno(4, "Alto", "66666666G", "Andres", "Sandoval", "Costa", "C/ Teniente");
        
        Generica<Persona> coleccion = new Generica<Persona>();
        
        System.out.println(coleccion.estaVacia());
        
        coleccion.primero();
        
        coleccion.extraer();
        
        coleccion.aniadir(pf1);
        coleccion.aniadir(pf2);
        coleccion.aniadir(a1);
        coleccion.aniadir(a2);
        
        
        //coleccion.primero().ver_datos();
        
        Persona p1 = coleccion.extraer();
        
        //p1.ver_datos();
        
        
        // Dos formas de ver los datos de la colección
//        for (Persona p : coleccion.getLista()) {
//            p.ver_datos();
//        }
        
        System.out.println(coleccion.toString());
        
        
        
        ///////////////// USO DE LA CLASE GENÉRICA VECTOR /////////////////////
        Integer array_enteros[] = {1, 2, 3, 4, 5};
        Vector<Integer> v_ent = new Vector<Integer>(array_enteros);        
       
        // Hay que poner el .class para que identifique qué clase le estamos pasando
        Vector<Integer> v_ent2 = new Vector<Integer>(Integer.class, 10);
        
        v_ent2.set(3, 1);
        v_ent2.set(1, 2);
        v_ent2.set(2, 3);
        
        v_ent2.EstaX(0.0);
        
        // Lanza el error ya que no existe el índice en el array
        v_ent2.set(11, 3);
        
        System.out.println(v_ent.get(0));
        // También lanzará error ya que no existe el índice
        System.out.println(v_ent2.get(11));
        
        v_ent2.mostrar();
        
        System.out.println(v_ent2.EstaX(10));
        
        System.out.println(v_ent.comparaMedia(v_ent2));
        
        System.out.println(v_ent2.elementos());
        
        v_ent2.ordenarASC();
        
        v_ent2.mostrar();
        
        // Ejemplo para crear un array con newInstance
        int[] arrayint = (int[]) Array.newInstance(int.class, 7);
        
    }
}
