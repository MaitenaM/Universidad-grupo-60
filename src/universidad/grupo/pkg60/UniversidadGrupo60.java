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
    
    //Formatizando Fechas    
        
    String f1= "2000-05-01";
    String f2= "2001-01-23";
    String f3= "2000-12-25";
    String f4= "1998-03-17";
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    LocalDate fecha1 = LocalDate.parse(f1,formatter);
    LocalDate fecha2 = LocalDate.parse(f2,formatter);
    LocalDate fecha3 = LocalDate.parse(f3,formatter);
    LocalDate fecha4 = LocalDate.parse(f4,formatter);
  
  
    //INSTACIAMIENTO DE LAS CLASES PARA USO DE LOS METODOS
    
    AlumnoData alumnodata = new AlumnoData();
    MateriaData materiadata = new MateriaData();
    InscripcionData inscripcion = new InscripcionData();
    
    //Creacion de alumnos
    
    Alumno alum1 = new Alumno(14, 25871933,"Cabral","Matias",fecha1,true);
    Alumno alum2 = new Alumno(15, 58234130,"Perez","Agustin",fecha2,true);
    Alumno alum3 = new Alumno(16, 15487879,"Rios","Federico",fecha3,true);
    Alumno alum4 = new Alumno(17, 18646832,"Gomez","Elias",fecha4,true);
    

    
    //Agregar Alumnos
   /* 
    alumnodata.guardarAlumno(alum1);
    alumnodata.guardarAlumno(alum2);
    alumnodata.guardarAlumno(alum3);
    alumnodata.guardarAlumno(alum4);
    */
    /*
    
    
    //Asignando Alumnos a Variables
    
    
    Alumno Matias = alumnodata.buscarAlumno(14);
    Alumno Agustin = alumnodata.buscarAlumno(15);
    Alumno Federico = alumnodata.buscarAlumno(16);
    Alumno Elias = alumnodata.buscarAlumno(17);
    
    
    
    
    //Creacion Materias
    
    Materias mat1 = new Materias ("Matematica 1", 1, true);
    Materias mat2 = new Materias ("Matematica 2", 2, true);
    Materias mat3 = new Materias ("Lengua 1", 1, true);
    Materias mat4 = new Materias ("Quimica 3", 3, true);
    Materias mat5 = new Materias ("Educacion Fisica 1", 1, true);
    Materias mat6 = new Materias ("Fisica 3",3, true);
    Materias mat7 = new Materias ("Algoritmo 4", 4, true);
    
    //Agregar Materias
    
    materiadata.guardarMateriaData(mat1);
    materiadata.guardarMateriaData(mat2);
    materiadata.guardarMateriaData(mat3);
    materiadata.guardarMateriaData(mat4);
    materiadata.guardarMateriaData(mat5);
    materiadata.guardarMateriaData(mat6);
    materiadata.guardarMateriaData(mat7);
    
    
    //Asignando Materias a variables
    
    
    Materias Matematica1 = materiadata.buscarMateriaData(10);
    Materias Matematica2 = materiadata.buscarMateriaData(11);
    Materias Lengua1 = materiadata.buscarMateriaData(12);
    Materias Quimica3 = materiadata.buscarMateriaData(13);
    Materias EducacionFisica1 = materiadata.buscarMateriaData(14);
    Materias Fisica3 = materiadata.buscarMateriaData(15);
    Materias Algoritmo4 = materiadata.buscarMateriaData(16);
    

    
    
    // Creacion de Incripciones
    
    Inscripcion ins1 = new Inscripcion(Matias,Matematica1,10);
    Inscripcion ins2 = new Inscripcion(Agustin,Lengua1,8);
    Inscripcion ins3 = new Inscripcion(Elias,Quimica3,7);
    Inscripcion ins4 = new Inscripcion(Matias,Algoritmo4,10);
    Inscripcion ins5 = new Inscripcion(Federico,EducacionFisica1,5);
    Inscripcion ins6 = new Inscripcion(Federico,Matematica2,2);
    
    
    
    //Agregacion de Inscripciones
    
    
    inscripcion.guardarInscripcion(ins1);
    inscripcion.guardarInscripcion(ins2);
    inscripcion.guardarInscripcion(ins3);
    inscripcion.guardarInscripcion(ins4);
    inscripcion.guardarInscripcion(ins5);
    inscripcion.guardarInscripcion(ins6);
    
    
     */  
    
    //Listar Inscripciones
    /*
        for (Inscripcion ins : inscripcion.obtenerInscripciones() ){
            System.out.println("------------------------------------");
            
            System.out.println("ID: "+ ins.getIDInscripcion());
            System.out.println("Alumnos: " + ins.getAlumno());
            System.out.println("Materia: " + ins.getMaterias());
            System.out.println("Nota: " + ins.getNota());
            
            System.out.println("------------------------------------");
            
        } 
    */
    
    /*    
    for (Inscripcion ins : inscripcion.obtenerInscripcionesPorId(16) ){
            System.out.println("------------------------------------");
            
            System.out.println("ID: "+ ins.getIDInscripcion());
            System.out.println("Alumnos: " + ins.getAlumno());
            System.out.println("Materia: " + ins.getMaterias());
            System.out.println("Nota: " + ins.getNota());
            
            System.out.println("------------------------------------");
        
    
           }
           */
    /*
    for (Materias ins : inscripcion.obtenerMateriasCursadas(16)){
            System.out.println("------------------------------------");
            
            
            System.out.println("Materia: " + ins.getMateria());
            
            System.out.println("------------------------------------");
        
    
           }

           */
    /*
    for (Materias ins : inscripcion.obtenerMateriasNOCursadas(16)){
            System.out.println("------------------------------------");
            
            
            System.out.println("Materia: " + ins.getMateria());
            
            System.out.println("------------------------------------");
        
    
           } */
    //inscripcion.borrarInscripcionMateriaAlumno(16,11);
    
    //inscripcion.actualizarNota(15, 12, 7);
    
    for (Alumno ins : inscripcion.obtenerAlumnosXMateria(10)){
            System.out.println("------------------------------------");
            
            
            System.out.println("Nombre: " + ins.getNombre());
            System.out.println("Apellido: " + ins.getApellido());
            
            System.out.println("------------------------------------");
        
    
           }
}
}
