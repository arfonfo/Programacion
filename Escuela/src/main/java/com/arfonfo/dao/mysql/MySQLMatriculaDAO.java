
package com.arfonfo.dao.mysql;


import com.arfonfo.escuela.Matricula;
import com.arfonfo.escuela.dao.MatriculaDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
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
    public void insertar(Matricula a) throws DAOException{
        PreparedStatement stat = null;
        try {
            stat = con.prepareStatement(INSERT);
            stat.setLong(1, a.getId().getAlumno());
            stat.setLong(2, a.getId().getAsignatura());
            stat.setInt(3, a.getId().getYear());
            if(a.getNota() != null){
                stat.setInt(4, a.getNota());
            } else {
                // Carga un null entero en la nota
                stat.setNull(4, Types.INTEGER);
            }
            // Hacemos la inserción
            if(stat.executeUpdate() == 0)
                throw new DAOException("Parece que no se ha realizado la inserción");
        } catch (SQLException e) {
            throw new DAOException("Error SQL ", e);
        }
    }

    @Override
    public void modificar(Matricula a) throws DAOException{
        PreparedStatement stat = null;
        try {
            stat = con.prepareStatement(UPDATE);
            stat.setInt(1, a.getNota());
            stat.setLong(2, a.getId().getAlumno());
            stat.setLong(2, a.getId().getAsignatura());
            stat.setInt(4, a.getId().getYear());
            if(stat.executeUpdate() == 0){
                throw new DAOException("Puede que la actualización haya fallado");
            }
        } catch (SQLException e) {
            throw new DAOException("Error SQL", e);
        }
    }

    @Override
    public void eliminar(Matricula a) throws DAOException{
        PreparedStatement stat = null;
        try {
            stat = con.prepareStatement(DELETE);
            stat.setLong(1, a.getId().getAlumno());
            stat.setLong(2, a.getId().getAsignatura());
            stat.setInt(3, a.getId().getYear());
            if(stat.executeUpdate() == 0){
                throw new DAOException("Puede que el borrado haya fallado");
            }
        } catch (SQLException e) {
            throw new DAOException("Error SQL", e);
        }
    }
    
    private Matricula convertir(ResultSet rs) throws SQLException{
        long alumno = rs.getLong("alumno");
        long asignatura = rs.getLong("asignatura");
        int year = rs.getInt("fecha");
        
        // Nota es distinto porque puede ser null
        Integer nota = rs.getInt("nota");
        if(rs.wasNull()) nota = null;
        
        // Creamos la matrícula para devolverla
        Matricula mat = new Matricula(alumno, asignatura, year);
        mat.setNota(nota);
        return mat;
    }

    @Override
    public List<Matricula> obtenerTodos() throws DAOException{
        PreparedStatement stat = null;
        ResultSet rs = null;
        List<Matricula> matriculas = new ArrayList<>();
        
        try {
            stat = con.prepareStatement(GETALL);
            rs = stat.executeQuery();
            
            while(rs.next()){
                matriculas.add(convertir(rs));
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
        return matriculas;
    }

    @Override
    public Matricula obtener(Matricula.IdMatricula id) throws DAOException {
        PreparedStatement stat = null;
        ResultSet rs = null;
        Matricula m = null;
        
        try {
            stat = con.prepareStatement(GETONE);
            stat.setLong(1, id.getAlumno());
            stat.setLong(2, id.getAsignatura());
            stat.setInt(3, id.getYear());
            rs = stat.executeQuery();
            
            if(rs.next()){
                m = convertir(rs);
            } else {
                throw new DAOException("No se han encontrado registros");
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
        return m;
    }
    
    @Override
    public List<Matricula> obtenerPorAlumno(long alumno) throws DAOException {
        PreparedStatement stat = null;
        ResultSet rs = null;
        List<Matricula> matAlumno = new ArrayList<>();
        
        try {
            stat = con.prepareStatement(GETALU);
            stat.setLong(1, alumno);
            rs = stat.executeQuery();
            
            while(rs.next()){
                matAlumno.add(convertir(rs));
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
        return matAlumno;
    }

    @Override
    public List<Matricula> obtenerPorAsignatura(long asignatura) throws DAOException {
        PreparedStatement stat = null;
        ResultSet rs = null;
        List<Matricula> matAsignatura = new ArrayList<>();
        
        try {
            stat = con.prepareStatement(GETASI);
            stat.setLong(1, asignatura);
            rs = stat.executeQuery();
            
            while(rs.next()){
                matAsignatura.add(convertir(rs));
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
        return matAsignatura;
    }

    @Override
    public List<Matricula> obtenerPorCurso(int curso) throws DAOException {
        PreparedStatement stat = null;
        ResultSet rs = null;
        List<Matricula> matCurso = new ArrayList<>();
        
        try {
            stat = con.prepareStatement(GETCUR);
            stat.setInt(1, curso);
            rs = stat.executeQuery();
            
            while(rs.next()){
                matCurso.add(convertir(rs));
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
        return matCurso;
    }
    
}
