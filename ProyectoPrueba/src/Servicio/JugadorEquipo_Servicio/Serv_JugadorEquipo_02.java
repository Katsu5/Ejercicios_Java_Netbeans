
package Servicio.JugadorEquipo_Servicio;

import Entidad.Ej_02_EquipoJugador.Equipo_02;
import Entidad.Ej_02_EquipoJugador.Jugador_02;
import java.util.ArrayList;
import java.util.Scanner;

public class Serv_JugadorEquipo_02 {
    ArrayList<Jugador_02> jugadores = new ArrayList();
    Scanner teclado = new Scanner(System.in).useDelimiter("\n");
    String opcion;
    
    public void pedirDatosJugador(){
        do {
        Jugador_02 jugador = new Jugador_02();
        System.out.println("Ingrese nombre del jugador");
        jugador.setNombre(teclado.next());
        System.out.println("Ingrese apellido del jugador");
        jugador.setApellido( teclado.next());
        System.out.println("Ingrese posicion del jugador");
        jugador.setPosicion( teclado.next());
        System.out.println("Ingrese numero del jugador");
        jugador.setNumero(teclado.nextInt());
        this.jugadores.add(jugador);
        System.out.println("Desea ingresar un nuevo jugador S/N");
        opcion = teclado.next();
        }while(opcion.equalsIgnoreCase("s"));
        
    }
    
    public void mostrarEquipo(){
        System.out.println("***********Equipo***********");
        for (Jugador_02 equipo : jugadores) {
            System.out.println(equipo);
        }
        System.out.println("");
    }
    
}      
