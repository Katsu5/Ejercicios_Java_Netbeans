
package Servicio;

import Entidad.Circunferencia;
import java.util.Scanner;

public class CircunServicios {
    
    public Circunferencia crearCircunferencia(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el radio por favor");
        double radio = leer.nextDouble();
        
        Circunferencia rad = new Circunferencia(radio);
        return rad;
    }
    
    public void resultados(Circunferencia radio) {
        double calculoRadio = radio.area();
        double calculoPerimetro = radio.perimetro();
        System.out.println("El radio es: " + calculoRadio);
        System.out.println("El perimetro es: " + calculoPerimetro);

    }
}
