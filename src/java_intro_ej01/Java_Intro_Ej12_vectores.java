/*Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad de compañeros
de equipo y define su tipo de dato de tal manera que te permita alojar sus 
nombres más adelante.*/

package java_intro_ej01;

import java.util.Scanner;
import java.util.Vector;
import javax.xml.transform.Source;


public class Java_Intro_Ej12_vectores {
    public static void practicaVectores() {
        String[] equipo = new String[6];
        
        equipo[0]="Claudia";
        equipo[1]="Katia";
        equipo[2]="Lina";
        equipo[3]="Indira";
        equipo[4]="Galena";
        equipo[5]="Maria Jose";
        
        System.out.println(equipo[0]);
        System.out.println(equipo[1]);
        System.out.println(equipo[2]);
        System.out.println(equipo[3]);
        System.out.println(equipo[4]);
        System.out.println(equipo[5]);

    }
    
    public static void practicaFor() {
        Scanner leer = new Scanner(System.in);
        String[] equipo = new String[6];
        
        for (int i=0; i<6; i++){
            System.out.println("Ingrese el nombre del jugador");
            String nombre = leer.nextLine();
            equipo[i]= nombre;
        }
        for (int i=0; i<6; i++){
            System.out.println("[" + equipo[i] + "]");
        
        }
    }
}
