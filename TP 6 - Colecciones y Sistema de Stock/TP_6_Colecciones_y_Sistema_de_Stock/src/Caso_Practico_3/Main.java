/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Caso_Practico_3;

/**
 *
 * @author lu
 */
public class Main {
    public static void main(String[] args) {
//      1. Crear al menos 3 profesores y 5 cursos.
        Profesor p1 = new Profesor("101", "Juan", "Artes");
        Profesor p2 = new Profesor("102", "Hugo", "Diseño");
        Profesor p3 = new Profesor("103", "Maria", "Publicidad");
        
        Curso c1 = new Curso("022", "Artes A");
        Curso c2 = new Curso("023", "Artes B");
        Curso c3 = new Curso("024", "Diseño A");
        Curso c4 = new Curso("025", "Diseño B");
        Curso c5 = new Curso("026", "Publicidad A");

//      2. Agregar profesores y cursos a la universidad.
        Universidad universidad = new Universidad("Universidad de Diseño");
        universidad.agregarProfesor(p1);
        universidad.agregarProfesor(p2);
        universidad.agregarProfesor(p3);
        universidad.agregarCurso(c1);
        universidad.agregarCurso(c2);
        universidad.agregarCurso(c3);
        universidad.agregarCurso(c4);
        universidad.agregarCurso(c5);
        
//      3. Asignar profesores a cursos usando asignarProfesorACurso(...).
        System.out.println("3");
        universidad.asignarProfesorACurso("022", "101");
        universidad.asignarProfesorACurso("023", "101");
        universidad.asignarProfesorACurso("024", "102");
        universidad.asignarProfesorACurso("025", "102");
        universidad.asignarProfesorACurso("026", "103");
        System.out.println("");
        
//      4. Listar cursos con su profesor y profesores con sus cursos
        System.out.println("4.");
        universidad.listarProfesores();
        universidad.listarCursos();
        System.out.println("");
        
//      5. Cambiar el profesor de un curso y verificar que ambos lados quedan sincronizados.
        System.out.println("5.");
        universidad.asignarProfesorACurso("025", "101");
        System.out.println(universidad.buscarCursoPorCodigo("025"));
        System.out.println(universidad.buscarProfesorPorId("101"));
        System.out.println(universidad.buscarProfesorPorId("102"));
        System.out.println("");
//      6. Remover un curso y confirmar que ya no aparece en la lista del profesor
        System.out.println("6");
        universidad.eliminarCurso("025");
        universidad.listarProfesores();
        System.out.println("");
        
        
//      7. Remover un profesor y dejar profesor = null,
        System.out.println("7.");
        universidad.eliminarProfesor("103");
        universidad.listarProfesores();
        universidad.listarCursos();
        
        System.out.println("");
//      8. Mostrar un reporte: cantidad de cursos por profesor.
        System.out.println("8.");
        System.out.println("La cantidad de cursos del profesor " + p1.getNombre() + " es: " + p1.totalCursos());
        
    }
}
