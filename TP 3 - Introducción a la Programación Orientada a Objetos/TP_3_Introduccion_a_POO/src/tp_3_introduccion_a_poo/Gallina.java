/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp_3_introduccion_a_poo;

/**
 *
 * @author lu
 */
public class Gallina {
    
    public int idGallina;
    public int edad;
    public int huevosPuestos;
    
    public void ponerHuevo() {
        huevosPuestos += 1;
        System.out.println("Huevos puestos: " + huevosPuestos);
    }
    
    public void envejecer() {
        edad+= 1;
        System.out.println("Nueva edad: " + edad);
    }
    
    public void mostrarEstado() {
        
        System.out.println("Huevos puestos: " + huevosPuestos + ". Edad: " + edad);
        
    }
    
}
