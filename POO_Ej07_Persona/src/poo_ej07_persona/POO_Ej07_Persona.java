
package poo_ej07_persona;

import Servicio.PersonaServicio;

public class POO_Ej07_Persona {
    
    public static void main(String[] args) {
        int contarBajoPeso=0;
        int contarPesoIdeal=0;
        int contarPorEncima=0;
        int contarMayores=0;
        int contarMenores=0;
        
        PersonaServicio persona1 = new PersonaServicio();
        persona1.crearPersona();
        int resultadoP1IMC = persona1.calcularIMC();
        switch (resultadoP1IMC) {
            case -1 -> contarBajoPeso++;
            case 0 -> contarPesoIdeal++;
            default -> contarPorEncima++;
        }
        
        boolean esMayorP1 = persona1.esMayordeEdad();
        if (esMayorP1){
            contarMayores++;
        }else{
            contarMenores++;
        }
               
        PersonaServicio persona2 = new PersonaServicio();
        persona2.crearPersona();
        int resultadoP2IMC = persona2.calcularIMC();
        switch (resultadoP2IMC) {
            case -1 -> contarBajoPeso++;
            case 0 -> contarPesoIdeal++;
            default -> contarPorEncima++;
        }
        boolean esMayorP2 = persona2.esMayordeEdad();
        if (esMayorP2){
            contarMayores++;
        }else{
            contarMenores++;
        }
        
        PersonaServicio persona3 = new PersonaServicio();
        persona3.crearPersona();
        int resultadoP3IMC = persona3.calcularIMC();
        switch (resultadoP3IMC) {
            case -1 -> contarBajoPeso++;
            case 0 -> contarPesoIdeal++;
            default -> contarPorEncima++;
        }
        boolean esMayorP3 = persona3.esMayordeEdad();
        if (esMayorP3){
            contarMayores++;
        }else{
            contarMenores++;
        }
        
        PersonaServicio persona4 = new PersonaServicio();
        persona4.crearPersona();
        int resultadoP4IMC = persona4.calcularIMC();
        switch (resultadoP4IMC) {
            case -1 -> contarBajoPeso++;
            case 0 -> contarPesoIdeal++;
            default -> contarPorEncima++;
        }
        boolean esMayorP4 = persona4.esMayordeEdad();
        if (esMayorP4){
            contarMayores++;
        }else{
            contarMenores++;
        }
       
        //Calculemos porcentajes
        double porcentajeBajopeso = (contarBajoPeso/4.0)*100;
        double porcentajePesoIdeal = (contarPesoIdeal/4.0)*100;
        double porcentajeSobrepeso = (contarPorEncima/4.0)*100;
        double porcentajeMayores = (contarMayores/4.0)*100;
        double porcentajeMenores = (contarMenores/4.0)*100;
        System.out.println("El porcentaje de personas debajo de su peso es: " + porcentajeBajopeso + " %");
        System.out.println("El porcentaje de personas con peso ideal es: " + porcentajePesoIdeal + " %");
        System.out.println("El porcentaje de personas con sobrepeso es: " + porcentajeSobrepeso + " %");
        System.out.println("El porcentaje de personas mayores de edad es: " + porcentajeMayores + " %");
        System.out.println("El porcentaje de personas menores de edad es: " + porcentajeMenores + " %"); 
    }
    
}
