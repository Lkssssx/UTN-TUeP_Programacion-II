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
public class ciclos_anidados {
    
    final static String CARACTER = "X ";
    
    public static  void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        
        int longitud = 0, altura = 0, cuenta;
        System.out.println("Ingrese la longitud: ");
        longitud = Integer.parseInt(input.nextLine());
        System.out.println("Ingrese la altura: ");
        altura = Integer.parseInt(input.nextLine());
                
        if (altura <= 0 || longitud <= 0) {
            System.out.println("ERROR. Ingrese solo números positivos.");
            System.exit(0);
        }
      
        for (altura = altura; altura != 0; altura--) {
             cuenta = longitud;
            while (cuenta > 0) {
                System.out.print(CARACTER);                     // AL REVES LOS BUCLES LOS HICE JAJAJA
                cuenta--;
            }
            System.out.println("");
           
        }
        
        
    }
}
