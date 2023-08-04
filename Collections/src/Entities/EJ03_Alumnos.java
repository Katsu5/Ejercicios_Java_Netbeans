
package Entities;

import java.util.ArrayList;

public class EJ03_Alumnos {
    private String nombre;
    private ArrayList<Double> notas;

    public EJ03_Alumnos(String nombre, ArrayList<Double> notas) {
        this.nombre = nombre;
        this.notas = notas;
    }

    public EJ03_Alumnos() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Double> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Double> notas) {
        this.notas = notas;
    }

    @Override
    public String toString() {
        return this.nombre;
    }
    
       
}
