/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp_3_introduccion_a_poo;

/**
 *
 * @author lu
 */
public class Alumno {
    public String nombre;
    public String apellido;
    public String curso;
    public int calificacion;

    public void mostrarInfo() {
        System.out.println(nombre + " " + apellido + " " + curso + " " + calificacion);
    }

    public void bajarCalificacion(int puntos) {
        calificacion -= puntos;
        System.out.println("Se bajo " + puntos + " de la calificación");
    }

    public void subirCalificacion(int puntos) {
        calificacion += puntos;
        System.out.println("Se subio " + puntos + " de la calificación");
    }
}
