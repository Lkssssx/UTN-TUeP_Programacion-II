/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication17;

/**
 *
 * @author lu
 */
public class Ejercicio_funciones {
    
    public static void main(String[] args) {
        imprimirSimbolo('x', 5);
        imprimirSimbolo('G', 10);
        imprimirSimbolo('R', 3);
        
        String s = sucesionSimbolo('#', 7);
        
        System.out.println(s);
    }
    
    static void imprimirSimbolo(char simbolo, int veces) {
        System.out.println(sucesionSimbolo(simbolo, veces));
    }
    
    /**
     * Retorna una impresión de un simbolo N veces
     * @param simbolo El simbolo a repetir
     * @param veces La cantidad de veces que se repetirá
     * @return Impresión del simbolo N veces
     */
    static String sucesionSimbolo(char simbolo, int veces) {
        String sucesion = "";
        for (int i = 0; i < veces; i++) {
            sucesion += simbolo;
        }
        return sucesion;
    }
    

    
    
}
