
package Servicio.AdoptarPerro_Servicio;

import Entidad.Ej01_Guia_AdoptarPerro.Perro;
import Entidad.Ej01_Guia_AdoptarPerro.Persona;
import java.util.Scanner;

public class Serv_AdoptarPerro_Ej01Guia {
    Scanner teclado = new Scanner(System.in);
    Perro perro1 = new Perro();
    Perro perro2 = new Perro();
    Persona persona = new Persona();
    Persona persona2 = new Persona();


    public void crearPerros(){
        this.perro1.setNombre("Pipe");
        this.perro1.setRaza("Mini pincher");
        this.perro1.setEdad(1);
        this.perro1.setTamanio(35);
        
        this.perro2.setNombre("Kaleth");
        this.perro2.setRaza("Pincher");
        this.perro2.setEdad(5);
        this.perro2.setTamanio(1.0);
        
    }
    
    public void crearPersona(){
        this.persona.setNombre("Angel");
        this.persona.setApellido("Ricardo");
        this.persona.setDocumento("123");
        this.persona.setEdad(4);
        this.persona.setPerro(perro1);
        
        this.persona2.setNombre("Neith");
        this.persona2.setApellido("Ricardo");
        this.persona2.setDocumento("321");
        this.persona2.setEdad(7);
        this.persona2.setPerro(perro2);
        
    }
    
    public void mostrarPersonas(){
        System.out.println("*****Primera persona con su mascota*****");
        System.out.println(persona);
        System.out.println("****Segunda persona con su mascota****");
        System.out.println(persona2);
        //Si queremos solo mostrar el perro de la entidad persona1
        System.out.println(this.persona.getPerro());
    }
}
