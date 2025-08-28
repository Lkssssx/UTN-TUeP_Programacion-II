/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp_3_introduccion_a_poo;

/**
 *
 * @author lu
 */
public class Ejercicio_4 {
    public static void main(String[] args) {
        Gallina a1 = new Gallina();
        Gallina a2 = new Gallina();
        
        a1.envejecer();
        a2.envejecer();
        
        a1.ponerHuevo();
        a2.ponerHuevo();
        
        a1.mostrarEstado();
        a2.mostrarEstado();
    }
}
