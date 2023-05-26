package java_intro_ej01;

import java.util.Scanner;

public class Java_Intro_Ej07_while {

    public static void practicaWhile() {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese su nota por favor");
        int nota = leer.nextInt();

        while (nota < 0 || nota > 10) {
            System.out.println("Valor invalido; La nota debe estar entre"
                    + " 0 y 10");
            nota = leer.nextInt();
        }
    }
}
