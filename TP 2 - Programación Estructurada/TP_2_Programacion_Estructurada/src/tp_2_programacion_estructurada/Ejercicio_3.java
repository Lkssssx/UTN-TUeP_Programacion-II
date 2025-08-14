/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp_2_programacion_estructurada;

/**
 *
 * @author lu
 */
public class Ejercicio_3 {
    public static void main(String[] args) {
        int edad;
        String etapa;
        
        edad = Integer.parseInt(Utils.input("Ingrese su edad: "));
        
        if (edad < 12) {
            etapa = "Niño";
        } else if (edad >= 12 && edad <18) {
            etapa = "Adolesceente";
        } else if (edad >= 18 && edad < 60) {
            etapa = "Adulto";
        } else {
            etapa = "Adulto mayor";
        }
        
        System.out.println("Eres un " + etapa);
    }
}
