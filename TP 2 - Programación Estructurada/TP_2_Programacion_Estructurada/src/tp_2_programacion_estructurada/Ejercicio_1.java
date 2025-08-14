/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp_2_programacion_estructurada;


/**
 *
 * @author lu
 */
public class Ejercicio_1 {
    public static void main(String[] args) {

        int año = Integer.parseInt(Utils.input("Ingrese un año de nacimiento: "));

        
        if ((año % 4 == 0 && año % 100 != 0) || (año % 400 == 0)) {
            System.out.println("El año " + año + " es biciesto");
        } else {
            System.out.println("El año " + año + " no es biciesto");
        }
    }
}
