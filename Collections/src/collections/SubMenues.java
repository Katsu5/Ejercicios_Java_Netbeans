package collections;

import Services.Ej01y02_RazasService;
import Services.Ej03_AlumnosService;
import Services.Ej04_PeliculaServ;
import Services.Ej05_PaisesServ;
import Services.Ej06_TiendaServ;
import java.util.Scanner;

public class SubMenues {

    public void showMenu() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el ejercicio que desea ejecutar: ");
        int opcion = teclado.nextInt();

        switch (opcion) {
            case 1 -> {
                Ej01y02_RazasService raza = new Ej01y02_RazasService();
                raza.crearRazas();
                raza.eliminarRaza();
                raza.ordenarLista();
            }
            case 3 -> {
                Ej03_AlumnosService alumnoServ = new Ej03_AlumnosService();
                alumnoServ.crearAlunmos();
                alumnoServ.notaFinal();
            }
            case 4 -> {
                Ej04_PeliculaServ peliServ = new Ej04_PeliculaServ();
                peliServ.crearPeliculas();
                peliServ.mostrarPeliculas();
                peliServ.mostrarPeliculas60Mins();
                peliServ.ordenarPeliXDuracionDesc();
                peliServ.ordenarPeliXDuracionAsc();
                peliServ.ordenarPeliXTituloAlf();
                peliServ.ordenarPeliXDirectorAlf();
            }
            case 5 -> {
                Ej05_PaisesServ paisesServ = new Ej05_PaisesServ();
                paisesServ.crearPaises();
                paisesServ.mostrarPaises();
                paisesServ.compararPaisesYElimina();
                paisesServ.comparaPaisYDevuelveLista();
            }
            case 6 -> {
                Ej06_TiendaServ productoServ = new Ej06_TiendaServ();
                productoServ.crearProductos();
                productoServ.modificarProducto();
                //productoServ.eliminarProducto();
                productoServ.mostrarProductos();
            }
            default ->
                System.out.println("opcion Invalida");
        }
        System.out.flush();
    }
}
