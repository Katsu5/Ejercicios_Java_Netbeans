
package Entities;

public class Ej04_Pelicula {
        private String titulo;
        private String director;
        private double duracionPeli;

    public Ej04_Pelicula() {
    }

    public Ej04_Pelicula(String titulo, String director, double duracionPeli) {
        this.titulo = titulo;
        this.director = director;
        this.duracionPeli = duracionPeli;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public double getDuracionPeli() {
        return duracionPeli;
    }

    public void setDuracionPeli(double duracionPeli) {
        this.duracionPeli = duracionPeli;
    }

    @Override
    public String toString() {
        return this.titulo + " " + this.director + " " + this.duracionPeli;
    }
        
        
}
