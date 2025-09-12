/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

/**
 *
 * @author lu
 */
public class Act_13 {
    public class GeneradorQR {
        
        public void generar(String valor, Usuario usuario) {
            CodigoQR codigoQR = new CodigoQR(valor);
            codigoQR.setUsuario(usuario);
            System.out.println("Generación Exitosa! El código QR y el usuario son: " + codigoQR);
        }
    }
    
    
    
    public class Usuario {
        private String nombre;
        private String mail;

        public Usuario(String nombre, String mail) {
            this.nombre = nombre;
            this.mail = mail;
        }  

        @Override
        public String toString() {
            return "Usuario{" + "nombre=" + nombre + ", mail=" + mail + '}';
        }
    }
    
    
    
    public class CodigoQR {
        private String valor;
        private Usuario usuario;

        public CodigoQR(String valor) {
            this.valor = valor;
        }

        public void setUsuario(Usuario usuario) {
            this.usuario = usuario;
        }

        @Override
        public String toString() {
            return "CodigoQR{" + "valor=" + valor + ", usuario=" + usuario + '}';
        }
    }
}
