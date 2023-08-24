
package Entidad.Ej_01_CursoProfesor;

public class Curso_01 {
    private int anio;
    private char division;
    private Profesor_01 persona;

    public Curso_01(int anio, char division, Profesor_01 persona) {
        this.anio = anio;
        this.division = division;
        this.persona = persona;
    }

    public Curso_01() {
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public char getDivision() {
        return division;
    }

    public void setDivision(char division) {
        this.division = division;
    }

    public Profesor_01 getPersona() {
        return persona;
    }

    public void setPersona(Profesor_01 persona) {
        this.persona = persona;
    }

    @Override
    public String toString() {
        return "Curso{" + "anio=" + anio + ", division=" + division + ", persona=" + persona + '}';
    }


}


