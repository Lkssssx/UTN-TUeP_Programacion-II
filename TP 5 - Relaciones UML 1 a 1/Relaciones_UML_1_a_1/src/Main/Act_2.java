/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

/**
 *
 * @author lu
 */
public class Act_2 {
        public class Celular {
            private String imei;
            private String marca;
            private String modelo;
            private Usuario usuario;
            private Bateria bateria;
            
            public Celular(String imei, String marca, String modelo, Bateria bateria) {
                this.imei = imei;
                this.marca = marca;
                this.modelo = modelo;
                this.bateria = bateria;
            }
            
            public void setUsuario(Usuario usuario) {
                this.usuario = usuario;
                if (usuario != null && usuario.getCelular() != this) {
                    usuario.setCelular(this);
                }
            }

        public Usuario getUsuario() {
            return usuario;
        }

        @Override
        public String toString() {
            return "Celular{" + "imei=" + imei + ", marca=" + marca + ", modelo=" + modelo + ", usuario=" + usuario + ", bateria=" + bateria + '}';
        }
        
}
        
        
        public class Usuario {
            private String nombre;
            private String dni;
            private Celular celular;

            public Usuario(String nombre, String dni) {
                this.nombre = nombre;
                this.dni = dni;
            }

            public Celular getCelular() {
                return celular;
            }

            public void setCelular(Celular celular) {
                    this.celular = celular;
                    if (celular != null && celular.getUsuario() != this) {
                        celular.setUsuario(this);
                    }
                }

        @Override
        public String toString() {
            return "Usuario{" + "nombre=" + nombre + ", dni=" + dni + ", celular=" + celular + '}';
        }
}

        
        public class Bateria {
            private String modelo;
            private int capacidad;

        public Bateria(String modelo, int capacidad) {
            this.modelo = modelo;
            this.capacidad = capacidad;
    }

        @Override
        public String toString() {
            return "Bateria{" + "modelo=" + modelo + ", capacidad=" + capacidad + '}';
        }
    }
}