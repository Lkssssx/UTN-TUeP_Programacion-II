/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp_2_programacion_estructurada;

/**
 *
 * @author lu
 */
public class Ejercicio_11 {
    
    final static double DESCUENTO_ESPECIAL = 0.10;
    
    public static void main(String[] args) {
        double precio;
        
        precio = Double.parseDouble(Utils.input("Ingrese el precio del producto: "));
        
        calcularDescuentoEspecial(precio);
        
    }
    
    static void calcularDescuentoEspecial(double precio) {
        double descuentoAplicado, precioFinal;
        
        descuentoAplicado = precio * DESCUENTO_ESPECIAL;
        precioFinal = precio - descuentoAplicado;
        
        System.out.println("El descuento aplicado es: " + descuentoAplicado);
        System.out.println("El precio final con descuento es: " + precioFinal);
        
    }
    
    
}
