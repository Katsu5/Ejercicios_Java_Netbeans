/*Define una variable que aloje tu nombre y otra que guarde tu edad. Imprime ambas variables
por pantalla.*/

package java_intro_ej01;

import java.util.Scanner;

public class Java_Intro_Ej03_scanner2 {
    public static void pedirXpantalla2(){
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese su nombre por favor");
        String nombre = leer.nextLine();
        
        System.out.println("Ingrese su edad: ");
        int edad = leer.nextInt();
        
        System.out.println("Su nombre es: " + nombre + " y tienes: " + edad);
        
    }
}
