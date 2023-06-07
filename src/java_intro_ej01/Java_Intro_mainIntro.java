package java_intro_ej01;

import java.util.Scanner;

public class Java_Intro_mainIntro {

    public static void mainIntro() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Selecciona una opción: ");
        showMenuJavaIntro();
        int option = leer.nextInt();

        switch (option) {
            case 1 -> System.out.println("Hola mundo loco");
            case 2 -> Java_Intro_Ej02_inicializarVar.asignarDatos();
            case 3 -> Java_Intro_Ej03_scanner2.pedirXpantalla2();
            case 4 -> Java_Intro_Ej04_scanner.ingresoXteclado();
            case 5 -> Java_Intro_Ej05_ifelse.practicaIfElse();
            case 6 -> Java_Intro_Ej06_switch.practicaSwitch();
            case 7 -> Java_Intro_Ej07_while.practicaWhile();
            case 8 -> Java_Intro_Ej08_dowhile.practicaDowhibrake();
            case 9 -> Java_Intro_Ej09_for.practicafor();
            case 10 -> Java_Intro_Ej10_concatenar.practicafunciones();
            case 11 -> Java_Intro_Ej11_procedimiento.practicaProcedimiento();
            //ejercicio 12 con dos funciones
            case 12 -> Java_Intro_Ej12_vectores.practicaFor();
            default -> System.out.println("Opción invalida");
        }

    }

    public static void showMenuJavaIntro() {
        System.out.println("1. Ejercicio 1");
        System.out.println("2. Ejercicio 2");
        System.out.println("3. Ejercicio 3");
        System.out.println("4. Ejercicio 4");
        System.out.println("5. Ejercicio 5");
        System.out.println("6. Ejercicio 6");
        System.out.println("7. Ejercicio 7");
        System.out.println("8. Ejercicio 8");
        System.out.println("9. Ejercicio 9");
        System.out.println("10. Ejercicio 10");
        System.out.println("11. Ejercicio 11");
        System.out.println("12. Ejercicio 12");

    }
}
