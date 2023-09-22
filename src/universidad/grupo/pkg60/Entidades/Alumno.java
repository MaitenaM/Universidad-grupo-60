/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidad.grupo.pkg60.Entidades;

import java.time.LocalDate;

/**
 *
 * @author Maite
 */
public class Alumno {
    private int IdAlumno;
    private int DNI;
    private String Apellido;
    private String Nombre;
    private LocalDate FechaNacimiento;
    private boolean Estado;

    public Alumno() {
    }

    //public Alumnos(int i, String ariatello, String fabrizzio, LocalDate fecha2, boolean b) {
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    //}

    public  Alumno(int DNI, String Apellido, String Nombre, LocalDate FechaNacimiento, boolean Estado) {
        this.DNI = DNI;
        this.Apellido = Apellido;
        this.Nombre = Nombre;
        this.FechaNacimiento = FechaNacimiento;
        this.Estado = Estado;
    }

    public  Alumno(int IdAlumno, int DNI, String Apellido, String Nombre, LocalDate FechaNacimiento, boolean Estado) {
        this.IdAlumno = IdAlumno;
        this.DNI = DNI;
        this.Apellido = Apellido;
        this.Nombre = Nombre;
        this.FechaNacimiento = FechaNacimiento;
        this.Estado = Estado;
    }

    public int getIdAlumno() {
        return IdAlumno;
    }

    public void setIdAlumno(int IdAlumno) {
        this.IdAlumno = IdAlumno;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public LocalDate getFechaNacimiento() {
        return FechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate FechaNacimiento) {
        this.FechaNacimiento = FechaNacimiento;
    }

    public boolean isEstado() {
        return Estado;
    }

    public void setEstado(boolean Estado) {
        this.Estado = Estado;
    }

    @Override
    public String toString() {
        return "Alumno{" + "IDAlumno=" + IdAlumno + ", DNI=" + DNI + ", Apellido=" + Apellido + ", Nombre=" + Nombre + '}';
    }

    /**
     *
     * @param aInt
     */
    
    
    
    
}
