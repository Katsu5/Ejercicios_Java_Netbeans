/*Crea un procedimiento EsMultiplo que reciba los dos números pasados por el
usuario, validando que el primer numero múltiplo del segundo y e imprima si el
primer numero es múltiplo del segundo, sino informe que no lo son.*/

package java_intro_ej01;

import java.util.Scanner;

public class Java_Intro_Ej11_procedimiento {

    public static void practicaProcedimiento() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int numero1 = leer.nextInt();
        System.out.println("Ingrese un numero");
        int numero2 = leer.nextInt();
        EsMultiplo(numero1,numero2);
    }

    public static void EsMultiplo(int numero1, int numero2) {
        if (numero1 % numero2 == 0) {
            System.out.println(numero1 + " Es multiplo de " + numero2);
        }else{
            System.out.println(numero1 + " No es multiplo de " + numero2);
        }
        
    }
}
