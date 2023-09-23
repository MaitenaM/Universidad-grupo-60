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
public class Materias {
    
    private int IDMateria;
    private String Nombre;
    private int AnioMateria;
    private boolean Activo;
    public String getNombre;

    public Materias() {
    }

    public Materias(int IDMateria, String Nombre, int AnioMateria, boolean Activo) {
        this.IDMateria = IDMateria;
        this.Nombre = Nombre;
        this.AnioMateria = AnioMateria;
        this.Activo = Activo;
    }

    public Materias(String Nombre, int AnioMateria, boolean Activo) {
        this.Nombre = Nombre;
        this.AnioMateria = AnioMateria;
        this.Activo = Activo;
    }

    public int getIDMateria() {
        return IDMateria;
    }

    public void setIDMateria(int IDMateria) {
        this.IDMateria = IDMateria;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getAnioMateria() {
        return AnioMateria;
    }

    public void setAnioMateria(int AnioMateria) {
        this.AnioMateria = AnioMateria;
    }

    public boolean isActivo() {
        return Activo;
    }

    public void setActivo(boolean Activo) {
        this.Activo = Activo;
    }

    @Override
    public String toString() {
        return "Materias{" + "IDMateria=" + IDMateria + ", Nombre=" + Nombre + ", AnioMateria=" + AnioMateria + '}';
    }

    
    
    
}
