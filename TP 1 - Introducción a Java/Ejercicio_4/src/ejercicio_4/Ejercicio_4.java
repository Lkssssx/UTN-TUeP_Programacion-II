/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_4;

import java.util.Scanner;

/**
 *
 * @author lu
 */
public class Ejercicio_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingresa tu nombre: ");
        String nombre = input.nextLine();
        
        System.out.println("Ingresa tu edad: ");
        int edad = Integer.parseInt(input.nextLine());
        
        System.out.println(nombre);
        System.out.println(edad);
    }
    
}
