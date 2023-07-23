
package poo_ej02_circunferencia;

import Servicio.CircunServicios;
import Entidad.Circunferencia;


public class POO_Ej02_circunferencia {

    public static void main(String[] args) {
        CircunServicios servicio = new CircunServicios();
        
        Circunferencia radio = servicio.crearCircunferencia();
        
        servicio.resultados(radio);
    }
    
}
