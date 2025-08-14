/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp_2_programacion_estructurada;

/**
 *
 * @author lu
 */
public class Ejercicio_5 {
    public static void main(String[] args) {
        int num;
        int cont = 0;
        do {
            num = Integer.parseInt(Utils.input("Ingrese un número par a sumar: (Ingrese 0 para salir) "));
            
            if (num % 2 == 0) {
                cont += num;
            }
            
        } while (num != 0);
        
        System.out.println("Total de números pares sumados " + cont);
    }
}
