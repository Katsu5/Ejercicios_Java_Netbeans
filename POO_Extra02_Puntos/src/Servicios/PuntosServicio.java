
package Servicios;

import Entidad.Puntos;
import java.util.Scanner;

public class PuntosServicio {
    
    public Puntos crearPuntos(){
        Scanner leer = new Scanner(System.in);
        Puntos puntos = new Puntos();
        System.out.println("Ingrese coordenadas primer punto (X1)");
        puntos.setX1(leer.nextFloat());
        System.out.println("Ingrese coordenadas primer punto (Y1)");
        puntos.setY2(leer.nextFloat());
        System.out.println("Ingrese coordenadas primer punto (X2)");
        puntos.setX2(leer.nextFloat());
        System.out.println("Ingrese coordenadas primer punto (Y2)");
        puntos.setY2(leer.nextFloat());
        return puntos;
    }
    
    public void calcularDistancia(Puntos puntos){
        System.out.println("La distancia es: " + Math.sqrt(Math.pow(puntos.getX2() - puntos.getX1(),2)+ Math.pow(puntos.getY2() - puntos.getY1(),2)));
    }
}
