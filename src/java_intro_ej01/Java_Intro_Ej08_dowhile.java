/*Escriba un programa que lea 20 números. Si el número leído es igual a cero se
debe salir delvbucle y mostrar el mensaje "Se capturó el numero cero". El 
programa deberá calcular y mostrar el resultado de la suma de los números leídos
pero si el número es negativo no debe sumarse. Nota: recordar el uso de la 
sentencia break.*/

package java_intro_ej01;

import java.util.Scanner;

public class Java_Intro_Ej08_dowhile {

    public static void practicaDowhibrake() {
        Scanner leer = new Scanner(System.in);
        int contador = 0;
        int sumaNum = 0;

        do {
            System.out.println("Ingrese un numero");
            int num = leer.nextInt();
            contador += 1;
            sumaNum= sumaNum+num;
            if (num == 0) {
                System.out.println("Se capturo el numero cero");
                break;
            }
        } while (contador < 20);
        
        System.out.println("La suma de los numeros es: " + sumaNum);

    }
}
