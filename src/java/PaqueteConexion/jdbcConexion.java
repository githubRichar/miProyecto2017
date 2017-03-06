/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PaqueteConexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author RICHAR
 */
public class jdbcConexion {

    public static Connection conexion() {
        
    
        Connection conexion = null;
        try {
            Class.forName("org.postgresql.Driver");
            String servidor = "jdbc:postgresql://localhost:5432/OfertasLaborales";
            String usuario = "postgres";
            String pass = "123456";
            conexion = DriverManager.getConnection(servidor, usuario, pass);

        } 
        catch (ClassNotFoundException ex) {
            System.out.println(ex.getMessage());

        } 
        catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } 
        catch (Exception ex) {
            System.out.println(ex.getMessage());
        } 
        finally {
            return conexion;
        }

    }
}