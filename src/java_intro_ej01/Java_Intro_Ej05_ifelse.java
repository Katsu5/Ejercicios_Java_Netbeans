/*Implementar un programa que le pida dos números enteros a usuario y determine si ambos o
alguno de ellos es mayor a 25.*/

package java_intro_ej01;
import java.util.Scanner;

public class Java_Intro_Ej05_ifelse {
    public static void practicaIfElse() {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese 2 numero");
        int numero1 = leer.nextInt();
        int numero2 = leer.nextInt();
        
        if (numero1 >25 || numero2 > 25 ){
            System.out.println(" Al menos un numero es mayor que 25");
        }else{
            System.out.println("Ningun numero es mayor de 25");
        }
             
    }
}
