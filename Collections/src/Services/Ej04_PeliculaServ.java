package Services;

import Entities.Ej04_Pelicula;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.util.Comparator;

public class Ej04_PeliculaServ {

    ArrayList<Ej04_Pelicula> Peliculas = new ArrayList();
    Scanner teclado = new Scanner(System.in).useDelimiter("\n");
    String respuesta;

    public void crearPeliculas() {
        do {
            Ej04_Pelicula pelicula = new Ej04_Pelicula();
            System.out.println("Ingrese nombre de pelicula por favor");
            pelicula.setTitulo(teclado.next());
            System.out.println("Ingrese director de la pelicula");
            pelicula.setDirector(teclado.next());
            System.out.println("Ingrese duracion de la pelicula en horas ");
            pelicula.setDuracionPeli(teclado.nextDouble());
            //Creamos el objeto Alumno y guardamos los datos
            this.Peliculas.add(pelicula);
            System.out.println("Desea ingresar una nueva pelicula? S/N");
            respuesta = teclado.next();
        } while (respuesta.equalsIgnoreCase("s"));
    }

    public void mostrarPeliculas() {
        System.out.println("***********Peliculas************");
        for (Ej04_Pelicula pelicula : Peliculas) {
            System.out.println(pelicula);
        }
        System.out.println("");
    }

    public void mostrarPeliculas60Mins() {
        System.err.println("***********Peliculas mayores de 60 mins************");
        for (Ej04_Pelicula pelicula : Peliculas) {
            if (pelicula.getDuracionPeli() > 60) {
                System.out.println(pelicula);
            }
        }
        System.out.println("");
    }

    public void ordenarPeliXDuracionDesc() {
        System.out.println("***********Peliculas orenadas por duracion Desc************");
        Collections.sort(Peliculas, Comparator.comparingDouble(Ej04_Pelicula::getDuracionPeli).reversed());

        this.mostrarPeliculas();
        System.out.println("");
    }
    
     public void ordenarPeliXDuracionAsc() {
        System.out.println("***********Peliculas orenadas por duracion Asc************");
        Collections.sort(Peliculas, Comparator.comparingDouble(Ej04_Pelicula::getDuracionPeli));

        this.mostrarPeliculas();
        System.out.println("");
    }
     
     public void ordenarPeliXTituloAlf() {
        System.out.println("***********Peliculas orenadas por titulo alfabeticamente************");
        Collections.sort(Peliculas, Comparator.comparing(Ej04_Pelicula::getTitulo));

        this.mostrarPeliculas();
        System.out.println("");
    }
     
     public void ordenarPeliXDirectorAlf() {
        System.out.println("***********Peliculas orenadas por director alfabeticamente************");
        Collections.sort(Peliculas, Comparator.comparing(Ej04_Pelicula::getDirector));

        this.mostrarPeliculas();
        System.out.println("");
    }
}
