package Servicio;

import Entidad.Cafetera;
import java.util.Scanner;

public class CafeteraServicio {

    private Cafetera cafe;

    public void llenarCafetera() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese capacidad max de la cafetera por favor");
        int cMax = leer.nextInt();
        int cActual = cMax;
        this.cafe = new Cafetera(cMax, cActual);
    }

    public void servirTaza() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño de la taza");
        int tamañoTaza = leer.nextInt();
        int cantidadActual = this.cafe.getCantActual();
        if (cantidadActual > tamañoTaza) {
            cantidadActual -= tamañoTaza;
        }else{
            System.out.println("Lo sentimos. No se llenó su taza de café pero "
            + " quedó en " + cantidadActual + " cc.");
        }
        this.cafe.setCantActual(cantidadActual);
    }

    public void vaciarCafetera() {
        this.cafe.setCantActual(0);
        System.out.println("Cantidad de café: " + this.cafe.getCantActual() + " cc.");
    }

    public void agregarCafe() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese cantidad de café");
        int cantidadCafe = leer.nextInt();
        this.cafe.setCantActual(this.cafe.getCantActual() + cantidadCafe);
        System.out.println("La nueva cantidad de cafe: " + this.cafe.getCantActual() + " cc.");

    }

}
