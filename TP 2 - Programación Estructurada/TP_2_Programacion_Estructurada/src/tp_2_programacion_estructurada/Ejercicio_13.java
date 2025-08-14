/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp_2_programacion_estructurada;

/**
 *
 * @author lu
 */
public class Ejercicio_13 {
    public static void main(String[] args) {
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};
        
        System.out.println("Precios originales: ");
        mostrarPrecios(precios, 0);

        precios[2] = 129.99;
        
        System.out.println("Precios modificados: ");
        mostrarPrecios(precios, 0);

    }
    
    static void mostrarPrecios(double[] precios, int base) {
        
        if (base >= precios.length - 1) {
            System.out.println("Precio: " + precios[base]);
        } else {
            System.out.println("Precio: " + precios[base]);
            mostrarPrecios(precios, base + 1);
        }
    }
    
}
