
package actividadextra01;

import Entidad.Vehiculo;


public class ActividadExtra01 {

    
    public static void main(String[] args) {
        //Creamos el objeto vehiculo
        Vehiculo automovil = new Vehiculo("Ford", "Explorer", "automovil", 2023);
        automovil.moverse(5);
        System.out.println("La distancia recorrida en 5 seg fue de: " + automovil.getDistancia() + " metros");

        automovil.moverse(10);
        System.out.println("La distancia recorrida en 10 seg fue de: " + automovil.getDistancia() + " metros");

        automovil.moverse(60);
        System.out.println("La distancia recorrida en 60 seg fue de: " + automovil.getDistancia() + " metros");

        automovil.moverse(225);
        automovil.frenar();
        System.out.println("La distancia total recorrida fue de: " + automovil.getDistancia() + " metros");
        
    }
}
