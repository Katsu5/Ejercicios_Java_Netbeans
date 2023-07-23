
package Servicio;

import Entidad.Libro;
import java.util.Scanner;

public class LibroService {

    public Libro cargarLibro(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el ISBN del libro");
        String ISBN = leer.nextLine();
        System.out.println("Ingrese el titulo del libro");
        String titulo = leer.nextLine();
        System.out.println("Ingrese el autor del libro");
        String autor = leer.nextLine();
        System.out.println("Ingrese el numero de paginas del libro");
        int numPaginas = leer.nextInt();
        
        
        return new Libro(ISBN, titulo, autor, numPaginas);
    }
    
    
    public void mostrarLibro(Libro libro){
        System.out.println("ISBN: " + libro.getISBN());
        System.out.println("Titulo: " + libro.getTitulo());
        System.out.println("Autor: " + libro.getAutor());
        System.out.println("Num Paginas: " + libro.getNumeropaginas());

    }    
        
    
}
 