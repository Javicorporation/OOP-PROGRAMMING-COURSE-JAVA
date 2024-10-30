package com.mycompany.mavenproject0;
import com.mycompany.mavenproject0.logica.Alumno;
import com.mycompany.mavenproject0.logica.Carrera;
import com.mycompany.mavenproject0.logica.Controladora;
import com.mycompany.mavenproject0.logica.Materia;
import com.mycompany.mavenproject0.persistencia.ControladoraPersistencia;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;


public class Mavenproject0 {
    public static void main(String[] args) {
        
        Controladora controladora = new Controladora();
        
        // instanciamos materias
        Materia materia1 = new Materia(1, "Matematicas", "Escrito");        
        Materia materia2 = new Materia(2, "Lenguaje", "Virtual");
        Materia materia3 = new Materia(3, "Historia", "Escrito");

        // creamos las materias
        controladora.crearMateria(materia1);
        controladora.crearMateria(materia2);
        controladora.crearMateria(materia3);
        
        // agregamos a la lista
        List<Materia> listaMaterias = new LinkedList<>();
        listaMaterias.add(materia1);        
        listaMaterias.add(materia2);
        listaMaterias.add(materia3);

        
        Carrera carrera1 = new Carrera(1, "Administracion", listaMaterias);
        controladora.crearCarrera(carrera1);
        
        Alumno alumno1 = new Alumno(5, "Martha", "Luz", new Date(), carrera1);
        controladora.crearAlumno(alumno1);
        
        //controladora.eliminarAlumno(1);
        
//        alumno1.setApellido("Marss");
//        controladora.editarAlumno(alumno1);

//          Alumno alumno1 = controladora.traerAlumno(2);
//          System.out.println(alumno1);
          
          System.out.println("-----------------");
          
//          List<Alumno> alumnos = controladora.traerListaAlumnos();
//          
//          for(Alumno alu : alumnos){
//              System.out.println("- "+alu);
//          }
    }
}
