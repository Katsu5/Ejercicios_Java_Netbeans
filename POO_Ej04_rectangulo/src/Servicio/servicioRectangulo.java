package Servicio;

import EntidadRectangulo.Rectangulo;
import java.util.Scanner;

public class servicioRectangulo {

    public Rectangulo cargarRectangulo() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese base del rectangulo");
        double base = leer.nextDouble();
        System.out.println("Ingrese altura del rectangulo");
        double altura = leer.nextDouble();

        Rectangulo rec = new Rectangulo(base, altura);
        return rec;
    }

    public void superficie(Rectangulo sRectangulo) {
        double calculoSuperficie = sRectangulo.superficie();
        double calculoPerimetro = sRectangulo.perimetro();
        System.out.println("La superficie es: " + calculoSuperficie);
        System.out.println("El perimetro es: " + calculoPerimetro);
    }

    public void pintarRectangulo(Rectangulo prRectangulo) {        
        for (int i = 0; i < prRectangulo.getBase() ; i++) {
            for (int j = 0; j < prRectangulo.getAltura(); j++) {
                if (i== 0 || i == prRectangulo.getBase()-1 || j == 0 || j == prRectangulo.getAltura()-1 ) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
        System.out.println(" ");
    }
}
