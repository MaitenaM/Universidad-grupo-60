/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidad.grupo.pkg60.Entidades;

/**
 *
 * @author Maite
 */
public class Inscripcion {
    
    private int IDInscripcion;
    private Alumnos alumno;
    private Materias materias;
    private double nota;

    public Inscripcion(int IDInscripcion, Alumnos alumno, Materias materias, double nota) {
        this.IDInscripcion = IDInscripcion;
        this.alumno = alumno;
        this.materias = materias;
        this.nota = nota;
    }

    public Inscripcion(Alumnos alumno, Materias materias, double nota) {
        this.alumno = alumno;
        this.materias = materias;
        this.nota = nota;
    }

    public Inscripcion() {
    }

    public int getIDInscripcion() {
        return IDInscripcion;
    }

    public void setIDInscripcion(int IDInscripcion) {
        this.IDInscripcion = IDInscripcion;
    }

    public Alumnos getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumnos alumno) {
        this.alumno = alumno;
    }

    public Materias getMaterias() {
        return materias;
    }

    public void setMaterias(Materias materias) {
        this.materias = materias;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Inscripcion{" + "IDInscripcion=" + IDInscripcion + ", alumno=" + alumno + ", materias=" + materias + ", nota=" + nota + '}';
    }
    
    
    
}
