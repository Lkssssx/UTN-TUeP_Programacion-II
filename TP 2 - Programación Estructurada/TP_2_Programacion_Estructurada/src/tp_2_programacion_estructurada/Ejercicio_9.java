/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp_2_programacion_estructurada;

/**
 *
 * @author lu
 */
public class Ejercicio_9 {

    public static void main(String[] args) {
        String zona;
        double precio, peso, envio;
        
        zona = Utils.input("Ingrese la zona de envío (Nacional/Internacional) ");
        precio = Double.parseDouble(Utils.input("Ingrese el costo del producto: "));
        peso = Double.parseDouble(Utils.input("Ingrese el peso del producto en kg: "));

       envio = calcularCostoEnvio(peso, zona);
       calcularTotalCompra(precio, envio);

    }
    
    
    static double calcularCostoEnvio(double peso, String zona) {
        double  nacional, internacional, precio;
        
        nacional = 5;
        internacional = 10;
        
        if (zona.equalsIgnoreCase("nacional")) {
            precio = peso * nacional;
        } else {
            precio = peso * internacional;
        }
        System.out.println("El costo de envío es: " + precio);
        return precio;
    }
    
    
    
    
    static double calcularTotalCompra(double precioProducto, double costoEnvio) {
        double total = precioProducto + costoEnvio;
        System.out.println("El total a pagar es: " + total);
       return total;
    }
}
    

    


