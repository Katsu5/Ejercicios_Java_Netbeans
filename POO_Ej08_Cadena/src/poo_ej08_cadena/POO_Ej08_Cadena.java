
package poo_ej08_cadena;

import Entidad.Cadena;
import Servicio.CadenaServicio;
import java.util.Scanner;

public class POO_Ej08_Cadena {

    public static void main(String[] args) {
        Cadena mfrase = new Cadena();
        CadenaServicio cServicio = new CadenaServicio();
            
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese palabra o frase por favor");
        mfrase.setFrase(leer.nextLine());
        //Obtengo la frase
        cServicio.setFrase(mfrase);
        
        //Muestro cuantas vocales tiene
        cServicio.mostrarVocales();
        
        //Invierto el orden de la frase
        cServicio.invertirFrase();
        
        //Pido una letra para determinar cuantas veces se repite
        System.out.println("Ingrese un caracter");
        String letra = leer.next();
        cServicio.vecesRepetido(letra);
        
         //Pido uns frase para concatenarlas
        System.out.println("Ingreses la nueva frase a concatenar");
        String oFrase = leer.next();
        cServicio.unirFrases(oFrase);
        
        //Le pedimos al usuario la letra que vamos a reemplazar
        System.out.println("Ingrese el nuevo caracter");
        String pletra = leer.next();
        cServicio.reemplazar(pletra);

          //Le pedimos al usuario la letra a ver si la frase la contiene
          System.out.println("Ingrese el nuevo caracter");
          String qletra = leer.next();
          boolean contiene = cServicio.contiene(qletra);
    }
    
    
}
    
    
    

