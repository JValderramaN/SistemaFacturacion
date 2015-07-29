/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sistema.de.facturacion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Julio
 */
public class Conexion {
 
    static String bd = "ventas";   
    static String login = "postgres";   
    static String password = "admin";   
    static String url = "jdbc:postgresql://localhost:5432/" ;   
    static private Connection conn = null; 
     
    
    
    static public void createConexion() {      
        try{        
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection(url+bd,login,password);
            System.out.println("Conexion correcta "+conn);
        }catch(SQLException e){
            System.out.println(e);
        }catch(ClassNotFoundException e){
             System.out.println(e);
        }
    }
     
   static  public Connection getConnection(){
       if ( conn == null){
           createConexion();
       }
       
        return conn;
    }
     
   static public void desconectar(){
        conn = null;
        System.out.println("La conexion a la  base de datos "+bd+" a terminado");
    }
}
