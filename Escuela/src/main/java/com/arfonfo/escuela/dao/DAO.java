
package com.arfonfo.escuela.dao;

import com.arfonfo.dao.mysql.DAOException;
import java.util.List;

/**
 *
 * @author alfon
 */
public interface DAO<T, K> {
    
    void insertar(T a) throws DAOException;
    
    void modificar(T a) throws DAOException;
    
    void eliminar(T a) throws DAOException;
    
    List<T> obtenerTodos() throws DAOException;
    
    T obtener(K id) throws DAOException;
}
