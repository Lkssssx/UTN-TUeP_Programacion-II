/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication17;

/**
 *
 * @author lu
 */
public class recursividad {
    
    public static  void main(String[] args) {
        
        int n = 1000;
        System.out.println(factorialRecur(n));
        System.out.println(factorial(n));
    }
    
    static int factorial(int x) {
        int f = 1;
        for (int i = 1; i <= x; i++) {
            f*= i;
        }
        return f;
    }
    
    
        static int factorialRecur(int n) {
        if (n == 0) {
            return 1;
        } else {
            return factorialRecur(n-1) * n;
        }
    }
    
    
    
    
    
    
    
    
}
