

package com.arfonfo.proyectobd;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author alfon
 */
public class ProyectoBD{
    
    Connection conexion;
    
    public ProyectoBD() throws SQLException{
        try {
            conectar();
            consulta("López");
            transaccion();
        } finally {
            cerrar();
        }
    }
    
    public void conectar() throws SQLException{
        String jdbc = "jdbc:mysql://localhost:3306/prueba";
        conexion=DriverManager.getConnection(jdbc, "alfon", "Alfonso$11");
        // Para que no se hagan los commit de forma automática
        conexion.setAutoCommit(false);
    }
    
    public void cerrar() throws SQLException{
        if(conexion!=null)
            conexion.close();
    }
    
    private void consulta(String apellidos) throws SQLException {
        String query = "select id_alumno, nombre, apellidos from alumnos where apellidos = ?";
        // Directamente el PreparedStatement es el que trata el error
        PreparedStatement myStatement = conexion.prepareStatement(query);
        
        
        // Haciéndolo con los set nos evitamos que se introduzca cualquier tipo de parámetro indeseado antes de realizar la query
        // Si no podríamos por ejemplo eliminar la tabla si nos introducen un drop o algo así, pues se ejecuta de forma automática
        myStatement.setString(1, apellidos);
        
        // Se ejecuta el ResultSet sabiendo que la query es correcta
        ResultSet set = myStatement.executeQuery();
        while(set.next()){
            int idAlumno=set.getInt("id_alumno");
            String nomAlumno=set.getString("nombre");
            String apeAlumno=set.getString("apellidos");
            System.out.println("Alumno: " + idAlumno + ", nombre: " + nomAlumno + ", apellidos: " + apeAlumno);
        }
        // Cerramos el cursor y el statement
        set.close();
        myStatement.close();
    }
    
    private void transaccion() throws SQLException {
        final String PROFESOR = "INSERT INTO profesores(id_profesor, nombre, apellidos) values (?, ?, ?);";
        final String ASIGNATURA = "INSERT INTO asignaturas(id_asignatura, nombre, profesor) values (?, ?, ?);";
        PreparedStatement profesor = null, asignatura = null;
        try {
            profesor = conexion.prepareStatement(PROFESOR);
            profesor.setInt(1, 50);
            profesor.setString(2, "Pepito");
            profesor.setString(3, "Pérez");
            profesor.executeUpdate();
            
            asignatura = conexion.prepareStatement(ASIGNATURA);
            asignatura.setInt(1, 100);
            asignatura.setString(2, "Fundamentos de Bases de Datos");
            asignatura.setInt(3, 50);
            asignatura.executeUpdate();
            
            conexion.commit();
            System.out.println("Ejecutado");
        } catch (SQLException ex) {
            conexion.rollback();
            System.out.println(ex.toString());
        } finally {
            if (profesor!=null)
                profesor.close();
            if (asignatura!=null)
                asignatura.close();
        }
        
    }
    
    public static void verDatos(Connection conexion){
        String consultasql = "select * from products";
        
        try {
            PreparedStatement sentencia= conexion.prepareStatement(consultasql);
            ResultSet consulta = sentencia.executeQuery();
            
            while(consulta.next()){
                System.out.println(consulta.getString("id"));
                System.out.println(consulta.getString("name"));
                System.out.println(consulta.getString("created_by"));
                System.out.println(consulta.getString("marca"));
            }
            
            
        } catch (SQLException e) {
        }

    }
    
    public static void main(String[] args) {
        Connection conexion=null;
        
        try {
            new ProyectoBD(); 
            
        } catch (SQLException e) {
            System.out.println("Error de conexión " + e.getMessage());
        }
    }
}
