
package java_intro_ej01;

import java.util.Scanner;

public class Java_Intro_Ej03 {
    public static void pedirXpantalla2(){
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese su nombre por favor");
        String nombre = leer.nextLine();
        
        System.out.println("Ingrese su edad: ");
        int edad = leer.nextInt();
        
        System.out.println("Su nombre es: " + nombre + " y tienes: " + edad);
        
        
    }
}
