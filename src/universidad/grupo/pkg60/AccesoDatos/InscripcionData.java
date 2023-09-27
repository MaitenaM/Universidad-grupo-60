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
    private MateriaData md= new MateriaData();
    private AlumnoData ad = new AlumnoData();
    


 
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
        List<Inscripcion> cursada = new ArrayList<>();
        String sql = "SELECT * FROM inscripcion";
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                
                Inscripcion insc = new Inscripcion();
                insc.setIDInscripcion(rs.getInt("idInscripto"));
                Alumno alu = ad.buscarAlumno(rs.getInt("idAlumno"));
                Materias mat = md.buscarMateriaData(rs.getInt("idMateria"));
                insc.setAlumno(alu); 
                insc.setMaterias(mat);
                insc.setNota(rs.getDouble("nota"));
                cursada.add(insc);
                
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al obtener inscripciones" + ex.getMessage() );
        }
        return cursada;
    
}

public List<Inscripcion> obtenerInscripcionesPorId(int idalumno){
        List<Inscripcion> cursada = new ArrayList<>();
        String sql = "SELECT * FROM inscripcion  WHERE idAlumno = ?";
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idalumno);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                
                Inscripcion insc = new Inscripcion();
                insc.setIDInscripcion(rs.getInt("idInscripto"));
                Alumno alu = ad.buscarAlumno(rs.getInt("idAlumno"));
                Materias mat = md.buscarMateriaData(rs.getInt("idMateria"));
                insc.setAlumno(alu); 
                insc.setMaterias(mat);
                insc.setNota(rs.getDouble("nota"));
                cursada.add(insc);
                
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al obtener inscripciones" + ex.getMessage() );
        }
        return cursada;

}

public List<Materias> obtenerMateriasCursadas (int idalumno){
    List<Materias> materias = new ArrayList<> ();
    String sql = "SELECT inscripcion.idMateria, materia.materia, materia.anioMateria " +
                 "FROM inscripcion " +
                 "INNER JOIN materia ON inscripcion.idMateria = materia.idMateria " +
                 "WHERE inscripcion.idAlumno = ?";
    try {
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1,idalumno);
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            Materias materia = new Materias();
            int IDMateria = rs.getInt("idMateria");
            String Nombre = rs.getString("materia");
             int AnioMateria = rs.getInt("anioMateria");
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
    
     
public List<Materias> obtenerMateriasNOCursadas(int idAlumno){
       ArrayList<Materias> materias = new ArrayList<>();
    String sql = "SELECT * from materia WHERE estado = 1 AND idMateria not in"
            +"(SELECT idMateria FROM inscripcion WHERE idAlumno =?)";
    
      try {
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1,idAlumno);
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            Materias materia = new Materias();
            int IDMateria = rs.getInt("idMateria");
            String Nombre = rs.getString("materia");
             int AnioMateria = rs.getInt("anioMateria");
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
         ArrayList<Alumno> alumnosMateria = new ArrayList<>();
         String sql = "SELECT a.idAlumno, dni, nombre, apellido, fechaNacimiento, estado "
                 +"FROM inscripcion i, alumno a WHERE i.idAlumno = a.idAlumno AND idMateria = ? AND a.estado = 1";
         System.out.println("paso1");
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idMateria);
            System.out.println("paso2");
            
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                System.out.println("paso3");
                Alumno alumno = new Alumno();
                alumno.setIdAlumno(rs.getInt("idAlumno"));
                alumno.setApellido(rs.getString("apellido"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setFechaNacimiento(rs.getDate("fechaNacimiento").toLocalDate());
                alumno.setEstado(rs.getBoolean("estado"));
                alumnosMateria.add(alumno);
                System.out.println("paso4");
            }
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inscripcion");
        }
        return alumnosMateria;
         
     }
   }
