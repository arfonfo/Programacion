
package com.arfonfo.dao.mysql;

import com.arfonfo.escuela.dao.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author arfon
 */
public class MySQLDaoManager implements DAOManager{
    
    private Connection con;
    
    private AlumnoDAO alumnos = null;
    private ProfesorDAO profesores = null;
    private MatriculaDAO matriculas = null;
    private AsignaturaDAO asignaturas = null;
    
    // Con este constructor, nos aseguramos que para acceder a cualquier tabla estamos creado primero la conexión
    // Creamos el objeto MySQLDaoManager, pasandole los parámetros de la conexión
    // Y luego mediante los getters vamos obteniendo los datos de alumno, profesor, asignatura y matrícula
    public MySQLDaoManager(String host, String username, String password, String database) throws SQLException{
        con = DriverManager.getConnection("jdbc:mysql://" + host + "/" + database, username, password);
    }

    @Override
    public AlumnoDAO getAlumnoDAO() {
        if (alumnos==null){
            alumnos = new MySQLAlumnoDAO(con);
        }
        return alumnos;
    }

    @Override
    public AsignaturaDAO getAsignaturaDAO() {
        if (asignaturas==null){
            asignaturas = new MySQLAsignaturaDAO(con);
        }
        return asignaturas;
    }

    @Override
    public MatriculaDAO getMatriculaDAO() {
        if(matriculas==null){
            matriculas = new MySQLMatriculaDAO(con);
        }
        return matriculas;
    }

    @Override
    public ProfesorDAO getProfesorDAO() {
        if(profesores==null){
            profesores = new MySQLProfesorDAO(con);
        }
        return profesores;
    }
        
}
