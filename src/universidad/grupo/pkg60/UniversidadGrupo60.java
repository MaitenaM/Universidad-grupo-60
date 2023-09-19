/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidad.grupo.pkg60;

import java.time.LocalDate;
import universidad.grupo.pkg60.AccesoDatos.AlumnoData;
import universidad.grupo.pkg60.AccesoDatos.Conexion;
import universidad.grupo.pkg60.Entidades.Alumno;

/**
 *
 * @author Maite
 */
public class UniversidadGrupo60 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Conexion.getConexion();
        /*LocalDate fecha1 = LocalDate.parse("2000-06-20");
        Alumno al1 = new Alumno(42640944, "Fabrizzio", "Ariatello",fecha1,true);
        AlumnoData.guardarAlumno(al1);*/
    }
    
}
