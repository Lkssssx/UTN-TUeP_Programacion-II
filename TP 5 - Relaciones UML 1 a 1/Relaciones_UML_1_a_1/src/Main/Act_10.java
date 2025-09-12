/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

/**
 *
 * @author lu
 */
public class Act_10 {
    public class CuentaBancaria {

        private String cbu;
        private double saldo;
        private ClaveSeguridad claveSeguridad;
        private Titular titular;

        public CuentaBancaria(String cbu, double saldo, String codigo, String ultimaModificacion) {
            this.cbu = cbu;
            this.saldo = saldo;
            this.claveSeguridad = new ClaveSeguridad(codigo, ultimaModificacion);
        }

        public void setTitular(Titular titular) {
            this.titular = titular;
            if (titular != null && titular.getCuentaBancaria() != this) {
                titular.setCuentaBancaria(this);
            }
        }

        public Titular getTitular() {
            return this.titular;
        }

        @Override
        public String toString() {
            return "CuentaBancaria{" + "cbu=" + cbu + ", saldo=" + saldo + ", placaMadre=" + claveSeguridad + ", titular=" + titular + '}';
        }
    }
    
    

    public class ClaveSeguridad {

        private String codigo;
        private String ultimaModificacion;

        public ClaveSeguridad(String codigo, String ultimaModificacion) {
            this.codigo = codigo;
            this.ultimaModificacion = ultimaModificacion;
        }

        @Override
        public String toString() {
            return "ClaveSeguridad{" + "codigo=" + codigo + ", ultimaModificacion=" + ultimaModificacion + '}';
        }
    }

    
    
    public class Titular {

        private String nombre;
        private String dni;
        private CuentaBancaria cuentaBancaria;

        public Titular(String nombre, String dni) {
            this.nombre = nombre;
            this.dni = dni;
        }

        public void setCuentaBancaria(CuentaBancaria cuentaBancaria) {
            this.cuentaBancaria = cuentaBancaria;
            if (cuentaBancaria != null && cuentaBancaria.getTitular() != this) {
                cuentaBancaria.setTitular(this);
            }
        }

        public CuentaBancaria getCuentaBancaria() {
            return this.cuentaBancaria;
        }

        @Override
        public String toString() {
            return "Titular{" + "nombre=" + nombre + ", dni=" + dni + ", cuentaBancaria=" + cuentaBancaria + '}';
        }
    }
}
