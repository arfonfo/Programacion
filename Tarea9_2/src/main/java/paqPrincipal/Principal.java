

package paqPrincipal;

import paqPersona.Persona;
import paqPersona.Alumno;
import paqPersona.Profesor;
import paqExcepciones.DniFormatoExcepcion;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 *
 * @author alfon
 */

public class Principal {
    
    
    // Método para validar el DNI
    public static boolean validarDNI(String dni){
        Pattern dniPatron = Pattern.compile("[0-9]{8}[A-Za-z]");
        Matcher coincide;
        coincide = dniPatron.matcher(dni);
        return coincide.matches();
    }
    
    ////////////////////////// Método buscar ArrayList //////////////////////////////////
    public static Persona buscarArrayList(ArrayList<Persona> personas, String dni){
        try {
                if(!validarDNI(dni))
                    throw new DniFormatoExcepcion("Error en el formato introducido para el DNI\nDeben ser 8 números y una letra en mayúscula");
                
                for (Persona persona : personas) {
                    if(dni.equalsIgnoreCase(persona.getDni())){
                        return persona;
                    }
                }

            } catch (DniFormatoExcepcion e) {
                System.out.println(e.getMessage());
            }
        return null;
    }
       

    public static void main(String[] args) {        
        try {
            
            Scanner sc = new Scanner(System.in);
            String dniBuscar;
            
            ////////////////////////////// CON ARRAYLIST /////////////////////////////
            System.out.println("*****************UTILIZANDO ARRAYLIST****************\n\n");
            
            // ArrayList de elementos de la clase Persona
            ArrayList<Persona> personas = new ArrayList<Persona>();

            // Creamos 2 instancias de Persona, que al ser abstracta, tienen que apuntar a sus subclases
            Persona p1 = new Alumno(1, "Medio", "11111111A", "Juan", "Perez", "Lopez", "C/ Falsa");
            Persona p2 = new Profesor(3, "Matemáticas", 1500, "22222222B", "Alberto", "Fernandez", "Fernandez", "C/ Carmen");

            Profesor pf1 = new Profesor(2, "Física", 1300, "33333333C", "Pedro", "Martinez", "Garcia", "C/ Sin Salida");
            Profesor pf2 = new Profesor(10, "Biología", 2000, "44444444D", "Nuria", "Sanchez", "Canovas", "C/ Silencio");

            Alumno a1 = new Alumno(2, "Bajo", "55555555F", "Sara", "Acosta", "Gonzalez", "C/ Constitucion");
            Alumno a2 = new Alumno(4, "Alto", "66666666G", "Andres", "Sandoval", "Costa", "C/ Teniente");

            // Añadimos los objetos al ArrayList
            personas.add(p1);
            personas.add(p2);
            personas.add(pf1);
            personas.add(pf2);
            personas.add(a1);
            personas.add(a2);


            ///// Buscamos un DNI en la colección leído por teclado
            System.out.println("Introduce el DNI de la persona que quieres buscar: ");
            dniBuscar=sc.nextLine();
            Persona p = buscarArrayList(personas, dniBuscar);
            if(p==null){
                System.out.println("El DNI que buscas no se encuentra en la base de datos");
            } else {
                p.ver_datos();
            }

            System.out.println("");

            System.out.println("");



            ///// Borramos un objeto de la colección cuyo DNI es leído por teclado
            System.out.println("Introduce el DNI de la persona que quieres borrar: ");
            dniBuscar=sc.nextLine();
            Persona pb = buscarArrayList(personas, dniBuscar);
            if(pb==null){
                System.out.println("El DNI que buscas no se encuentra en la base de datos");
            } else {
                System.out.println("Esta es la persona que va a borrar");
                System.out.println("");
                personas.remove(personas.indexOf(pb)).ver_datos();
                System.out.println("Borrado con éxito");
            }
            
            
            System.out.println("");


            try {
                ///// Mostramos la suma de los sueldos de los profesores
                double sumaSueldos=0;
                for (int i = 0; i < personas.size(); i++) {
                    if(personas.get(i) instanceof Profesor)
                        // Es necesario castear el elemento obtenido del ArrayList de Personas para que tenga acceso a los métodos de Profesor
                        sumaSueldos += ((Profesor)personas.get(i)).getSueldo();
                }

                System.out.println("El sueldo de todos los profesores es: " + sumaSueldos + "€");
                
            } catch (ClassCastException e) {
                System.out.println("Error al obtener los profesores" + e.getMessage());
            }
           


            System.out.println("\n\n\n");
            
            
            
            
            ////////////////////////////// CON HASHMAP /////////////////////////////
            System.out.println("*****************UTILIZANDO HASHMAP****************\n\n");
            
            // Creamos la colección HashMap
            HashMap<Integer, Profesor> profesores = new HashMap <Integer, Profesor>();
            int identificador;
            int contador=1;
            
            // Creamos 10 objetos Profesor junto con su clave generada al azar
            // Hacemos un while, hasta que la longitud de la colección no llegue a 10
            // Para evitar que no añada los 10 profesores en caso de que se repita algún random
            while(profesores.size()!=10) {
                identificador = (int) (Math.random() *100) +1;
                String dni = contador + "11111111A";
                String nombre = "Profesor " + contador;
                String apellido1 = "Apellido1 " + contador;
                String apellido2 = "Apellido2 " + contador;
                String direccion = "Dirección " + contador;
                int aniosTrabajo = (int) (Math.random()*65)+1;
                String especialidad = "Especialidad " + contador;
                double sueldo = Math.round(((double) (Math.random()*1000) +1000)*100.0)/100.0;
                Profesor objeto_prof = new Profesor(aniosTrabajo, especialidad, sueldo, dni, nombre, apellido1, apellido2, direccion);
                profesores.put(identificador, objeto_prof);
                contador++;
            }
            
            
            // Mostramos todos los profesores creados
            for (Integer clave : profesores.keySet()) {
                System.out.println("Identificador: " + clave);
                profesores.get(clave).ver_datos();
                System.out.println("");
            }
            
            
            try {
                
                // Buscamos un objeto_prof cuya clave es leída por teclado
                System.out.println("Introduce la clave del profesor que quieres buscar: ");
                identificador = sc.nextInt();
                
                Profesor pf = profesores.get(identificador);
                
                System.out.println("Identificador: " + identificador);
                pf.ver_datos();
                
                
            } catch (NullPointerException e) {
                System.out.println("La clave que ha introducido no pertenece a ningún profesor");
            } catch (InputMismatchException e){
                System.out.println("El formato introducido no es correcto " + e.getMessage());
                sc.next();
            }
            
            System.out.println("");
                
            try {
                // Borramos un objeto_prof cuya clave se lee por teclado
                System.out.println("Introduce la clave del profesor que quieres borrar: ");
                identificador = sc.nextInt();
                
                if(!profesores.containsKey(identificador))
                    throw new NullPointerException();
                profesores.remove(identificador);
                System.out.println("Profesor borrado con éxito");
                
            } catch (NullPointerException e) {
                System.out.println("La clave que ha introducido no pertenece a ningún profesor");
            } catch (InputMismatchException e){
                System.out.println("El formato introducido no es correcto " + e.getMessage());
            }
                
                
                
            // Comprobamos que lo ha borrado
            System.out.println(profesores.size());
            // Mostramos los profesores de nuevo para asegurarnos
            for (Integer clave : profesores.keySet()) {
                System.out.println("Identificador: " + clave);
                profesores.get(clave).ver_datos();
                System.out.println("");
            }
                
            System.out.println("");
            
            
            // Mostramos la suma de sueldos de los profesores del HashMap
            double sueldoProfesores = 0;
            for (Integer clave : profesores.keySet()) {
                sueldoProfesores += profesores.get(clave).getSueldo();
            }
            
            System.out.println("El sueldo de todos los profesores del HashMap es: " + Math.round(sueldoProfesores*100.0)/100.0 + "€");
            
            
            
            HashMap<Integer, Persona> personashm = new HashMap<>();
            personashm.put(1, p1);
            personashm.put(2, p2);
            
            for (Integer clave : personashm.keySet()) {
                // Aquí sí que sería necesario hacer el casting
                System.out.println(((Profesor)personashm.get(clave)).getSueldo());
            }
            
            HashMap<Integer, Persona> hashpersona = new HashMap();
            
            hashpersona.put(1, p1);
            hashpersona.put(2, p2);
            
            for (Integer clave : hashpersona.keySet()) {
                // Aquí sí que sería necesario hacer el casting
                System.out.println(((Profesor)hashpersona.get(clave)).getSueldo());
            }

        
        } catch (Exception e) {
            System.out.println("Error general " + e.getMessage());
        }
    }
}
