

package com.arfonfo.jerarquiaalumno;

import java.util.HashSet;
import java.util.Iterator;

/**
 *
 * @author alfon
 */
public class JerarquiaAlumno {

    public static void main(String[] args) {
        /////// Utilizamos HashSet
        AlumnoBecario ab1 = new AlumnoBecario("Pepe", 18, true);
        AlumnoBecario ab2 = new AlumnoBecario("Paco", 17, true);
        
        AlumnoMayorEdad am1 = new AlumnoMayorEdad("Susana", 25, true);
        AlumnoMayorEdad am2 = new AlumnoMayorEdad("'Angel", 21, false);
        
        HashSet <Alumno> alumnos = new HashSet<Alumno>();
        alumnos.add(ab1);
        alumnos.add(ab2);
        alumnos.add(am1);
        alumnos.add(am2);
        
        
        Iterator <Alumno> iterador = alumnos.iterator();
        while(iterador.hasNext()){
            // No funciona porque Alumnos también contiene AlumnosMayorEdad
            // que no pueden ser casteados
            // System.out.println(((AlumnoBecario)iterador.next()).toString());
            Alumno aBecario = iterador.next();
            if(aBecario.isBecario())
                System.out.println(aBecario.toString());
        }
        
        // No los está insertando
        HashSet <Alumno> claseBecarios = new HashSet <Alumno>();
        for (Alumno becario : alumnos) {
            if(becario.isBecario())
                claseBecarios.add(becario);
        }
        
        System.out.println(claseBecarios.isEmpty());
        
        System.out.println("--BECARIOS--");
        for (Alumno claseBecario : claseBecarios) {
            System.out.println(claseBecario.toString());
        }
        
        
    }
}
