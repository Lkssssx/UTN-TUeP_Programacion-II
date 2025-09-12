/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;


/**
 *
 * @author lu
 */
public class Act_11 {
    
    public class Reproductor {
        
        public void reproducir(Cancion cancion) {
            System.out.println("Iniciando reproducción...");
            iniciadorDeCancion(cancion);
        }
        
        private void iniciadorDeCancion(Cancion cancion) {
            System.out.println("Reproduciendo la canción: " + cancion.getTitulo());
            if (cancion.getArtista() != null) {
                System.out.println("El artista es es " + cancion.getArtista() + ".");
            } else {
                System.out.println("Esta canción no tiene asignado un artista.");
        }
      }
    }
    
    
    public class Cancion {
        private String titulo;
        private Artista artista;

        public Cancion(String titulo) {
            this.titulo = titulo;
        }

        public void setArtista(Artista artista) {
            this.artista = artista;
        }
        
        public String getTitulo() {
            return titulo;
        }

        public Artista getArtista() {
            return artista;
        }
        
        @Override
        public String toString() {
            return "Cancion{" + "titulo=" + titulo + ", artista=" + artista + '}';
        }
    }
    
    
    
    public class Artista {
        private String nombre;
        private String genero;

        public Artista(String nombre, String genero) {
            this.nombre = nombre;
            this.genero = genero;
        }

        @Override
        public String toString() {
            return "Artista{" + "nombre=" + nombre + ", genero=" + genero + '}';
        }
    }

}