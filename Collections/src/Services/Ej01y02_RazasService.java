package Services;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class Ej01y02_RazasService {

    ArrayList<String> razas = new ArrayList();
    Scanner teclado = new Scanner(System.in);

    public void crearRazas() {
        String opciones;
        do {
            System.out.println("Ingrese raza de perro");
            razas.add(teclado.next());
            System.out.println("Desea agregar otra raza: S/N");
            opciones = teclado.next();
        } while (opciones.equalsIgnoreCase("s"));

        for (String raza : razas) {
            System.out.println(raza);
        }
    }

    public void eliminarRaza() {
        System.out.println("Ingrese raza de perro");
        String nvaRaza = teclado.next();
        boolean bandera = false;
        for (int i = 0; i < razas.size(); i++) {
            String raza = razas.get(i);
            if (raza.equalsIgnoreCase(nvaRaza)) {
                razas.remove(raza);
                bandera = true;
            }
        }
        //!bandera seria lo mismo que digitar bandera==false. Estams negando la variable
        if (!bandera) {
            System.out.println("Raza no existe");
        }
       
    }
    
    public void ordenarLista(){
        Collections.sort(razas);
         for (String x : razas) {
            System.out.println(x);
        }
    
}
}
