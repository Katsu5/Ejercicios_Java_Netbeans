
package poo_ej11_date;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class POO_Ej11_Date {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el dia");
        int dia = teclado.nextInt();
        System.out.println("Ingrese el mes");
        int mes = teclado.nextInt();
        System.out.println("Ingrese el año");
        int anio = teclado.nextInt();
         
        //fecha ingresaa por el usuario
        LocalDate fecha = LocalDate.of(anio, mes, dia);
        //fecha actual     
        LocalDate fechaActual = LocalDate.now();
        
        //calculamos el periodo entre las fechas
        Period periodo = Period.between(fecha, fechaActual);
        int diferenciaAnios = periodo.getYears();
        
        //mostramos las fechas por pantalla
        System.out.println("fecha ingresada: " + fecha);
        System.out.println("fecha actual: " + fechaActual);
        System.out.println("Diferencia de fechas: " + diferenciaAnios + " años.");
        
    }

}
