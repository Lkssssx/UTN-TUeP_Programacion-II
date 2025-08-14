/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp_2_programacion_estructurada;

/**
 *
 * @author lu
 */
public class Ejercicio_10 {
    public static void main(String[] args) {
        int stockActual, cantidadVendida, cantidadRecibida;
        
        stockActual = Integer.parseInt(Utils.input("Ingrese el stock actual: "));
        cantidadVendida = Integer.parseInt(Utils.input("Ingrese la cantidad vendida: "));
        cantidadRecibida = Integer.parseInt(Utils.input("Ingrese la cantidad recibida: "));
        
        stockActual = actualizarStock(stockActual, cantidadVendida, cantidadRecibida);
        
    }
    
    
    static int actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida) {
        int nuevoStock;
        
        nuevoStock = stockActual - cantidadVendida + cantidadRecibida;
        
        System.out.println("El nuevo stock del producto es: " + nuevoStock);
        
        return nuevoStock;
        
    }
}
