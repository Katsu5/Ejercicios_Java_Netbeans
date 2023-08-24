
package Entidad.Ej02_Guia_RuletaRusa;

import java.util.ArrayList;

public class Juego {
    private ArrayList<Jugador> jugadores = new ArrayList();
    private Revolver r;

    public Juego() {
    }

    public Juego(Revolver r) {
        this.r = r;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public Revolver getR() {
        return r;
    }

    public void setR(Revolver r) {
        this.r = r;
    }

    @Override
    public String toString() {
        return "Juego{" + "jugadores=" + jugadores + ", r=" + r + '}';
    }
    
    public void llenarJuego(ArrayList<Jugador> jugadores, Revolver r){
        this.jugadores = jugadores;
        this.r = r;
    }
    
    public void ronda(){
        for (Jugador jugador: jugadores){
            if (jugador.disparo(r)){
                System.out.println("El jugador mojado es: " + jugador);
                break;
            }
            System.out.println(jugador);
        }
    }
            
}
