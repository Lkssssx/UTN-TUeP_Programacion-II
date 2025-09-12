/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

/**
 *
 * @author lu
 */
public class Act_4 {
    
    public class TarjetaDeCredito {

        private String numero;
        private String fechaVencimiento;;
        private Cliente cliente;
        private Banco banco;

        public TarjetaDeCredito(String numero, String fechaVencimiento) {
            this.numero = numero;
            this.fechaVencimiento = fechaVencimiento;
        }

        public void setCliente(Cliente usuario) {
            this.cliente = usuario;
            if (usuario != null && usuario.getTarjetaDeCredito() != this) {
                usuario.setTarjetaDeCredito(this);
            }
        }

        public Cliente getCliente() {
            return cliente;
        }

        @Override
        public String toString() {
            return "TarjetaDeCredito{" + "numero=" + numero + ", fechaVencimiento=" + fechaVencimiento + ", cliente=" + cliente + ", banco=" + banco + '}';
        }
    }
    
    

    public class Cliente {

        private String nombre;
        private String dni;
        private TarjetaDeCredito tarjetaDeCredito;

        public Cliente(String nombre, String dni) {
            this.nombre = nombre;
            this.dni = dni;
        }

        public TarjetaDeCredito getTarjetaDeCredito() {
            return tarjetaDeCredito;
        }

        public void setTarjetaDeCredito(TarjetaDeCredito tarjetaDeCredito) {
            this.tarjetaDeCredito = tarjetaDeCredito;
            if (tarjetaDeCredito != null && tarjetaDeCredito.getCliente() != this) {
                tarjetaDeCredito.setCliente(this);
            }
        }

        @Override
        public String toString() {
            return "Cliente{" + "nombre=" + nombre + ", dni=" + dni + ", tarjetaDeCredito=" + tarjetaDeCredito + '}';
        }
    }

    
    
    public class Banco {

        private String nombre;
        private String cuit;

        public Banco(String nombre, String cuit) {
            this.nombre = nombre;
            this.cuit = cuit;
        }

        @Override
        public String toString() {
            return "Banco{" + "nombre=" + nombre + ", cuit=" + cuit + '}';
        }
    }
}
