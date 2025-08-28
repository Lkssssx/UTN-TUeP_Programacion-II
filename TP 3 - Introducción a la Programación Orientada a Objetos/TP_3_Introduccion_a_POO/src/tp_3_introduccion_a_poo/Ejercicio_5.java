/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp_3_introduccion_a_poo;

/**
 *
 * @author lu
 */
public class Ejercicio_5 {
    public static void main(String[] args) {
        
        NaveEspacial a = new NaveEspacial();
        
        a.combustible = 50;
        a.avanzar(10);
        
        a.recargarCombustible(45);
        a.avanzar(10);
        
        a.mostrarEstado();
    }
}
