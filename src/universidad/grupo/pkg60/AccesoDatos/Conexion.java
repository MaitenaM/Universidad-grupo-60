/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidad.grupo.pkg60.AccesoDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Fabrizzio
 */
public class Conexion {
    private static final String URL ="jdbc:mariadb://localhost";
    private static final String DB ="universidadulp";
    private static final String USUARIO= "root";
    private static final String PASSWORD = "";
    
    private static Connection connection;

    public Conexion() {}
    
    
    public static Connection getConexion(){
        if (connection == null){
            try {
                System.out.println("paso1");
                
               
                
                Class.forName("org.mariadb.jdbc.Driver");
                System.out.println("paso2");
                
                connection = DriverManager.getConnection(URL+"/"+DB,USUARIO,PASSWORD);
               
                System.out.println("paso3");
            }catch (ClassNotFoundException ex){
                JOptionPane.showMessageDialog(null, "Errror al conectarse a la Base de Datos "+ex.getMessage());
            }catch (SQLException ex){
                JOptionPane.showMessageDialog(null, "Error de Conexion");
            }
        }
        System.out.println("Conexion establecida");
        return connection;
        
        
    }

    
    
    
}
