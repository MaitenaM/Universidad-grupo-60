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
    private int IDAlumno;
    private int DNI;
    private String Apellido;
    private String Nombre;
    private LocalDate FechaNac;
    private boolean Estado;

    public Alumno() {
    }

    public Alumno(int DNI, String Apellido, String Nombre, LocalDate FechaNac, boolean Estado) {
        this.DNI = DNI;
        this.Apellido = Apellido;
        this.Nombre = Nombre;
        this.FechaNac = FechaNac;
        this.Estado = Estado;
    }

    public Alumno(int IDAlumno, int DNI, String Apellido, String Nombre, LocalDate FechaNac, boolean Estado) {
        this.IDAlumno = IDAlumno;
        this.DNI = DNI;
        this.Apellido = Apellido;
        this.Nombre = Nombre;
        this.FechaNac = FechaNac;
        this.Estado = Estado;
    }

    public int getIDAlumno() {
        return IDAlumno;
    }

    public void setIDAlumno(int IDAlumno) {
        this.IDAlumno = IDAlumno;
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

    public LocalDate getFechaNac() {
        return FechaNac;
    }

    public void setFechaNac(LocalDate FechaNac) {
        this.FechaNac = FechaNac;
    }

    public boolean isEstado() {
        return Estado;
    }

    public void setEstado(boolean Estado) {
        this.Estado = Estado;
    }

    @Override
    public String toString() {
        return "Alumno{" + "IDAlumno=" + IDAlumno + ", DNI=" + DNI + ", Apellido=" + Apellido + ", Nombre=" + Nombre + '}';
    }

    public void setIdAlumno(int aInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
