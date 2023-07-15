
package com.arfonfo.jerarquiaalumno;

/**
 *
 * @author alfon
 */
public class AlumnoMayorEdad extends Alumno{
    
    public AlumnoMayorEdad(String nombre, int edad, boolean becario) {
        super(nombre, edad, becario);
    }

    @Override
    public String toString() {
        return "Mayor: " + super.toString();
    }
    
    
}
