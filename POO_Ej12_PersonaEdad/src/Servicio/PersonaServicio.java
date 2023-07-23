
package Servicio;

import Entidad.Persona;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.Scanner;

public class PersonaServicio {
    private Persona persona;
    Scanner teclado = new Scanner(System.in);
    
    public void crearPersona(){
        System.out.println("Ingrese su nombre: ");
        String nombre = teclado.next();
        System.out.println("Ahora su fecha de nacimiento: ");
        System.out.println("Ingrese el dia");
        int dia = teclado.nextInt();
        System.out.println("Ingrese el mes");
        int mes = teclado.nextInt();
        System.out.println("Ingrese el año");
        int anio = teclado.nextInt();
        
        LocalDate fechaNac = LocalDate.of(anio, mes, dia);
             
        this.persona = new Persona(nombre, fechaNac);
    }
    
    public void calcularEdad(){
        LocalDate fechaActual = LocalDate.now();
        Period periodo = Period.between(persona.getFechaNac(), fechaActual);
        int edad = periodo.getYears();
        System.out.println(persona.getNombre() + " tiene " + edad + " años ");
    }
    
    public boolean menorQue(int edad){
        LocalDate fechaActual = LocalDate.now();
        Period peri = Period.between(persona.getFechaNac(), fechaActual);
        int edad2 = peri.getYears();    
        boolean mayor = edad >= edad2;
        System.out.println("El receptor es mayor? " + mayor);
        return mayor;
    }
    
    public void mostrarPersona(){
        System.out.println(persona.getNombre());
        System.out.println(persona.getFechaNac());
    }
    
}
