/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp_3_introduccion_a_poo;

/**
 *
 * @author lu
 */
public class Ejercicio_1 {
    
    public static void main(String[] args) {
        Alumno a = new Alumno();
        
        a.nombre = "florencia";
        a.apellido = "avispa";
        a.calificacion = 10;
        a.curso = "5to A";

        a.mostrarInfo();
        a.bajarCalificacion(4);
        a.mostrarInfo();
        a.subirCalificacion(2);
        a.mostrarInfo();

    }
}
