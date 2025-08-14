/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp_2_programacion_estructurada;

/**
 *
 * @author lu
 */
public class Ejercicio_2 {
    public static void main(String[] args) {    
        int num1, num2, num3, mayor;
        
        num1 = Integer.parseInt(Utils.input("Ingrese el 1er número: "));
        num2 = Integer.parseInt(Utils.input("Ingrese el 2do número: "));
        num3 = Integer.parseInt(Utils.input("Ingrese el 3er número: "));
        
        if (num1 > num2 && num1 > num3) {
            mayor = num1;
        } else if (num2 > num1 && num2 > num3) {
            mayor = num2;
        } else {
            mayor = num3;
        }
        
        System.out.println("El mayor es: " + mayor);   
    }
}
