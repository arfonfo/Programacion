
package com.arfonfo.escuela;

import java.util.Objects;

/**
 *
 * @author alfon
 */
public class Matricula {
    
    private long alumno;
    private long asignatura;
    private int year;
    private Integer nota=null;

    public Matricula(long alumno, long asignatura, int year) {
        this.alumno = alumno;
        this.asignatura = asignatura;
        this.year = year;
    }

    public long getAlumno() {
        return alumno;
    }

    public void setAlumno(long alumno) {
        this.alumno = alumno;
    }

    public long getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(long asignatura) {
        this.asignatura = asignatura;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Integer getNota() {
        return nota;
    }

    public void setNota(Integer nota) {
        this.nota = nota;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + (int) (this.alumno ^ (this.alumno >>> 32));
        hash = 97 * hash + (int) (this.asignatura ^ (this.asignatura >>> 32));
        hash = 97 * hash + this.year;
        hash = 97 * hash + Objects.hashCode(this.nota);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Matricula other = (Matricula) obj;
        if (this.alumno != other.alumno) {
            return false;
        }
        if (this.asignatura != other.asignatura) {
            return false;
        }
        if (this.year != other.year) {
            return false;
        }
        return Objects.equals(this.nota, other.nota);
    }

    @Override
    public String toString() {
        return "Matricula{" + "alumno=" + alumno + ", asignatura=" + asignatura + ", year=" + year + ", nota=" + nota + '}';
    }
    
    
}
