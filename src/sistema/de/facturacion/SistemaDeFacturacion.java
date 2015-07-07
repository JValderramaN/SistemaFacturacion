/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.de.facturacion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import static sistema.de.facturacion.Conexion.url;

/**
 *
 * @author Luis
 */
public class SistemaDeFacturacion {

     static String bd = "ventas";   
    static String login = "postgres";   
    static String password = "123456";   
   
  
    public static void main(String[] args) {
       
        
         Login Entrar = new Login();
        //continuar present = new continuar();
        Entrar.setTitle("");//asigna titulo a la pantalla
        Entrar.setLocationRelativeTo(null);//centro la pantalla del vieo
        Entrar.setVisible(true);//ago visible la pantalla del video
       
        
        
        
        /*String url = "jdbc:postgresql://localhost:5432/" ;
      Connection conn = null;
             
        try{        
            
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection(url,login,password);
        }catch(SQLException e){
            System.out.println(e);
        }catch(ClassNotFoundException e){
             System.out.println(e);
        }
        
    }
     
     Connection getConnection(){
         Connection conn = null;
        return conn;
    }
     
    public void desconectar(){
        Connection conn = null;
        conn = null;
        System.out.println("La conexion a la  base de datos "+bd+" a terminado");
    }*/
    
}

}


