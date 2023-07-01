
package com.arfonfo.dao.mysql;


import com.arfonfo.escuela.Matricula;
import com.arfonfo.escuela.dao.MatriculaDAO;
import java.sql.Connection;
import java.util.List;

/**
 *
 * @author alfon
 */
public class MySQLMatriculaDAO implements MatriculaDAO{
    
    final String INSERT = "insert into matriculas(alumno, asignatura, fecha, nota) values(?, ?, ?, ?)";
    final String UPDATE = "update matriculas set nota = ? where alumno = ? and asignatura = ? and fecha = ?";
    final String DELETE = "delete from matriculas where alumno = ? and asignatura = ? and fecha = ?";
    final String GETALL = "select alumno, asignatura, fecha, nota from matriculas";
    final String GETONE = GETALL + "where alumno= ? and asignatura = ? and fecha = ?";
    final String GETALU = GETALL + "alumno = ?";
    final String GETCUR = GETALL + "fecha = ?";
    final String GETASI = GETALL + "asignatura = ?";

    private Connection con;
    
    public MySQLMatriculaDAO(Connection con){
        this.con = con;
    }
    
    @Override
    public void insertar(Matricula a) {
        
    }

    @Override
    public void modificar(Matricula a) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void eliminar(Matricula a) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Matricula> obtenerTodos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Matricula obtener(Matricula.IdMatricula id) throws DAOException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    @Override
    public List<Matricula> obtenerPorAlumno(long alumno) throws DAOException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Matricula> obtenerPorAsignatura(long asignatura) throws DAOException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Matricula> obtenerPorCurso(int curso) throws DAOException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
