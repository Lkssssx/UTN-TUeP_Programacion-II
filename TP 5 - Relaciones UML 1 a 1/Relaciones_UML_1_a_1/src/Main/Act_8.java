/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

/**
 *
 * @author lu
 */
public class Act_8 {
    
    public class Documento {
        private String titulo;
        private String contenido;
        private FirmaDigital firmaDigital;
        private Usuario usuario;

        public Documento(String titulo, String contenido, String codigoHash, String fecha, Usuario usuario) {
            this.titulo = titulo;
            this.contenido = contenido;
            this.firmaDigital = new FirmaDigital(codigoHash, fecha);
            this.usuario = usuario;
        }

        @Override
        public String toString() {
            return "Documento{" + "titulo=" + titulo + ", contenido=" + contenido + ", firmaDigital=" + firmaDigital + ", usuario=" + usuario + '}';
        }
    }
    
    
    
    public class FirmaDigital {
        private String codigoHash;
        private String fecha;

        public FirmaDigital(String codigoHash, String fecha) {
            this.codigoHash = codigoHash;
            this.fecha = fecha;
        }

        @Override
        public String toString() {
            return "FirmaDigital{" + "codigoHash=" + codigoHash + ", fecha=" + fecha + '}';
        }
    }
    
    
    
    public class Usuario {
        private String nombre;
        private String email;

        public Usuario(String nombre, String email) {
            this.nombre = nombre;
            this.email = email;
        }

        @Override
        public String toString() {
            return "Usuario{" + "nombre=" + nombre + ", email=" + email + '}';
        }
    }
}
