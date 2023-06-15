
package com.arfonfo.dao.mysql;

import com.arfonfo.escuela.Asignatura;
import com.arfonfo.escuela.dao.AsignaturaDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author alfon
 */
public class MySQLAsignaturaDAO implements AsignaturaDAO{

    final String INSERT = "insert into asignaturas(id_asinatura, nombre, profesor) values(?, ?, ?)";
    final String UPDATE = "update asignaturas set nombre = ?, profesor= ?";
    final String DELETE = "delete from asignaturas where id_asignatura=?";
    final String GETALL = "select id_asignatura, nombre, profesor from asignaturas";
    final String GETONE = "select id_asignatura, nombre, profesor from asignaturas where id_asignatura=?";
    
    private Connection con;
    
    public MySQLAsignaturaDAO(Connection con){
        this.con= con;
    }
    
    @Override
    public void insertar(Asignatura a) throws DAOException{
        PreparedStatement stat = null;
        
        try {
            stat = con.prepareStatement(INSERT);
            stat.setLong(1, a.getId());
            stat.setString(2, a.getNombre());
            stat.setLong(3, a.getIdProfesor());
            if(stat.executeUpdate()==0)
                throw new DAOException("Es posible que no se haya realizado la inseración");
        } catch (SQLException e) {
            throw new DAOException("Error en SQL", e);
        } finally {
            if(stat!=null){
                try {
                    stat.close();
                } catch (SQLException e) {
                    throw new DAOException("Error en SQL", e);
                }
            }
        }
    }

    @Override
    public void modificar(Asignatura a) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void eliminar(Asignatura a) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Asignatura> obtenerTodos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Asignatura obtener(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   
}
