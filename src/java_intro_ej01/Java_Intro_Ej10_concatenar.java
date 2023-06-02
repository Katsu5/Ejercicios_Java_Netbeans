package java_intro_ej01;

import java.util.Scanner;
//import java.util.stream.DoubleStream;
//import javax.imageio.ImageIO;

public class Java_Intro_Ej10_concatenar {

    public static void practicafunciones() {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese una frase terminada en punto");
        String frase = leer.nextLine();
        //Aqui hicimos en reemplazo de las letras con metodos
        //String newfrase = frase.replace('a', '@').replace('e', '#').replace('i', '$').replace('o', '%').replace('u', '*');
        //System.out.println(newfrase);
        reemplazamosVocales(frase);
    }

    public static void reemplazamosVocales(String frase) {
        // Aca lo hacemos a traves de un switch y concatenando el resultado
        String fraseFinal = "";
        for (int i = 0; i <= frase.length(); i++) {
            String letra = "";
            if (i < frase.length()) {
                letra = frase.substring(i, i + 1);
            }
            //System.out.println(letra);

            switch (letra.toUpperCase()) {
                case "A":
                    letra = "@";
                    break;
                case "E":
                    letra = "#";
                    break;
                case "I":
                    letra = "$";
                    break;
                case "O":
                    letra = "%";
                    break;
                case "U":
                    letra = "*";
                    break;
            }
            fraseFinal = fraseFinal.concat(letra);
        }
        System.out.println(fraseFinal);
    }
}
