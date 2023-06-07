/*Escribir un programa que procese una secuencia de caracteres ingresada por
teclado y terminada en punto, y luego codifique la palabra o frase ingresada de
la siguiente manera: cada vocal se reemplaza por el carácter que se indica en la
tabla y el resto de los caracteres (incluyendo a las vocales acentuadas) se
mantienen sin cambios.
a e i o u
@ # $ % *
Realice un subprograma que reciba una secuencia de caracteres y retorne la
codificación correspondiente. Utilice la estructura “según” para la transformación.
Por ejemplo, si el usuario ingresa: Ayer, lunes, salimos a las once y 10.
La salida del programa debería ser: @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10.*/

package java_intro_ej01;

import java.util.Scanner;
//import java.util.stream.DoubleStream;
//import javax.imageio.ImageIO;

public class Java_Intro_Ej10_concatenar {

    public static void practicafunciones() {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese una frase terminada en punto");
        String frase = leer.nextLine();
        String ultimaLetra = frase.substring(frase.length()-1);
        
        reemplazamosVocales(frase);//esta es la funcion 
        
        //Aqui hicimos en reemplazo de las letras con metodos
        //String newfrase = frase.replace('a', '@').replace('e', '#').replace('i', '$').replace('o', '%').replace('u', '*');
        //System.out.println(newfrase);
       
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
