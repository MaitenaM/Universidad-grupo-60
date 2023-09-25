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
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import universidad.grupo.pkg60.Entidades.Alumno;
import universidad.grupo.pkg60.Entidades.Inscripcion;
import universidad.grupo.pkg60.Entidades.Materias;

/**
 *
 * @author Fabrizzio Jasmine Marcos
 */

public class InscripcionData {
    
    
    private Connection con = null;
    


 
    public InscripcionData() {
    con=Conexion.getConexion();
        
    }
    
    public void guardarInscripcion(Inscripcion insc){
        String sql = "INSERT INTO inscripcion (nota, idAlumno, idMateria) VALUES(?, ?, ?)";
        
        try{
            try (PreparedStatement ps = con.prepareStatement(sql)) {
                Alumno alumno = new Alumno();
                ps.setDouble(1,insc.getNota());
                ps.setInt(2, insc.getAlumno().getIdAlumno());
                ps.setDouble(3, insc.getMaterias().getIDMateria());
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "La inscripcion fue guardada con exito.");
            }
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Error al guardar la inscripcion."+ e.getMessage());
        }
    }

public List<Inscripcion> obtenerInscripciones(){
        List<Inscripcion> inscripciones = new ArrayList<>();
        String sql = "SELECT * FROM inscripcion";
        
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                int idAlumno = rs.getInt("idAlumno");
                int idMateria = rs.getInt("idMateria");
                double nota = rs.getDouble("nota");
                Inscripcion inscripcion = new Inscripcion();
                inscripciones.add(inscripcion);
                
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al obtener inscripciones" + ex.getMessage() );
        }
        return inscripciones;
    
}

public List<Inscripcion> obtenerInscripcionesPorAlumno(int id){
        List<Inscripcion> inscripciones = new ArrayList<>();
        String sql = "SELECT * FROM inscripcion WHERE idAlumno = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                int idAlumno = rs.getInt("idAlumno");
                int idMateria = rs.getInt("idMateria");
                double nota = rs.getDouble("nota");
                Inscripcion inscripcion = new Inscripcion();
                inscripciones.add(inscripcion);
            }
            ps.close();
        }catch (SQLException e) {
         JOptionPane.showMessageDialog(null, "Error al obtener inscripciones por alumno: " + e.getMessage());
} 
        return inscripciones;
}
    public List<Materias> obtenerMateriasCursadas (int id){
    List<Materias> materias = new ArrayList<> ();
    String sql = "SELECT inscripcion.idMateria, materia.nombre, materia.anio " +
                 "FROM inscripcion " +
                 "INNER JOIN materia ON inscripcion.idMateria = materia.idMateria " +
                 "WHERE inscripcion.idAlumno = ?";
    try {
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1,id);
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            Materias materia = new Materias();
            int IDMateria = rs.getInt("idMateria");
            String Nombre = rs.getString("nombre");
             int AnioMateria = rs.getInt("anio");
             materia.setIDMateria(IDMateria); 
             materia.setMateria(Nombre); 
             materia.setAnioMateria(AnioMateria); 
             materias.add(materia);
             
        }
         ps.close(); 
         rs.close();
     } catch (SQLException e) {
          JOptionPane.showMessageDialog(null, "Error al obtener Inscripciones."+e.getMessage());
     }
            return materias;
}
    
     
     public List<Materias> obtenerMateriasNOCursadas(int id){
        return null;
    
}
     
     public void borrarInscripcionMateriaAlumno(int idAlumno, int idMateria){
      String sql = "DELETE FROM inscripcion WHERE idAlumno = ? AND idMateria = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ps.setInt(2, idMateria);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Inscripción borrada con éxito.");
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al borrar inscripción: " + e.getMessage());
        }  
     }
     
     public void actualizarNota(int idAlumno, int idMateria, double nota){
          String sql = "UPDATE inscripcion SET nota = ? WHERE idAlumno = ? AND idMateria = ?";
        try {
              try (PreparedStatement ps = con.prepareStatement(sql)) {
                  ps.setDouble(1, nota);
                  ps.setInt(2, idAlumno);
                  ps.setInt(3, idMateria);
                  ps.executeUpdate();
                  JOptionPane.showMessageDialog(null, "Nota actualizada con éxito.");
              }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al actualizar nota: " + e.getMessage());
        }
     }
     
     public List<Alumno> obtenerAlumnosXMateria(int idMateria){
        return null;
         
     }
   }
