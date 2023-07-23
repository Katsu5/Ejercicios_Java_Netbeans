
package Entidades;

public class Rutina {
    private int id;
    private String nombre, nivelDificultad, descripcion;
    private double duracion;
    
    public Rutina(){
        
    }

    public Rutina(int id, String nombre, String nivelDificultad, String descripcion, double duracion) {
        this.id = id;
        this.nombre = nombre;
        this.nivelDificultad = nivelDificultad;
        this.descripcion = descripcion;
        this.duracion = duracion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNivelDificultad() {
        return nivelDificultad;
    }

    public void setNivelDificultad(String nivelDificultad) {
        this.nivelDificultad = nivelDificultad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }
    
    
}
