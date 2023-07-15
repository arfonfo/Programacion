
package com.arfonfo.proyectobdmysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author alfon
 */
public class ProyectoBDMySql {
    
    public static Connection openConnection(){
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String connectionUrl="jdbc:mysql://localhost:3306/prueba?user=alfon&password=Alfonso$11";
            con=DriverManager.getConnection(connectionUrl);
            
            Statement s = con.createStatement();
            ResultSet rs = s.executeQuery("select * from products");

        } catch (SQLException | ClassNotFoundException e) {
            System.out.println("Error: " + e.toString());
        }
        return con;
    }

    public static void main(String[] args){        
        Connection c1 = openConnection();
        
        try {
            Statement s = c1.createStatement();
            ResultSet rs = s.executeQuery("select * from products");

            while (rs.next()) {
                System.out.println(rs.getString(2));
            } 
        } catch (SQLException e) {
                System.out.println("Error" + e.toString());
        
            
        }
    }
    
    
}
