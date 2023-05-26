
package java_intro_ej01;

import java.util.Scanner;

public class Java_Intro_Ej06 {
    public static void practicaSwitch() {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un valor entre 1 y 4 para seleccionar"
        + " el tipo de motor");
        int tipoMotor = leer.nextInt();
        
        switch (tipoMotor) {
            case 1:
                System.out.println("Es una bomba de agua");
                break;
            case 2:
                System.out.println("Es una bomba de gasolina");
                break;
            case 3:
                System.out.println("Es una bomba de hormigon");
                break;
            case 4:
                System.out.println("Es una bomba de pasta alimenticia");
                break;
            default:
               System.out.println("La opcion ingresada es incorrecta");
        }
    }
}
