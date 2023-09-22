/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidad.grupo.pkg60.AccesoDatos;

/**
 *
 * @author Fabrizzio Jasmine
 */
public List<Materia> obtenerMateriasCursadas (int id) {
  List<Materia> materias = new ArrayList<Materia> ();

  try {
        String sql = "SELECT inscripción,idMateria, nombre, año FROM inscripcion,"
                + " materia WHERE inscripcion.idMateria = materia.idMateria\n" +
            "AND inscripcion.idAlumno = ? ;"
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(l, id);
        ResultSet rs = ps.executeQuery();
        Materia materia;
|       while(rs.next());
            materia = new Materia();
            materia.setIdMateria(rs.getInt("idMateria"));
            materia.setNombre(rs.getString("nombre"));
            materia.setAnio(rs.getInt("año"));
            materias.add(materia);
        }
         ps.close();
     } catch (SQLException ex) {
          JOptionPane.showMessageDialog(null, "Error al obtener Inscripciones."+ex.getMessage());
     }
     return materias;   
   }
