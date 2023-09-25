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
import java.util.logging.Level;
import java.util.logging.Logger;
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
        String sql = "INSERT INTO materia (materia, anioMateria, estado) VALUES (?,?,?)";
        try{
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS); 
            ps.setString(1, materia.getMateria());
            ps.setInt(2, materia.getAnioMateria());
            ps.setBoolean(3, materia.isActivo());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()){
                materia.setIDMateria(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Materia añadida con exito");   
            }
            ps.close();
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al cargar materia" + ex.getMessage());
        }
    }
    
      public Materias buscarMateriaData(int IDMateria) {
        // Implementación para modificar los datos de material
        String sql = "SELECT idMateria, materia, anioMateria, estado FROM materia WHERE idMateria = ?";
        Materias materia = null;
        PreparedStatement ps = null;
        
        try{
            ps = con.prepareStatement(sql);
            ps.setInt(1, IDMateria);
            ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            System.out.println("MATERIA ENCONTRADA");
            materia=new Materias();
            materia.setIDMateria(rs.getInt("idMateria"));      
            materia.setMateria(rs.getString("materia"));
            materia.setAnioMateria(rs.getInt("anioMateria"));
            }
            ps.close();
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al buscar Materia por ID: " + ex.getMessage());
        }
        return materia;
    }

    public void eliminarMateriaData(int IDMateria) {
        // Implementación para eliminar los datos de material
        String sql = "UPDATE materia SET estado = 0 WHERE idMateria = ? ";
        PreparedStatement ps=null;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, IDMateria);
            int fila=ps.executeUpdate();
            if(fila==1){
                JOptionPane.showMessageDialog(null, " Se eliminó la Materia con exito.");
            }
            ps.close();
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al modificar materia: " + ex.getMessage());
        }
            
    }

    public void modificarMateriaData(Materias materia) {
                String sql = "UPDATE materia SET Materia=?, AnioMateria=?, estado=? WHERE IDMateria=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, materia.getMateria());
            ps.setInt(2, materia.getAnioMateria());
            ps.setBoolean(3, materia.isActivo());
            ps.setInt(4, materia.getIDMateria());
            int columnaM = ps.executeUpdate();
            if (columnaM > 0) {
                JOptionPane.showMessageDialog(null, "Materia modificada con éxito.");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró ninguna materia con el ID ingresado.");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al modificar materia: " + ex.getMessage());
        }
    }

    public List<Materias> listarMaterias() {
        List<Materias> materias = new ArrayList<>();
        String sql = "SELECT * FROM materia";
        try {
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                int idMateria = rs.getInt("IDMateria");
                String materia = rs.getString("materia");
                int anioMateria = rs.getInt("AnioMateria");
                boolean estado = rs.getBoolean("estado");
                Materias listmateria = new Materias(idMateria, materia, anioMateria, estado);
                materias.add(listmateria);
            }
            statement.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al obtener la lista de materias: " + ex.getMessage());
        }
        return materias;
}

}

                

    

