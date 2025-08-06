/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_2;

import java.util.Scanner;

/**
 *
 * @author lu
 */
public class Ejercicio_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double sueldoDiario, sueldoSemanal;
        final double CANT_JORNADAS_TRABAJADAS = 5.5;
        
        sueldoDiario = Double.parseDouble(input.nextLine());
        sueldoSemanal = sueldoDiario * CANT_JORNADAS_TRABAJADAS;

        System.out.println(sueldoSemanal);
        
    }
    
}
