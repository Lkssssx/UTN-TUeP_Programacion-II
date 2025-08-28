/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp_3_introduccion_a_poo;

/**
 *
 * @author lu
 */
public class Mascota {
        public String nombre;
        public String especie;
        public int edad;
        
        public void mostrarInfo() {
            System.out.println(nombre + " " + especie + " " + edad);
        }
        
        public void cumplirAnios() {
            edad+= 1;
            System.out.println(nombre + " ahora tiene " + edad + " años");
        }
}
