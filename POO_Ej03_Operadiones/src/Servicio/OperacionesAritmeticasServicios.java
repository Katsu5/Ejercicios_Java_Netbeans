package Servicio;

import Entidad.OperacionesAritmeticas;
import java.util.Scanner;

public class OperacionesAritmeticasServicios {

    public OperacionesAritmeticas crearOperacion() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese primer número");
        int numero1 = leer.nextInt();
        System.out.println("Ingrese segundo numero");
        int numero2 = leer.nextInt();

        OperacionesAritmeticas op = new OperacionesAritmeticas(numero1, numero2);
        return op;
    }

    public void resultados(OperacionesAritmeticas operador) {
        int resultadoSuma = operador.suma();
        System.out.println("El resultado de la suma es: " + resultadoSuma);
        int resultadoResta = operador.resta();
        System.out.println("El resultado de la resta es: " + resultadoResta);
        int resultadoMultip = operador.multiplicacion();
        if (resultadoMultip == 0) {
            System.out.println("Error. Debe ingresar numeros diferentes de cero");
        } else {
            System.out.println("El resultado de la multiplicacion es: " + resultadoMultip);
        }
        if (operador.getNumero2() == 0) {
            System.out.println("Error. Debe ingresar numeros diferentes de cero");
        } else {
            int resultadoDiv = operador.division();
            System.out.println("El resultado de la división es: " + resultadoDiv);
        }
    }

}
