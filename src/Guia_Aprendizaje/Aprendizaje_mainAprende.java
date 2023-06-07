package Guia_Aprendizaje;

import java.util.Scanner;

public class Aprendizaje_mainAprende {

    public static void mainAprendizaje() {
        Scanner leer = new Scanner(System.in);

        System.out.println("Selecciona una opción: ");
        showMenuAprendizaje();
        int option = leer.nextInt();

        switch (option) {
            case 1 -> Aprendizaje_Ej01_sumadeEnteros.sumaEnteros();
        }
    }
    
    public static void showMenuAprendizaje() {
        System.out.println("1. Ejercicio 1");
    }
}
