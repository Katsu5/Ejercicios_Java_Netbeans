
package poo_ej09_matematicas;

import Entidad.Matematicas;
import Servicio.MateServicio;

public class POO_Ej09_Matematicas {

    public static void main(String[] args) {
        //Creamos el objeto operacion y guardamos info en el
        Matematicas operacion = new Matematicas();
        operacion.setNumero1((int)(Math.random()*10));
        operacion.setNumero2((int)(Math.random()*10));
        
        //Aqui creamos el objeto servicio y le agregamos el objeto operacion
        MateServicio mservicio = new MateServicio(operacion);
        mservicio.devolverMayor();
        mservicio.calcularPotencia();
        mservicio.calcularRaiz();
    }
}  
        
    
    

