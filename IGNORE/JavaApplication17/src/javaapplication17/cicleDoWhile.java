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
public class cicleDoWhile {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int corte;
        int contador = -1;
        
        do {
            contador++;
            System.out.println("Ingrese un número");
            corte = Integer.parseInt(input.nextLine());

        } while (corte != 0 );
        
        System.out.println(contador);
    } 
}
