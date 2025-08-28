/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo;

/**
 *
 * @author lu
 */
public class CuentaBancaria {
    
    private String CBU;
    private String alias;
    private double saldo;
    
    
    public void mostrarDatos() {
        System.out.println(CBU + " " + alias + " " + saldo);
    }

    public String getCBU() {
        return CBU;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        if (alias != null) {
            this.alias = alias;
        }
    }

    public double getSaldo() {
        return saldo;
    }

    
    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
        } else {
            System.out.println("No se puede agregar saldo negativo");
        }
        
    }
    
       private boolean saldoDisponible(double monto) {
        return saldo >= monto;
    }
    
    public void extraer(double monto) {
        if (saldoDisponible(monto)) {
            saldo -= monto;
        }
    }
    
    
    
}
