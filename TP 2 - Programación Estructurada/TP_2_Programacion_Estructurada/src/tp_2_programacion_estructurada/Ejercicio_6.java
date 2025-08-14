/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp_2_programacion_estructurada;

/**
 *
 * @author lu
 */
public class Ejercicio_6 {
    public static void main(String[] args) {
        

        int pos = 0;
        int neg = 0;
        int cero = 0;
        
        for (int i = 10; i > 0; i--) {
            int num = Integer.parseInt(Utils.input("Ingresa " + i + " números: (uno a uno)"));
            
            if (num > 0) {
                pos += 1;
            } else if (num < 0) {
                neg += 1;
            } else {
                cero += 1;
            }
        }
        
        System.out.println("Positivos: " + pos);
        System.out.println("Negativos: " + neg);
        System.out.println("Ceros: " + cero);
        
    }
}
