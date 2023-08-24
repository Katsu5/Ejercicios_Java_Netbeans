
package Entidad.Ej_02_EquipoJugador;

import java.util.List;


public class Equipo_02 {
    private List<Jugador_02> jugadores;

    public Equipo_02() {
    }

    public Equipo_02(List<Jugador_02> jugadores) {
        this.jugadores = jugadores;
    }
    
    public List<Jugador_02> jugadores() {
        return jugadores;
    }

    public void setJugadores(List<Jugador_02> jugadores) {
        this.jugadores = jugadores;
    }

    @Override
    public String toString() {
        return "Equipo_02{" + "jugadores=" + jugadores + '}';
    }

    
    
    
}
