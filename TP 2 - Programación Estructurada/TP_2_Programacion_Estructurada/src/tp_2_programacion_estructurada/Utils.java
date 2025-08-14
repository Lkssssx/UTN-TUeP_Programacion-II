/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp_2_programacion_estructurada;

import java.util.Scanner;

/**
 *
 * @author lu
 */
public class Utils {
    public static void main(String[] args) {

    }
    
    
    /**
     * Es un input que a su vez imprime un mensaje, y devuelve el input en String.
     * @param msg El mensaje que se quiera mostrar por consola para que el usuario sepa que ingresar
     * @return Devuelve el input ingresado por el usuario como String con la función de nextLine().
     */
    public static String input(String msg) {
        Scanner input = new Scanner(System.in);
        System.out.println(msg);
        return input.nextLine();
        
    }
    
}
