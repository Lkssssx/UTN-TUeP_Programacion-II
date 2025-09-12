/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

/**
 *
 * @author lu
 */
public class Act_3 {
    public class Libro {
        private String titulo;
        private String isbn;
        private Autor autor;
        private Editorial editorial;

        public Libro(String titulo, String isbn, Autor autor, Editorial editorial) {
            this.titulo = titulo;
            this.isbn = isbn;
            this.editorial = editorial;
        }

        public void setAutor(Autor autor) {
            this.autor = autor;
        }

        @Override
        public String toString() {
            return "Libro{" + "titulo=" + titulo + ", isbn=" + isbn + ", autor=" + autor + ", editorial=" + editorial + '}';
        }
    }
    
    
    public class Autor {
        private String nombre;
        private String nacionalidad;

        public Autor(String nombre, String nacionalidad) {
            this.nombre = nombre;
            this.nacionalidad = nacionalidad;
        }

        @Override
        public String toString() {
            return "Autor{" + "nombre=" + nombre + ", nacionalidad=" + nacionalidad + '}';
        }
    }
    
    
    public class Editorial {
        private String nombre;
        private String direccion;

        public Editorial(String nombre, String direccion) {
            this.nombre = nombre;
            this.direccion = direccion;
        }

        @Override
        public String toString() {
            return "Editorial{" + "nombre=" + nombre + ", direccion=" + direccion + '}';
        }
    }
}
