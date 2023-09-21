/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidad.grupo.pkg60.AccesoDatos;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import universidad.grupo.pkg60.Entidades.Alumno;

/**
 *
 * @author Fabrizzio
 */
public class AlumnoData {
    
    
    private Connection con = null;

    public AlumnoData() {
        
        con=Conexion.getConexion();
        
    }
    
    public void guardarAlumno(Alumno alumno) {
        String sql = "INSERT INTO alumno (dni,apellido,nombre,fechaNacimiento,estado) VALUES (?,?,?,?,?)";
        try{
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
            ps.setInt(1, alumno.getDNI());
            
            ps.setString(2, alumno.getApellido());
           
            ps.setString(3, alumno.getNombre());
          
            ps.setDate(4, Date.valueOf(alumno.getFechaNac()));
          
            ps.setBoolean(5, alumno.isEstado());
            
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()){
                alumno.setIdAlumno(rs.getInt("idAlumno"));
                JOptionPane.showMessageDialog(null, "Alumno añadido con exito");
                
            }
            ps.close();
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla alumno" + ex.getMessage());
        }
    }
    
    
    
    
}
