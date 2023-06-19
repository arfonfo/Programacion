
package com.arfonfo.dao.mysql;

import com.arfonfo.escuela.Profesor;
import com.arfonfo.escuela.dao.ProfesorDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alfon
 */
public class MySQLProfesorDAO implements ProfesorDAO{
    
    
    final String INSERT = "insert into profesores(nombre, apellidos) values(?, ?)";
    final String UPDATE = "update profesores set nombre = ?, apellidos = ? where id_profesor = ?";
    final String DELETE = "delete from profesores where id_profesor= ?";
    final String GETALL = "select id_profesor, nombre, apellidos from profesores";
    final String GETONE = "select id_profesor, nombre, apellidos from profesores where id_profesor=?";

    private Connection con;
    
    public MySQLProfesorDAO(Connection con){
        this.con = con;
    }
    @Override
    public void insertar(Profesor a) throws DAOException{
        PreparedStatement stat = null;
        ResultSet rs = null;
        try {
            stat = con.prepareStatement(INSERT);
            stat.setString(1, a.getNombre());
            stat.setString(2, a.getApellidos());
            if(stat.executeUpdate() == 0)
                throw new DAOException("Es posible que no se haya realizado la inserción");
            rs = stat.getGeneratedKeys();
            if(rs.next()){
                a.setId(rs.getLong(1));
            } else {
                throw new DAOException("No puedo asignar ID a este alumno");
            }
        } catch (SQLException e) {
            throw new DAOException("Error en SQL", e);
        } finally {
            if(rs != null){
                try {
                    rs.close();
                } catch (SQLException e) {
                    new DAOException("Error en SQL", e);
                }
            }
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
    public void modificar(Profesor a) throws DAOException{
        PreparedStatement stat = null;
        try {
            stat = con.prepareStatement(UPDATE);
            stat.setString(1, a.getNombre());
            stat.setString(2, a.getApellidos());
            stat.setLong(3, a.getId());
            if(stat.executeUpdate()==0)
                throw new DAOException("Es posible que no se haya realizado la actualización");
        } catch (SQLException e) {
            throw new DAOException("Error en SQL", e);
        } finally {
            try {
                    stat.close();
                } catch (SQLException e) {
                    throw new DAOException("Error en SQL", e);
                }
        }
    }

    @Override
    public void eliminar(Profesor a) throws DAOException{
        PreparedStatement stat = null;
        try {
            stat = con.prepareStatement(DELETE);
            stat.setLong(1, a.getId());
            if(stat.executeUpdate()==0)
                throw new DAOException("Es posible que no se haya realizado el borrado");
        } catch (SQLException e) {
            throw new DAOException("Error en SQL", e);
        } finally {
            try {
                    stat.close();
                } catch (SQLException e) {
                    throw new DAOException("Error en SQL", e);
                }
        }
    }

    private Profesor convertir(ResultSet rs) throws SQLException{
        Profesor profe = new Profesor(rs.getString("nombre"), rs.getString("apellidos"));
        profe.setId(rs.getLong("id_profesor"));
        return profe;
    }
    
    @Override
    public List<Profesor> obtenerTodos() throws DAOException{
        PreparedStatement stat = null;
        ResultSet rs = null;
        List<Profesor> profesores = new ArrayList<>();
        try {
            stat = con.prepareStatement(GETALL);
            rs = stat.executeQuery();
            while(rs.next()){
                profesores.add(convertir(rs));
            }
        } catch (SQLException e) {
            throw new DAOException("Error en SQL", e);
        } finally {
            if(rs != null){
                try {
                    rs.close();
                } catch (SQLException e) {
                    throw new DAOException("Error en SQL", e);
                }
            }
            if(stat != null){
                try {
                    stat.close();
                } catch (SQLException e) {
                    throw new DAOException("Error en SQL", e);
                }
            }
        }
        return profesores;
    }

    @Override
    public Profesor obtener(Long id) throws DAOException{
        PreparedStatement stat = null;
        ResultSet rs = null;
        Profesor profesor = null;
        try {
            stat = con.prepareStatement(GETONE);
            stat.setLong(1, id);
            rs = stat.executeQuery();
            if(rs.next()){
                profesor = convertir(rs);
            } else {
                throw new DAOException("No se ha encontrado ese registro");
            }
        } catch (SQLException e) {
            throw new DAOException("Error en SQL", e);
        } finally {
            if(rs != null){
                try {
                    rs.close();
                } catch (SQLException e) {
                    throw new DAOException("Error en SQL", e);
                }
            }
            if(stat != null){
                try {
                    stat.close();
                } catch (SQLException e) {
                    throw new DAOException("Error en SQL", e);
                }
            }
        }
        return profesor;
    }

    
}
