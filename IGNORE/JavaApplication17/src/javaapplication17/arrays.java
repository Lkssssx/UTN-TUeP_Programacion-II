/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication17;

/**
 *
 * @author lu
 */
public class arrays {
    
    public static void main(String[] args) {
        int[] edades1 = new int[6];
        double[] precios1 = new double[6];
        boolean[] flags1 = new boolean[3];
        char[] simbolos1 = new char[5];
        String[] palabras1 = new String[2];
        
        
        int[] edades = {27, 12, 19, 33, 58, 61};
        double[] precios = {2.3, 5.6, 2.5, 7.0};
        boolean[] flags = {false, true};
        char[] simbolos = {'z', 'f'};
        String[] palabras = {"Loco", "Buenas"};

        System.out.println(precios[3]);
        precios[3] = 34.2;
        System.out.println(precios[3]);
        
        
        for (int i = 0; i < precios.length; i++) {
            double precio = precios[i];
            System.out.print(precio + "");
        }
        
        
        
        
    }
    
        
        
        

    
    
}
