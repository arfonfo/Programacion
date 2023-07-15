
package paqPersona;

import paqExcepciones.CantidadNegativaExcepcion;

/**
 *
 * @author alfon
 */
public class Profesor extends Persona{

    private int anos_trabajo;
    private String especialidad;
    private double sueldo;

    public Profesor() {
        super();
        this.anos_trabajo=0;
        this.especialidad="";
        this.sueldo=0d;
    }

    public Profesor(int anos_trabajo, String especialidad, double sueldo, String dni, String nombre, String apellido1, String apellido2, String direccion) {
        super(dni, nombre, apellido1, apellido2, direccion);
        try {
            if(anos_trabajo<0 || sueldo<0)
                throw new CantidadNegativaExcepcion("Ha introducido una cantidad negativa en sueldo o años de trabajo");
            this.anos_trabajo = anos_trabajo;
            this.especialidad = especialidad;
            this.sueldo = sueldo;
        } catch (CantidadNegativaExcepcion e) {
            System.out.println("Error " + e.getMessage());
        } catch (Exception e){
            System.out.println("Error general" + e.getMessage());
        }

    }

    public int getAnos_trabajo() {
        return anos_trabajo;
    }

    public void setAnos_trabajo(int anos_trabajo) {
        try {
            if(anos_trabajo<0)
                throw new CantidadNegativaExcepcion("Los años de trabajo no pueden ser negativos");
            this.anos_trabajo = anos_trabajo;
        } catch (CantidadNegativaExcepcion e) {
            System.out.println("Error " + e.getMessage());
        }
        
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
         try {
            if(sueldo<0)
                throw new CantidadNegativaExcepcion("El sueldo no puede ser negativos");
            this.sueldo = sueldo;
        } catch (CantidadNegativaExcepcion e) {
            System.out.println("Error " + e.getMessage());
        }
        
    }
    
    
    @Override
    public void ver_datos() {
        System.out.println("---------------------------------");
        System.out.println("********* PROFESOR **********");
        System.out.println("DNI: " + this.getDni());
        System.out.println("NOMBRE: " + this.getNombre());
        System.out.println("APELLIDOS: " + this.getApellido1() + " " + this.getApellido2());
        System.out.println("DIRECCIÓN: " + this.getDireccion());
        System.out.println("AÑOS TRABAJANDO: " + this.anos_trabajo);
        System.out.println("ESPECIALIDAD: " + this.especialidad);
        System.out.println("SUELDO: " + this.sueldo + "€");
        System.out.println("");
    }
    
}
