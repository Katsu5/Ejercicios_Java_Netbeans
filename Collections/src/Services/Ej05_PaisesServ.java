package Services;

import java.util.Scanner;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Ej05_PaisesServ {

    TreeSet<String> paises = new TreeSet();
    Scanner teclado = new Scanner(System.in).useDelimiter("\n");
    String respuesta;

    public void crearPaises() {
        do {
            System.out.println("Ingrese nombre del pais");
            paises.add(teclado.next());
            System.out.println("Desea ingresar una nueva pelicula? S/N");
            respuesta = teclado.next();
        } while (respuesta.equalsIgnoreCase("s"));
    }

    public void mostrarPaises() {
        System.out.println("***********Paises************");
        this.paises.forEach(System.out::println);
    }

    public void compararPaisesYElimina() {
        System.out.println("Ingrese el pais que desea buscar");
        String paisABuscar = teclado.next();
        var paisesFiltrados = this.paises.stream()
                .filter(item -> item.equalsIgnoreCase(paisABuscar))
                .findFirst();
        if (paisesFiltrados.isPresent()) {
            this.paises.removeIf(item -> item.equalsIgnoreCase(paisesFiltrados.get()));
        } else {
            System.out.println("No se encontro su busqueda");
        }
        this.mostrarPaises();
        
    }
    
    public void comparaPaisYDevuelveLista(){
        System.out.println("Ingrese el pais que desea buscar");
        String paisABuscar = teclado.next();
         var paisesFiltrados = this.paises.stream()
               .filter(item -> item.equalsIgnoreCase(paisABuscar))
               .collect(Collectors.toList());
         System.out.println(paisesFiltrados);
    }
}
