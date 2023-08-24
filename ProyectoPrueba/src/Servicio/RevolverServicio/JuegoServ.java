
package Servicio.RevolverServicio;

import Entidad.Ej02_Guia_RuletaRusa.Juego;
import Entidad.Ej02_Guia_RuletaRusa.Jugador;
import Entidad.Ej02_Guia_RuletaRusa.Revolver;
import java.util.ArrayList;
import java.util.Scanner;

public class JuegoServ {
     Juego juego = new Juego();
    Scanner teclado = new Scanner(System.in);
    
    public void iniciarJuego() {
        ArrayList<Jugador> equipo = new ArrayList();
        Revolver r = new Revolver();
        int valMin = 1;
        int valMax = 6;
        System.out.println("Ingrese numero de jugadores 1/6");
        int numJugador = teclado.nextInt();
        if (numJugador < valMin || numJugador > valMax) numJugador = valMax;
        
        for (int i = 0; i < numJugador; i++) {
            Jugador jugador = new Jugador();
            jugador.setId(i + 1);
            jugador.setNombre("Jugador" + (i + 1));
            equipo.add(jugador);
        }
        //Llenamos el atributo jugadores de la clase Juego
        this.juego.setJugadores(equipo);
        r.llenarRevolver();
        //Llenamos el atrubuto r de la clase Juego
        this.juego.setR(r);
        
        this.juego.ronda();
        
    }
    
}
