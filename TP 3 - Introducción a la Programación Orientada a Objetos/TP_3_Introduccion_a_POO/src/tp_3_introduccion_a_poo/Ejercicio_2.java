/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp_3_introduccion_a_poo;

/**
 *
 * @author lu
 */
public class Ejercicio_2 {
    public static void main(String[] args) {
        Mascota a = new Mascota();
        
        a.nombre = "pipo";
        a.especie = "Beagle";
        a.edad = 5;
        
        a.mostrarInfo();
        a.cumplirAnios();
        a.mostrarInfo();
        
    }
}
