
package Entidades;

public class Peliculas {
    private String titulo, genero;
    private int año;
    private double duracion;

    public Peliculas() {
    }

    public Peliculas(String titulo, String genero, int año, double duracion) {
        this.titulo = titulo;
        this.genero = genero;
        this.año = año;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }
    
    
    
}
