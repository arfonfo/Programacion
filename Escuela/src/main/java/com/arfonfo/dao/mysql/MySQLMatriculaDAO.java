
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
    
    final String INSERT = "insert into matricula() values()";
    final String UPDATE = "update matricula set ";
    final String DELETE =
    final String GETALL =
    final String GETONE =

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
    public Matricula obtener(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    
}
