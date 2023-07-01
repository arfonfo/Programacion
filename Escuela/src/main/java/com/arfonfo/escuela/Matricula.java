
package com.arfonfo.escuela;

import java.util.Objects;

/**
 *
 * @author alfon
 */
public class Matricula {
    
    private IdMatricula id;
    private Integer nota=null;

    // Creamos una subclase dentro de matrícula para poder generar la ID
    // de la base de datos
    // que está compuesta por alumno, asigntura y año
    public class IdMatricula {
        private long alumno;
        private long asignatura;
        private int year;

        public IdMatricula(long alumno, long asignatura, int year) {
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
        
        
    }
    
    
    public Matricula(long alumno, long asignatura, int year) {
        this.id = new IdMatricula(alumno, asignatura, year);
    }

    public Matricula(IdMatricula id) {
        this.id = id;
    }

    public IdMatricula getId() {
        return id;
    }

    public void setId(IdMatricula id) {
        this.id = id;
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
        hash = 97 * hash + (int) (this.getId().getAlumno() ^ (this.getId().getAlumno() >>> 32));
        hash = 97 * hash + (int) (this.getId().getAsignatura() ^ (this.getId().getAsignatura() >>> 32));
        hash = 97 * hash + this.getId().getYear();
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
        if (this.getId().getAlumno() != other.getId().getAlumno()) {
            return false;
        }
        if (this.getId().getAsignatura()!= other.getId().getAsignatura()) {
            return false;
        }
        if (this.getId().getYear() != other.getId().getYear()) {
            return false;
        }
        return Objects.equals(this.nota, other.nota);
    }

    @Override
    public String toString() {
        return "Matricula{" + "alumno=" + this.getId().getAlumno() + ", asignatura=" + this.getId().getAsignatura() + ", year=" + this.getId().getYear() + ", nota=" + nota + '}';
    }
    
    
}
