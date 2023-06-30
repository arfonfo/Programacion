
package com.arfonfo.dao.mysql;

import com.arfonfo.escuela.Alumno;
import com.arfonfo.escuela.dao.AlumnoDAO;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alfon
 */
public class MySQLAlumnoDAO implements AlumnoDAO{
    
    final String INSERT = "insert into alumnos(nombre, apellido, fecha_nac) values(?, ?, ?)";
    final String UPDATE = "update alumnos set nombre = ?, apellidos= ?, fecha_nac =? where id_alumno=?";
    final String DELETE = "delete from alumnos where id_alumno=?";
    final String GETALL = "select id_alumno, nombre, apellidos, fecha_nac from alumnos";
    final String GETONE = "select id_alumno, nombre, apellidos, fecha_nac from alumnos where id_alumno=?";
    
    private Connection con;
    
    public MySQLAlumnoDAO(Connection con){
        this.con = con;
    }

    @Override
    public void insertar(Alumno a) throws DAOException{
        PreparedStatement stat = null;
        ResultSet rs = null;
        try {
            stat = con.prepareStatement(INSERT);
            stat.setString(1, a.getNombre());
            stat.setString(2, a.getApellidos());
            stat.setDate(3, new Date(a.getFechaNacimiento().getTime()));
            if(stat.executeUpdate() == 0)
                throw new DAOException("Es posible que no se haya realizado la inserción");
            rs = stat.getGeneratedKeys();
            if(rs.next()){
                // Obtenemos de esta manera el ID, que es Long que hay en la columna 1
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
    public void modificar(Alumno a) throws DAOException{
        PreparedStatement stat = null;
        try {
            stat = con.prepareStatement(UPDATE);
            stat.setString(1, a.getNombre());
            stat.setString(2, a.getApellidos());
            stat.setDate(3, new Date(a.getFechaNacimiento().getTime()));
            stat.setLong(4, a.getId());
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
    public void eliminar(Alumno a) throws DAOException{
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
    
    private Alumno convertir(ResultSet rs) throws SQLException{
        String nombre = rs.getString("nombre");
        String apellidos = rs.getString("apellidos");
        Date fechaNac = rs.getDate("fecha_nac");
        Alumno alumno = new Alumno(nombre, apellidos, fechaNac);
        alumno.setId(rs.getLong("id_alumno"));
        return alumno;
    }

    @Override
    public List<Alumno> obtenerTodos() throws DAOException{
        PreparedStatement stat = null;
        ResultSet rs = null;
        List<Alumno> alumnos = new ArrayList<>();
        try {
            stat = con.prepareStatement(GETALL);
            rs = stat.executeQuery();
            while(rs.next()) {
                alumnos.add(convertir(rs));
            }
        } catch(SQLException e) {
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
        return alumnos;
    }

    @Override
    public Alumno obtener(Long id) throws DAOException{
        PreparedStatement stat = null;
        ResultSet rs = null;
        Alumno a = null;
        try {
            stat = con.prepareStatement(GETONE);
            stat.setLong(1, id);
            rs = stat.executeQuery();
            if(rs.next()) {
                a = convertir(rs);
            } else {
                throw new DAOException("No se ha encontrado ese registro");
            }
        } catch(SQLException e) {
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
        return a;
    }
    
}
