
package Servicio.CursoProfesor_Servicio;

import Entidad.Ej_01_CursoProfesor.Curso_01;
import Entidad.Ej_01_CursoProfesor.Profesor_01;

public class Servicios_CursoProfesor_01 {
    Profesor_01 persona =new Profesor_01();
        
    public void llenarYMostrarDatos(){
        persona.setNombre("Ana");
        persona.setApellido("Ruiz");
        
        Curso_01 curso=new Curso_01();
        curso.setAnio(5);
        curso.setDivision('s');
        curso.setPersona(persona);
        System.out.println(curso);
    }
}
