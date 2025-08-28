/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo;

import java.util.Scanner;

/**
 *
 * @author lu
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Auto a = new Auto();
        
        System.out.println(a.patente + "  " + a.color + "  " + a.kms + "  " + a.conAire);
        a.patente = "ABC123";
        a.color = "Verde";
        a.kms = 500;
        a.conAire = true;
        System.out.println(a.patente + "  " + a.color + "  " + a.kms + "  " + a.conAire);

        Auto a2 = new Auto();
        
        a2.patente = "DEF456";
        a2.color = "Azul";
        a2.kms = 150;
        
        
        System.out.println(a2.patente + "  " + a2.color + "  " + a2.kms + "  " + a2.conAire);

        
        // 2.
        
        System.out.println(a);
        System.out.println(a2);

        Auto otroAuto;
        otroAuto = a;
        
        System.out.println(a);
        otroAuto.color = "Azul";
        System.out.println(a);

        
        // 3
        
        System.out.println("\n");
        
        CuentaBancaria cb = new CuentaBancaria();
        
        cb.mostrarDatos();
        
        double x = cb.getSaldo();
        
        System.out.println(x);
        cb.depositar(200);
        System.out.println(cb.getSaldo());
        cb.depositar(-200);
        System.out.println(cb.getSaldo());
        
       //System.out.println(cb.saldoDisponible(100));
        //System.out.println(cb.saldoDisponible(300));

        cb.extraer(180);
        System.out.println(cb.getSaldo());
        cb.extraer(100);
        System.out.println(cb.getSaldo());
        
        cb.setAlias("lkss");
        
        String alias = cb.getAlias();
        
        System.out.println(alias);
        
        
        
        
    }
    

    
    
}
