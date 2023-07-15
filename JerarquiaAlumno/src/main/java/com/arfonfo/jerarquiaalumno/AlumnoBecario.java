
package com.arfonfo.jerarquiaalumno;

/**
 *
 * @author alfon
 */
public class AlumnoBecario extends Alumno{

    public AlumnoBecario(String nombre, int edad, boolean becario) {
        super(nombre, edad, becario);
    }

    @Override
    public String toString() {
        return "Becario: " + super.toString();
    }
    
    
}
