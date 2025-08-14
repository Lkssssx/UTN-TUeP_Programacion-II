/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp_2_programacion_estructurada;

/**
 *
 * @author lu
 */
public class Ejercicio_12 {
    public static void main(String[] args) {
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};
        
        System.out.println("Precios originales: ");
        mostrarPrecios(precios);

        precios[2] = 129.99;
        
        System.out.println("Precios modificados: ");
        mostrarPrecios(precios);

    }
    
    static void mostrarPrecios(double[] precios) {
        for (int i = 0; i < precios.length; i++) {
            double precio = precios[i];
            System.out.println("Precio: $" + precio);
        }
        System.out.println("");
    }
}

