
package java_intro_ej01;
import java.util.Scanner;
public class Java_Intro_Ej04_scanner {
    public static void ingresoXteclado(){
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa la inicial de tu nombre");
        char letra = leer.next().charAt(0);
       
        boolean mujer = true;
        
        System.out.println("Ingresa tu peso");
        double peso = leer.nextDouble();
        
       
                
        System.out.println("Tu nombre inicia con: " + letra + " sexo: Mujer " + mujer
            + " y pesas " + peso + " gramos");
    }
}
        
    
  