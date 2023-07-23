
package poo_ej06_cafetera;

import Servicio.CafeteraServicio;

public class POO_Ej06_Cafetera {
  
    public static void main(String[] args) {
        
        CafeteraServicio servicio = new CafeteraServicio();
        servicio.llenarCafetera();
        servicio.servirTaza();
        servicio.vaciarCafetera();
        servicio.agregarCafe();
        
    }
    
}
