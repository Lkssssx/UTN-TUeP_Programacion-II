/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication17;

import java.util.Scanner;

/**
 *
 * @author lu
 */
public class Ejercicio_1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
    
        int num1, num2;
        char simbolo;
        
        System.out.println("Ingresa número 1: ");
        num1 = Integer.parseInt(input.nextLine());
        
        System.out.println("Ingresa número 2: ");
        num2 = Integer.parseInt(input.nextLine());

        System.out.println("Operación: ");
        simbolo = input.nextLine().charAt(0);
    
        
        switch (simbolo) {
            case '+':
                System.out.println("Resultado: " + (num1 + num2));
                break;
            case '-':
                System.out.println("Resultado: " + (num1 - num2));
                break;
            case '/':
                if (num1 != 0 && num2 != 0) {
                    System.out.println("Resultado: " + ((double) num1 / num2));
                }
                break;
            case 'x':
            case 'X':
                System.out.println("Resultado: " + (num1 * num2));
                break;
            default:
                System.out.println("Opción invalida.");
                
        }
        
        
    }
}
