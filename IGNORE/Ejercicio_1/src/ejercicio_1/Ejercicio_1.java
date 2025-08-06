/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_1;

import java.util.Scanner;

/**
 *
 * @author lu
 */
public class Ejercicio_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int anioDeNacimiento, anioActual, edadDelUsuario;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingrese su año de nacimiento: ");
        anioDeNacimiento = Integer.parseInt(input.nextLine());
        
        anioActual = 2025;
        
        edadDelUsuario = anioActual - anioDeNacimiento;
        
        System.out.println("Su edad es " + edadDelUsuario + " o " + (edadDelUsuario - 1) +  " años");
        
        
    }
    
}
