package Services;

import Entities.EJ03_Alumnos;
import java.util.ArrayList;
import java.util.Scanner;

public class Ej03_AlumnosService {

    ArrayList<EJ03_Alumnos> alumnos = new ArrayList();
    Scanner teclado = new Scanner(System.in);
    String respuesta;

    public void crearAlunmos() {
        do {
            ArrayList<Double> notas = new ArrayList();
            System.out.println("Ingrese nombre del estudiante");
            String nombre = teclado.next();
            System.out.println("Ingrese nota 1: ");
            notas.add(teclado.nextDouble());
            System.out.println("Ingrese nota 2: ");
            notas.add(teclado.nextDouble());
            System.out.println("Ingrese nota 3: ");
            notas.add(teclado.nextDouble());
            //Creamos el objeto Alumno y guardamos los datos
            this.alumnos.add(new EJ03_Alumnos(nombre, notas));
            System.out.println("Desea ingresar un nuevo alumno? S/N");
            respuesta = teclado.next();
        } while (respuesta.equalsIgnoreCase("s"));

    }
    
    public void notaFinal(){
        System.out.println("Ingrese nombre del estudiante:");
        String nombreABuscar = teclado.next();
        double promedio=0.0;
        for (EJ03_Alumnos alumno : alumnos) {
            if (alumno.getNombre().equalsIgnoreCase(nombreABuscar)){
                double acumNotas=0.0;
                ArrayList<Double> notas = new ArrayList();
                notas= alumno.getNotas();
                for ( double nota : notas){
                    acumNotas += nota;
                }
                promedio = acumNotas/notas.size();
                break;
            }
        }
        System.out.println("El promedio de las notas del alumno: " + nombreABuscar + " es: " + promedio );
    }
}
