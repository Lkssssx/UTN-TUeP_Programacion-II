/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp_3_introduccion_a_poo;

/**
 *
 * @author lu
 */
public class Ejercicio_3 {
    public static void main(String[] args) {
        
        Libro a = new Libro();
        a.setAñoPublicacion(-1);
        a.setAñoPublicacion(2000);
        
        System.out.println(a.getTitulo());
        System.out.println(a.getAutor());
        System.out.println(a.getAñoPublicacion());
    }
}
