package config;

import java.sql.Connection;
import java.sql.DriverManager;


public class conexion {

    Connection con;
    
    public conexion(){
        try {
            
            Class.forName("com.mysql.jdbc.Driver");
            
            con  = DriverManager.getConnection("jdbc:mysql://localhost:3306/bdumg", "root", "");
            
        } catch (Exception e) {
              System.err.println("Error al conectar a la base de datos. " + e);
        }
        
    }
    
    public Connection getConnection(){
        return con;
    }
    
}
