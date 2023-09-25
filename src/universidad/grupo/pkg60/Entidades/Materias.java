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
    private String Materia;
    private int AnioMateria;
    private boolean Activo;
    public String getNombre;

    public Materias() {
    }

    public Materias(int IDMateria, String Materia, int AnioMateria, boolean Activo) {
        this.IDMateria = IDMateria;
        this.Materia = Materia;
        this.AnioMateria = AnioMateria;
        this.Activo = Activo;
    }

    public Materias(String Materia, int AnioMateria, boolean Activo) {
        this.Materia =Materia;
        this.AnioMateria = AnioMateria;
        this.Activo = Activo;
    }

    public int getIDMateria() {
        return IDMateria;
    }

    public void setIDMateria(int IDMateria) {
        this.IDMateria = IDMateria;
    }

    public String getMateria() {
        return Materia;
    }

    public void setMateria(String Materia) {
        this.Materia = Materia;
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
        return "Materias{" + "IDMateria=" + IDMateria + ", Nombre=" + Materia + ", AnioMateria=" + AnioMateria + '}';
    }

    /*public String getMateria() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    */
    
    
}
