
package Principal;

import Servicio.AdoptarPerro_Servicio.Serv_AdoptarPerro_Ej01Guia;
import Servicio.JugadorEquipo_Servicio.Serv_JugadorEquipo_02;
import Servicio.CursoProfesor_Servicio.Servicios_CursoProfesor_01;
import Servicio.RevolverServicio.JuegoServ;
import java.util.Scanner;

public class SubMenu {
    
    public void showMenu() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Selecciona una opción: ");
        showMenuJavaIntro();
        int option = leer.nextInt();

        switch (option) {
            case 1 -> {
                Servicios_CursoProfesor_01 curso = new Servicios_CursoProfesor_01();
                curso.llenarYMostrarDatos();
            }
            case 2 -> {
                Serv_JugadorEquipo_02 equipo = new Serv_JugadorEquipo_02();
                equipo.pedirDatosJugador();
                equipo.mostrarEquipo();
            }
            case 3 -> {
                Serv_AdoptarPerro_Ej01Guia duenio = new Serv_AdoptarPerro_Ej01Guia();
                duenio.crearPerros();
                duenio.crearPersona();
                duenio.mostrarPersonas();
            }
            case 4 -> {
             JuegoServ juego1 = new JuegoServ();
             juego1.iniciarJuego();
            }
            default -> System.out.println("Opción invalida");
        }

    }

    public static void showMenuJavaIntro() {
        System.out.println("1. Ejercicio 1 - Manos a la obra");
        System.out.println("2. Ejercicio 2 - Manos a la obra");
        System.out.println("3. Ejercicio 1 - Guia de aprendizaje");
        System.out.println("4. Ejercicio 2 - Guia de aprendizaje");


    }

}
