
package com.arfonfo.escuela.dao;

/**
 *
 * @author arfon
 */
public interface DAOManager {
    
    AlumnoDAO getAlumnoDAO();
    AsignaturaDAO getAsignaturaDAO();
    MatriculaDAO getMatriculaDAO();
    ProfesorDAO getProfesorDAO();
    
}
