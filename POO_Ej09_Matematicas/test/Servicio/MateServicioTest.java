/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Servicio;

import Entidad.Matematicas;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author susa0
 */
public class MateServicioTest {
    
    public MateServicioTest() {
    }

    /**
     * Test of setOperacion method, of class MateServicio.
     */
    @Test
    public void testSetOperacion() {
        System.out.println("setOperacion");
        Matematicas operacion = null;
        MateServicio instance = new MateServicio();
        instance.setOperacion(operacion);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of devolverMayor method, of class MateServicio.
     */
    @Test
    public void testDevolverMayor() {
        System.out.println("devolverMayor");
        MateServicio instance = new MateServicio();
        int expResult = 0;
        int result = instance.devolverMayor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of calcularPotencia method, of class MateServicio.
     */
    @Test
    public void testCalcularPotencia() {
        System.out.println("calcularPotencia");
        MateServicio instance = new MateServicio();
        double expResult = 0.0;
        double result = instance.calcularPotencia();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcularRaiz method, of class MateServicio.
     */
    @Test
    public void testCalcularRaiz() {
        System.out.println("calcularRaiz");
        MateServicio instance = new MateServicio();
        int expResult = 0;
        int result = instance.calcularRaiz();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
