
package poo_ej04_rectangulo;

import EntidadRectangulo.Rectangulo;
import Servicio.servicioRectangulo;

public class POO_Ej04_rectangulo {

    public static void main(String[] args) {
        
        servicioRectangulo servicio = new servicioRectangulo();
        
        Rectangulo rectan = servicio.cargarRectangulo();
        
        servicio.superficie(rectan);
        
        servicio.pintarRectangulo(rectan);
        
        
        
    }
    
}
