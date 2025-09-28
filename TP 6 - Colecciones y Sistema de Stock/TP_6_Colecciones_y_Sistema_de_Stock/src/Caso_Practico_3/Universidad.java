/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Caso_Practico_3;

import java.util.ArrayList;

/**
 *
 * @author lu
 */
public class Universidad {
    private String nombre;
    private ArrayList<Profesor> profesores;
    private ArrayList<Curso> cursos;
    
    public Universidad(String nombre) {
        this.nombre = nombre;
        this.profesores = new ArrayList<>();
        this.cursos = new ArrayList<>();
    }
    
    public void agregarProfesor(Profesor p) {
        profesores.add(p);
    }
    
    public void agregarCurso(Curso c) {
        cursos.add(c);
    }
    
    public Profesor buscarProfesorPorId(String id) {
        int i = 0;
        Profesor profesor = this.profesores.get(i);
        Profesor profesorEncontrado = null;
        
        while (!profesor.getId().equals(id) && i != this.profesores.size()) {
            profesor = this.profesores.get(i);
            i++;
        }
        
        if (profesor.getId().equals(id)) {
            profesorEncontrado = profesor;
        }
        
        return profesorEncontrado;
    }
    
    public Curso buscarCursoPorCodigo(String codigo) {
        int i = 0;
        Curso curso = this.cursos.get(i);
        Curso cursoEncontrado = null;
        
        while (!curso.getCodigo().equals(codigo) && i != this.cursos.size()) {
            curso = this.cursos.get(i);
            i++;
        }
        
        if (curso.getCodigo().equals(codigo)) {
            cursoEncontrado = curso;
        }
        
        return cursoEncontrado;
    }
    
    public void asignarProfesorACurso(String codigoCurso, String idProfesor) {
        Profesor profesor = buscarProfesorPorId(idProfesor);
        Curso curso = buscarCursoPorCodigo(codigoCurso);
        
        if (profesor != null && curso != null) {
            profesor.agregarCurso(curso);
            System.out.println("Se agrego el profesor " + profesor.getNombre() + " al curso: " + curso.getNombre());
        } else {
            System.out.println("No se pudo encontrar el curso o el profesor");
        }
    }
    
    public void  listarProfesores() {
        for (Profesor profesor : this.profesores) {
            profesor.mostrarInfo();
        }
    }
    
    public void listarCursos() {
        for (Curso curso : this.cursos) {
            curso.mostrarInfo();
        }
    }
    
    public void eliminarCurso(String codigo) {
        Curso curso = buscarCursoPorCodigo(codigo);
        if (curso != null) {
            curso.setProfesor(null);
            this.cursos.remove(curso);
            System.out.println("Se elimino el curso correctamente");
        } else {
            System.out.println("No se pudo encontrar el curso");
        }
    }
    
    public void eliminarProfesor(String id) {
        Profesor profesor = buscarProfesorPorId(id);

        if (profesor != null) {
            profesor.eliminarCurso(profesor.getCursos());
            profesores.remove(profesor);
            System.out.println("Se elimino el profesor: " + profesor);
        } else {
            System.out.println("No se pudo encontrar el profesor");
        }
    }

    @Override
    public String toString() {
        return "Universidad{" + "nombre=" + nombre + '}';
    }
    
}
