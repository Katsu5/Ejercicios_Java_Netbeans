
package Extras;

import java.util.Scanner;


public class Extra_02 {
    public static void cuandoUsarMetodoWhilIgnor(){
        Scanner leer = new Scanner(System.in);
        
        
        System.out.println("Ingrese su respuesta");
        String respuesta = leer.nextLine();
        
        while (respuesta.equalsIgnoreCase("S")){
            System.out.println("Desea continuar?");
            respuesta = leer.nextLine();
        }
    }
}
