package Entidad.Ej02_Guia_RuletaRusa;

import java.util.Random;

public class Revolver {
    private Random numAle;
    private int posicionActual;
    private int posicionAgua;

    public Revolver() {
        this.numAle = new Random(); 
    }

    public Revolver(int posicionActual, int posicionAgua) {
        this.numAle = new Random(); 
        this.posicionActual = posicionActual;
        this.posicionAgua = posicionAgua;
    }

    public int getPosicionActual() {
        return posicionActual;
    }

    public void setPosicionActual(int posicionActual) {
        this.posicionActual = posicionActual;
    }

    public int getPosicionAgua() {
        return posicionAgua;
    }

    public void setPosicionAgua(int posicionAgua) {
        this.posicionAgua = posicionAgua;
    }

    @Override
    public String toString() {
        return "Revolver{" + "posicionActual=" + posicionActual + ", posicionAgua=" + posicionAgua + '}';
    }

    public void llenarRevolver() {
        int pActual = numAle.nextInt(6);
        this.posicionActual = pActual;

        int pAgua = numAle.nextInt(6);
        this.posicionAgua = pAgua;
    }

    public boolean mojar() {
        boolean mojado = false;
        if (this.posicionActual == this.posicionAgua) {
            mojado = true;
        }
        return (mojado);
    }

    public void siguienteChorro() {
        int pActual = numAle.nextInt(6);
        this.posicionActual = pActual;
    }

}
