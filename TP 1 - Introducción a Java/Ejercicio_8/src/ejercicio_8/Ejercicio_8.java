/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_8;

import java.util.Scanner;

/**
 *
 * @author lu
 */
public class Ejercicio_8 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingresa un número: ");
        int num1 = Integer.parseInt(input.nextLine());
        
        System.out.println("Ingresa otro número: ");
        int num2 = Integer.parseInt(input.nextLine());
        
        System.out.println(num1 / num2);
        System.out.println((double) num1 / num2);
    }
        
    
}
