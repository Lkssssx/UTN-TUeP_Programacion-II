/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp_3_introduccion_a_poo;

/**
 *
 * @author lu
 */
public class NaveEspacial {
    public String nombre;
    public int combustible;
    
    public void despegar() {
        System.out.println("El cohete despegó");
    }
    
    public void avanzar(int distancia) {
        if (combustible >= 90) {
            System.out.println("La nave avanza");
        } else {
            System.out.println("Falta combustible para avanzar");
        }
    }
    
    public void recargarCombustible(int cantidad) {
        if ((combustible + cantidad) <= 100) {
            combustible += cantidad;
        } else {
            System.out.println("Esa cantidad es invalida");
        }
    }
    
    public void mostrarEstado() {
        System.out.println("Nombre: " + nombre + ". Combustible: " + combustible + "%");
    }
    
}
