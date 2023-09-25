/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidad.grupo.pkg60;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import universidad.grupo.pkg60.AccesoDatos.AlumnoData;
import universidad.grupo.pkg60.AccesoDatos.Conexion;
import universidad.grupo.pkg60.AccesoDatos.InscripcionData;
import universidad.grupo.pkg60.AccesoDatos.MateriaData;
import universidad.grupo.pkg60.Entidades.Alumno;
import universidad.grupo.pkg60.Entidades.Inscripcion;
import universidad.grupo.pkg60.Entidades.Materias;


/**
 *
 * @author Maite
 */
public class UniversidadGrupo60 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       // Conexion.getConexion();
    //Alumnos alumno =new Alumnos(42650, "ariatello", "Fabrizzio",fecha2, true);
    //String fecha1 ="2000-06-20";
        
    String fecha1 = "2000-01-01";
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    LocalDate fecha2 = LocalDate.parse(fecha1,formatter);
    AlumnoData alumnodata = new AlumnoData();
   
   
    Alumno alum1 = new Alumno(42650, "ariatello", "Fabrizzio",fecha2, true);
    //Alumno alum2 = new Alumno(11111, "cabral", "Fabrizzio",fecha2, true);
    // alum3 = new Alumno(22222, "peña", "Fabrizzio",fecha2, true);
    // alum4 = new Alumno(33333, "piña", "Fabrizzio",fecha2, true);
    
    /*    
    
    alumnodata.guardarAlumno(alum1);
    alumnodata.guardarAlumno(alum2);
    alumnodata.guardarAlumno(alum3);
    alumnodata.guardarAlumno(alum4);
    */
    
    /*Materias mat = new Materias("Matematica",2,true);
    Materias mat2 = new Materias("Lengua",1,true);
    MateriaData materiadata = new MateriaData();
    //materiadata.guardarMateriaData(mat);
    //materiadata.guardarMateriaData(mat2);
    Materias mat3 = new Materias("Matematica", 3, true);
        System.out.println(materiadata.buscarMateriaData(4));
*/
    //Alumno alum4 = new Alumno(44444, "piña", "Pedro",fecha3, true);
    //alumnodata.guardarAlumno(alum4);
    //System.out.println(alumnodata.buscarAlumno(8).getApellido());
    //System.out.println(alumnodata.buscarAlumnoPorDni(33333).getNombre());
    //Alumno alum5 = new Alumno(46843, "smit", "Pedro",fecha3, true);
    //alumnodata.guardarAlumno(alum5);
    
  MateriaData materia = new MateriaData();
    Materias mat3 = new Materias("Geografia",4,true);
   // materia.guardarMateriaData(mat3);
    
    //Materias mat4 = new Materias("Ingles",4,true);
    //materia.guardarMateriaData(mat4);
    //Materias mat5 = new Materias("Educ. Fisica",1,true);
    //materia.guardarMateriaData(mat5);
        //System.out.println(materia.buscarMateriaData(7).getMateria());
   // Alumno alum1 = new Alumno(1,42650, "ariatello", "Fabrizzio",fecha3, true);
   //alumnodata.modificarAlumno(alum1);
   //Materias mat5 = new Materias(9,"Educ. Fisica",2,true);
   //materia.modificarMateriaData(mat5);
        //System.out.println(materia.listarMaterias());
        
       // materia.eliminarMateriaData(9);
       
       
       InscripcionData inscripcion = new InscripcionData();
       Alumno pedro = alumnodata.buscarAlumno(6);
       Materias  lengua = materia.buscarMateriaData(2);
       Inscripcion inscri =new Inscripcion(pedro,lengua,8);
       inscripcion.guardarInscripcion(inscri);
}
}

