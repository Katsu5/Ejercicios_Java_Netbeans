/*Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima
el número ingresado seguido de tantos asteriscos como indique su valor. Por 
ejemplo:
5 *****
3 ***
11 ***********
2 ***/

package java_intro_ej01;

import java.util.Scanner;

public class Java_Intro_Ej09_for {

    public static void practicafor() {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese 4 numeros");

        for (int i = 0; i <= 3; i++) {
            int num = leer.nextInt();

            if (num <= 0 && num > 20) {
                System.out.println("Numero invalido. Favor ingrese numero"
                        + " entre 1 y 20");
            } else {
                System.out.print(num + " ");
                for (int j = 1; j <= num; j++) {
                    System.out.print("*");
                }
            }
            System.out.println(" ");
        }
    }

}
