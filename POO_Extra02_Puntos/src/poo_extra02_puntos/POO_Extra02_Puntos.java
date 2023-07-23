
package poo_extra02_puntos;

import Entidad.Puntos;
import Servicios.PuntosServicio;


public class POO_Extra02_Puntos {

    public static void main(String[] args) {
        PuntosServicio pServicios = new PuntosServicio();
        Puntos puntos = pServicios.crearPuntos();
        pServicios.calcularDistancia(puntos);
    }
}
