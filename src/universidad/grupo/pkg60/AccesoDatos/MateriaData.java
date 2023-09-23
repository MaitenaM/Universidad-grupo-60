/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidad.grupo.pkg60.AccesoDatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import universidad.grupo.pkg60.Entidades.Materias;
       

/**
 *
 * @author Fabrizzio
 */
public class MateriaData {
    
    
    private Connection con = null;
    


    // Constructor de la clase
    public MateriaData() {
    con=Conexion.getConexion();
        
    }



    // Métodos para acceder a los datos de material
    public void guardarMateriaData(Materias materia) {
        String sql = "INSERT INTO materia (IDMateria, Nombre, AnioMateria, Activo) VALUES (?,?,?,?)";
        try{
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
            ps.setInt(1, materia.getIDMateria());
            
            ps.setString(2, materia.getNombre());
           
            ps.setInt(3, materia.getAnioMateria());
          
            ps.setBoolean(5, materia.isActivo());
            
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()){
                materia.setIDMateria(rs.getInt("idMateria"));
                JOptionPane.showMessageDialog(null, "Materia añadida con exito");
                
            }
            ps.close();
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al cargar materia" + ex.getMessage());
        }
    }
    
      public void buscarMateriaData(int IDMateria) {
        // Implementación para modificar los datos de material
    }

    public void eliminarMateriaData(int IDMateria) {
        // Implementación para eliminar los datos de material
    }

    public void modificarMateriaData(Materias materia) {
        // Implementación para modificar los datos de material
    }

    public List<MateriaData> listarMaterias() {
        // Implementación para obtener la lista de materiales
        return new ArrayList<MateriaData>();
    }
}

                

    

