
package Servicio;

import Entidad.Persona;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author susa0
 */
public class PersonaServicioTest {
    
    PersonaServicio servicio;
    
    public PersonaServicioTest() {
    }
    
    @Before
    public void setUp() {
        servicio = new PersonaServicio();
    }
    /**
     * Test of crearPersona method, of class PersonaServicio.
     */
//    @Test
//    public void testCrearPersona() {
//        System.out.println("crearPersona");
//        PersonaServicio instance = new PersonaServicio();
//        instance.crearPersona();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of calcularIMC method, of class PersonaServicio.
     */
    @Test
    public void testCalcularIMC() {
        System.out.println("calcularIMC");
        var persona = new Persona("Juan",39,"M",70,170);
        servicio.setPersona(persona);
        int expResult = -1;
        int result = servicio.calcularIMC();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of esMayordeEdad method, of class PersonaServicio.
     */
    @Test
    public void testEsMayordeEdad() {
        System.out.println("esMayordeEdad");
         var persona = new Persona("Juan",39,"M",70,170);
        servicio.setPersona(persona);
        boolean result = servicio.esMayordeEdad();
        assertTrue( result);
        // TODO review the generated test code and remove the default call to fail.
       
    }
    
}
