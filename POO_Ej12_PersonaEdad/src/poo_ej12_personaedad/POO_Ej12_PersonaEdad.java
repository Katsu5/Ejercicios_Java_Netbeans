
package poo_ej12_personaedad;


import Servicio.PersonaServicio;

public class POO_Ej12_PersonaEdad {

    public static void main(String[] args) {
        PersonaServicio pservicio = new PersonaServicio();
        pservicio.crearPersona();
        pservicio.calcularEdad();
        pservicio.menorQue(40);
        pservicio.mostrarPersona();
    }
    
}
