
package Servicio;

import Entidad.Curso;
import java.util.Scanner;

public class CursoServicio {
    private Curso curso;
    Scanner teclado = new Scanner(System.in);
    
    
    public void cargarAlumnos(){
        String alumnos[] = new String [5]; 
        for (int i = 0; i < alumnos.length; i++) {
            System.out.println("Ingrese alunmos");
            alumnos[i] = teclado.next(); 
        }
    }
    
    public void crearCurso(){
        System.out.println("Ingrese nombre del curso");
        String nombreCurso = teclado.next();
        curso.setNombreCurso(nombreCurso);
    }
}
