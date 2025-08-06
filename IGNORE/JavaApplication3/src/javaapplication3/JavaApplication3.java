/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication3;

import java.util.Scanner;

/**
 *
 * @author lu
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        
        System.out.println("Ingresa tu edad: ");
        int edad;
        edad = Integer.parseInt(input.nextLine());
        
        System.out.println("Ingresa tu estatura: ");
        double estatura;
        estatura = Double.parseDouble(input.nextLine());
        
        System.out.println("Ingresa tu nombre: ");
        String nombre;
        nombre = input.nextLine();
        
        String saludo;
        saludo = "Buenas " + nombre;
        
        System.out.println(saludo);
        System.out.println(edad);
        System.out.println(estatura);
        
        
        
    }
    
}
