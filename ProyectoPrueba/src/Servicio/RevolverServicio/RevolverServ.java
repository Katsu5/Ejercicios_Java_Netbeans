
package Servicio.RevolverServicio;

import Entidad.Ej02_Guia_RuletaRusa.Revolver;
import java.util.Random;

public class RevolverServ {
    Revolver revolver = new Revolver();
    
     
    
    
    
    
    
    
    public void mostrarInfo(){
        System.out.println("**Informacion del Revolver**");
        System.out.println("Posicion actual: " + this.revolver.getPosicionActual());
        System.out.println("Posicion del agua: " + this.revolver.getPosicionAgua());
    }
    
}
