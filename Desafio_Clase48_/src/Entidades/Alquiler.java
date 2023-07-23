
package Entidades;

import java.util.Date;


public class Alquiler {
    private Date fechaInicio, fechaFin;
    private Peliculas peliculas;
    private double precio;

    public Alquiler() {
    }

    public Alquiler(Date fechaInicio, Date fechaFin, Peliculas peliculas, double precio) {
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.peliculas = peliculas;
        this.precio = precio;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Peliculas getPeliculas() {
        return peliculas;
    }

    public void setPeliculas(Peliculas peliculas) {
        this.peliculas = peliculas;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
    
}
