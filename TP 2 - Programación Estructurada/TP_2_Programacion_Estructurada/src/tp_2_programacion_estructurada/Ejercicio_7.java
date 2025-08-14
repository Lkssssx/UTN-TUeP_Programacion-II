/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp_2_programacion_estructurada;

/**
 *
 * @author lu
 */
public class Ejercicio_7 {
    public static void main(String[] args) {
    int nota;
    
    do {
        nota = Integer.parseInt(Utils.input("Ingrese una nota: (0-10)"));
        
        if (nota > 10 || nota < 0) {
            System.out.println("Error: Nota inválida. Ingrese una nota entre 0 y 10");
        }
    } while (nota > 10 || nota < 0);
    
    
        System.out.println("Nota guardada correctamente.");
}
    
    
}