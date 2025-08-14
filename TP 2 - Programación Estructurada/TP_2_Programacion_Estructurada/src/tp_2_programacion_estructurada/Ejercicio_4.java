/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp_2_programacion_estructurada;

/**
 *
 * @author lu
 */
public class Ejercicio_4 {
    public static void main(String[] args) {
        
        double precio;
        char categoria;
        int descuento = 0;
        double precioFinal = 0.0;
                
        precio = Integer.parseInt(Utils.input("Ingrese el precio del producto: "));
        categoria = (Utils.input("Ingrese la categoría del producto: (A, B, C)")).charAt(0);
        
        
        switch (categoria) {
            case 'A':
            case 'a':
                descuento = 10;
                break;
            case 'B':
            case 'b':
                descuento = 15;
                break;
            case 'C':
            case 'c':
                descuento = 20;
                break;
            default:

                System.out.println("ERROR. Ingrese una opción valida");
                System.exit(0);
        }
        
        
        precioFinal = precio - (precio * (descuento / 100.0));
        
        System.out.println("Decuento aplicado: " +  descuento + "%");
        System.out.println("Precio final: " + precioFinal);
        
    }
}
