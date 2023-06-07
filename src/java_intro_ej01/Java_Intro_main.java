/*Creo un menu con los ejercicios del paquete Java intro y copio la funcion con
la cual ejecutar cada uno de ellos.
*/
package java_intro_ej01;
//import Extras.Extra_01;

import Guia_Aprendizaje.Aprendizaje_mainAprende;
import java.util.Scanner;

public class Java_Intro_main {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Selecciona una opción: ");
        showMenus();
        int option = leer.nextInt();
        
        switch (option) {
            case 1 -> Java_Intro_mainIntro.mainIntro();
            case 2 -> Aprendizaje_mainAprende.mainAprendizaje();
            default -> System.out.println("Opción invalida");
        }
    }
    
    public static void showMenus() {
        System.out.println("1. Ejercicios de Introducción a Java");
        System.out.println("2. Ejercicios Prácticos de Aprendizaje");
        System.out.println("3. Ejercicios de Aprendizaje Extras");

   }
}
