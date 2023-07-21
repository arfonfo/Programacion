
package com.arfonfo.dao.mysql;

import com.arfonfo.escuela.Asignatura;
import com.arfonfo.escuela.dao.AsignaturaDAO;
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
public class MySQLAsignaturaDAO implements AsignaturaDAO{

    final String INSERT = "insert into asignaturas(nombre, profesor) values(?, ?)";
    final String UPDATE = "update asignaturas set nombre = ?, profesor= ? where id_asignatura = ?";
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
        ResultSet rs =null;
        try {
            stat = con.prepareStatement(INSERT);
            stat.setString(1, a.getNombre());
            stat.setLong(2, a.getIdProfesor());
            if(stat.executeUpdate()==0)
                throw new DAOException("Es posible que no se haya realizado la inseración");
            rs = stat.getGeneratedKeys();
            if(rs.next()){
                a.setId(rs.getLong(1));
            } else {
                throw new DAOException("No puedo asignar ID a ese alumno");
            }
        } catch (SQLException e) {
            throw new DAOException("Error en SQL", e);
        } finally {
            if(rs!=null){
                try {
                    rs.close();
                } catch (SQLException e) {
                    throw new DAOException("Error en SQL", e);
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
    public void modificar(Asignatura a) throws DAOException{
        PreparedStatement stat = null;
        try {
            stat = con.prepareStatement(UPDATE);
            stat.setString(1, a.getNombre());
            stat.setLong(2, a.getIdProfesor());
            stat.setLong(3, a.getId());
            if(stat.executeUpdate() == 0)
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
    public void eliminar(Asignatura a) throws DAOException{
        PreparedStatement stat = null;
        try {
            stat = con.prepareStatement(DELETE);
            stat.setLong(1, a.getId());
            if(stat.executeUpdate() == 0)
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
    
    private Asignatura convertir(ResultSet rs) throws SQLException {
        String nombre = rs.getString("nombre");
        Long idProfesor = rs.getLong("profesor");
        Asignatura asignatura = new Asignatura(nombre, idProfesor);
        asignatura.setId(rs.getLong("id_asignatura"));
        return asignatura;
    }
        

    @Override
    public List<Asignatura> obtenerTodos() throws DAOException{
        PreparedStatement stat = null;
        ResultSet rs = null;
        List<Asignatura> asignaturas = new ArrayList<>();
        
        try {
            stat = con.prepareStatement(GETALL);
            rs = stat.executeQuery();
            while(rs.next()){
                asignaturas.add(convertir(rs));
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
        return asignaturas;
    }

    @Override
    public Asignatura obtener(Long id) throws DAOException {
        PreparedStatement stat = null;
        ResultSet rs = null;
        Asignatura a = null;
        
        try {
            stat = con.prepareStatement(GETONE);
            stat.setLong(1, id);
            rs = stat.executeQuery();
            // Si el resultset tiene un next quiere decir que ha podido realizar la consulta
            if(rs.next()) {
                a = convertir(rs);
            } else {
                throw new DAOException("No se ha encontrado ese registro");
            }
        } catch (SQLException e) {
            throw new DAOException("No se ha encontrado ese registro", e);
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
        return a;
    }

   
}
