/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp_2_programacion_estructurada;

/**
 *
 * @author lu
 */
public class Ejercicio_8 {
    public static void main(String[] args) {
        double precioBase, impuesto, descuento, precioFinal;
        
        precioBase = Double.parseDouble(Utils.input("Ingrese el precio base: "));
        impuesto = Double.parseDouble(Utils.input("Ingrese el el impuesto en porcentaje: "));
        descuento = Double.parseDouble(Utils.input("Ingrese el descuento en porcentaje: "));
        
        precioFinal = calcularPrecioFinal(impuesto, descuento, precioBase);
        
        System.out.println("El precio final del producto es de: " + precioFinal);
    }
    
    static double calcularPrecioFinal(double impuesto, double descuento, double precioBase) {
        
        double precioFinal = precioBase + (precioBase * impuesto / 100) - (precioBase * descuento / 100);
        
        return precioFinal;
        
    }
    
    
}
