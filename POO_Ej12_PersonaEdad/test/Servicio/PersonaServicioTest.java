/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Servicio;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author susa0
 */
public class PersonaServicioTest {
    
    public PersonaServicioTest() {
    }

    /**
     * Test of crearPersona method, of class PersonaServicio.
     */
    @Test
    public void testCrearPersona() {
        System.out.println("crearPersona");
        PersonaServicio instance = new PersonaServicio();
        instance.crearPersona();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcularEdad method, of class PersonaServicio.
     */
    @Test
    public void testCalcularEdad() {
        System.out.println("calcularEdad");
        PersonaServicio instance = new PersonaServicio();
        instance.calcularEdad();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of menorQue method, of class PersonaServicio.
     */
    @Test
    public void testMenorQue() {
        System.out.println("menorQue");
        int edad = 0;
        PersonaServicio instance = new PersonaServicio();
        boolean expResult = false;
        boolean result = instance.menorQue(edad);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mostrarPersona method, of class PersonaServicio.
     */
    @Test
    public void testMostrarPersona() {
        System.out.println("mostrarPersona");
        PersonaServicio instance = new PersonaServicio();
        instance.mostrarPersona();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
