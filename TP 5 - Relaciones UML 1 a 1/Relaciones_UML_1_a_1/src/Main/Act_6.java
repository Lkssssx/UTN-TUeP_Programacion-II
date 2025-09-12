/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

/**
 *
 * @author lu
 */
public class Act_6 {
    public class Reserva {

        private String fecha;
        private String hora;
        private Cliente cliente;
        private Mesa mesa;

        public Reserva(String titulo, String hora, Mesa mesa) {
            this.fecha = titulo;
            this.hora = hora;
            this.mesa = mesa;
        }

        public void setCliente(Cliente cliente) {
            this.cliente = cliente;
        }

        @Override
        public String toString() {
            return "Reserva{" + "fecha=" + fecha + ", hora=" + hora + ", cliente=" + cliente + ", mesa=" + mesa + '}';
        }
        
    }
    
    
    
    public class Cliente {
        
        private String nombre;
        private String telefono;
        
        public Cliente(String nombre, String telefono) {
            this.nombre = nombre;
            this.telefono = telefono;
        }

        @Override
        public String toString() {
            return "Cliente{" + "nombre=" + nombre + ", telefono=" + telefono + '}';
        }

    }

    
    
    public class Mesa {

        private String numero;
        private int capacidad;

        public Mesa(String numero, int capacidad) {
            this.numero = numero;
            this.capacidad = capacidad;
        }

        @Override
        public String toString() {
            return "Mesa{" + "numero=" + numero + ", capacidad=" + capacidad + '}';
        }
    }
    
}
