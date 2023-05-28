
package paqPersona;

import paqExcepciones.CantidadNegativaExcepcion;

/**
 *
 * @author alfon
 */
public class Alumno extends Persona{
    
    private int curso;
    private String nivel_ingles;

    public Alumno() {
        super();
        this.curso=0;
        this.nivel_ingles="";
    }
    

    public Alumno(int curso, String nivel_ingles, String dni, String nombre, String apellido1, String apellido2, String direccion) {
        super(dni, nombre, apellido1, apellido2, direccion);
        try {
            if(curso<0)
                throw new CantidadNegativaExcepcion("El curso no puede ser negativo");
            this.curso = curso;
            this.nivel_ingles = nivel_ingles;
        } catch (CantidadNegativaExcepcion e) {
            System.out.println("Error general" + e.getMessage());
        }
        
    }

    public int getCurso() {
        return curso;
    }

    public void setCurso(int curso) {
        try {
            if(curso<0)
                throw new CantidadNegativaExcepcion("El curso no puede ser negativo");
            this.curso = curso;
        } catch (CantidadNegativaExcepcion e) {
            System.out.println("Error general" + e.getMessage());
        }
    }

    public String getNivel_ingles() {
        return nivel_ingles;
    }

    public void setNivel_ingles(String nivel_ingles) {
        this.nivel_ingles = nivel_ingles;
    }
    

    @Override
    public void ver_datos() {
        System.out.println("---------------------------------");
        System.out.println("********* ALUMNO **********");
        System.out.println("DNI: " + this.getDni());
        System.out.println("NOMBRE: " + this.getNombre());
        System.out.println("APELLIDOS: " + this.getApellido1() + " " + this.getApellido2());
        System.out.println("DIRECCIÓN: " + this.getDireccion());
        System.out.println("CURSO : " + this.curso);
        System.out.println("NIVEL DE INGLÉS: " + this.nivel_ingles);
        System.out.println("");
    }
    
}
