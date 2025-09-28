/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Caso_Practico_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author lu
 */
public class Profesor {
    private String id;
    private String nombre;
    private String especialidad;
    private List<Curso> cursos;

    public Profesor(String id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.cursos = new ArrayList<>();
    }
    
    public void agregarCurso(Curso c) {
        if (!cursos.contains(c)) {
            this.cursos.add(c);
            
            if (c.getProfesor() != this) {
            c.setProfesor(this);
            }
        }
    }
    
    public void eliminarCurso(Curso c) {
        if (this.cursos.remove(c)) {
            if (c.getProfesor() == this) {
                c.setProfesor(null);
            }   
        }
    }
    
    public void eliminarCurso (List<Curso> cursos) {
        
        // No entiendo por que tengo que pasarlo a un arraylist para que ande, si intento solo el código debajo de esta conversión no funciona, fue la forma que me ingenié al interpretar que el error estaba aca
        ArrayList<Curso> cursosArrayL = new ArrayList<>();
        for (Curso curso : cursos) {
            cursosArrayL.add(curso);
        }
        
        if (this.cursos != null) {
            for (Curso curso : cursosArrayL) {
                eliminarCurso(curso);
            }
        }
    }
    
    public void listarCursos() {
        for (Curso curso : this.cursos) {
            curso.mostrarInfo();
        }
    }
    
    public ArrayList<String> nombresDeCurso() {
        ArrayList<String> nombresDeCurso = new ArrayList<>();
        for (Curso curso : this.cursos) {
            if (curso != null) {
                nombresDeCurso.add(curso.getNombre());
            } else {
                nombresDeCurso.add("null");
            }
        }
        return nombresDeCurso;
    }
    
    public void mostrarInfo() {
        String mensaje = "Profesor{" + "id=" + id + ", nombre=" + nombre + ", especialidad=" + especialidad + ", cursos=";
        mensaje += nombresDeCurso() + "}";
        System.out.println(mensaje);
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        if (this.nombre != null) {
            return nombre;
        } else {
            return null;
        }
    }

    public List<Curso> getCursos() {
        return Collections.unmodifiableList(this.cursos);
    }
    
    public int totalCursos() {
        return this.cursos.size();
    }
    
    
    @Override
    public String toString() {
        String mensaje = "Profesor{" + "id=" + id + ", nombre=" + nombre + ", especialidad=" + especialidad + ", cursos=";
        mensaje += nombresDeCurso() + "}";
        return mensaje;
    }
    
    
    
}
