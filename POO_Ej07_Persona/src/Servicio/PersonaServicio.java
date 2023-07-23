
package Servicio;

import Entidad.Persona;
import java.util.Scanner;

public class PersonaServicio {
    private Persona persona;

    public void setPersona(Persona persona) {
        this.persona = persona;
    }
    
    public void crearPersona(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese nombre de la persona");
        String nombre = leer.nextLine();
        System.out.println("Ingrese la edad de la persona");
        int edad = leer.nextInt();
        System.out.println("Ingrese el sexo así: 'H' si es hombre, 'M' si es mujer y 'O' si es otro.");
        String sexo = leer.next();
        while (!sexo.equalsIgnoreCase("H") && !sexo.equalsIgnoreCase("M") && !sexo.equalsIgnoreCase("O")){        
            System.out.println("Dato invalido.");
            System.out.println("Ingrese sexo nuevamente");
            sexo = leer.next();
        } 
        System.out.println("Ingrese el peso de la persona");
        double peso = leer.nextDouble();
        System.out.println("Ingrese la estatura de la persona");
        double estatura = leer.nextDouble();
        
        this.persona = new Persona(nombre,edad,sexo,peso,estatura);
        System.out.println("nombre: " + nombre);
    }
    
    public int calcularIMC(){
        double pesoIdeal = this.persona.getPeso()/ (Math.pow(this.persona.getAltura(),2));
        int resultadoPesoIdeal=0;
        if (pesoIdeal < 20){
            resultadoPesoIdeal = -1;
            System.out.println(resultadoPesoIdeal + " La persona esta por debajo de su peso ideal");
        }else if (pesoIdeal >=20 && pesoIdeal <= 25 ){
            resultadoPesoIdeal = 0;
            System.out.println(resultadoPesoIdeal + " La persona esta en su peso ideal");
        }else{
            resultadoPesoIdeal =1;
            System.out.println(resultadoPesoIdeal + " La persona tiene sobrepeso");
        }
        return resultadoPesoIdeal;
    }
    
    //Este codigo se conoce como operador ternario, es como un if resumido.
    public boolean esMayordeEdad(){
        boolean mayor = persona.getEdad()>=18 ? true : false;
        System.out.println("La persona es mayor de edad: " + mayor);
        return mayor;
    }
    
}
