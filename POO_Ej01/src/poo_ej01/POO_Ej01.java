package poo_ej01;

import Entidad.Libro;
import Servicio.LibroService;


public class POO_Ej01 {

    public static void main(String[] args) {
        
        LibroService servicio = new LibroService();
        
        Libro libro = servicio.cargarLibro();
        
       servicio.mostrarLibro(libro);
        
    }

}
