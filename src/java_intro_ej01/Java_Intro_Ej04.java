
package java_intro_ej01;
import java.util.Scanner;
public class Java_Intro_Ej04 {
    public static void metodo4(){
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingresa tu nombre");
        String nombre = leer.nextLine();

        System.out.println("Ingresa tu edad");
        int edad = leer.nextInt();
        
        System.out.println(nombre + " " + edad);
    }
}
        
    
  