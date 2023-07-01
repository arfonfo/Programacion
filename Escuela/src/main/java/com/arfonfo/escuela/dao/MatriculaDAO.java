package com.arfonfo.escuela.dao;

import com.arfonfo.dao.mysql.DAOException;
import com.arfonfo.escuela.Matricula;
import java.util.List;

/**
 *
 * @author alfon
 */
public interface MatriculaDAO extends DAO<Matricula, Matricula.IdMatricula> {
    
    List<Matricula> obtenerPorAlumno(long alumno) throws DAOException;
    
    List<Matricula> obtenerPorAsignatura(long asignatura) throws DAOException;
    
    List<Matricula> obtenerPorCurso(int curso) throws DAOException;
    
}
