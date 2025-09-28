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
public class Curso {
    private String codigo;
    private String nombre;
    private Profesor profesor;

    public Curso(String codigo, String nombre, Profesor profesor) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.profesor = profesor;
    }
    
        public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.profesor = null;
    }
    
    public void setProfesor(Profesor p) {
        if (this.profesor == p) {
            return;
        }
        Profesor profesorAnterior = this.profesor;
        
        if (profesorAnterior != null) {
            this.profesor = null;
            profesorAnterior.eliminarCurso(this);
        }
        
        this.profesor = p;
        
        if (p != null){
            p.agregarCurso(this);
        }
    }
    
    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public Profesor getProfesor() {
        return profesor;
    }
    
    public void mostrarInfo() {
        String mensaje = "Curso: " + "codigo=" + codigo + ", nombre=" + nombre + ", profesor=";
        if (this.profesor != null) {
            mensaje += profesor.getNombre();
            mensaje += ", idProfesor: "+profesor.getId()+ "}";
        } else {
            mensaje += "null}";
        }
        System.out.println(mensaje);
    }

    @Override
    public String toString() {
        String mensaje = "Curso: " + "codigo=" + codigo + ", nombre=" + nombre + ", profesor=";
        if (this.profesor != null) {
            mensaje += profesor.getNombre();
            mensaje += ", idProfesor: "+profesor.getId()+ "}";
        } else {
            mensaje += "null}";
        }
        return mensaje;
    }
    
    
}
