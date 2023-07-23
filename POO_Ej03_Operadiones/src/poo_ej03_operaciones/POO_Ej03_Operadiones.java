
package poo_ej03_operaciones;

import Entidad.OperacionesAritmeticas;
import Servicio.OperacionesAritmeticasServicios;

public class POO_Ej03_Operadiones {

    public static void main(String[] args) {
        OperacionesAritmeticasServicios servicio = new OperacionesAritmeticasServicios();
        
        OperacionesAritmeticas operaciones = servicio.crearOperacion();

        servicio.resultados(operaciones);
    }
}
