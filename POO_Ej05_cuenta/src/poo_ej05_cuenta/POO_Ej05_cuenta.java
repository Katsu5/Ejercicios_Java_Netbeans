package poo_ej05_cuenta;

import Servicios.CuentaServicios;

public class POO_Ej05_cuenta {

    public static void main(String[] args) {
        CuentaServicios myService = new CuentaServicios();
        myService.pedirDatos();
        myService.ingreso();
        myService.consultarSaldo();
        myService.retirar();
        myService.consultarSaldo();
        myService.extraccionRapida();
        myService.consultarDatos();
    }

}
