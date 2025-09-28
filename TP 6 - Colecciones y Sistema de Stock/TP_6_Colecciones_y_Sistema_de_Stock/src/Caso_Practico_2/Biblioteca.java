/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Caso_Practico_2;

import java.util.ArrayList;
import java.util.HashSet;

/**
 *
 * @author lu
 */
public class Biblioteca {
    private String nombre;
    private ArrayList<Libro> libros;
    private static int  totalLibros = 0;
    
    public Biblioteca(String nombre) {
        this.nombre = nombre;
        libros = new ArrayList<>();
    }
    
    
    
    public void agregarLibro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        this.libros.add(new Libro(isbn, titulo, anioPublicacion, autor));
        totalLibros++;
    }
    
    public void listarLibros() {
        System.out.println("Libros:");
        for (Libro libro : this.libros) {
            libro.mostrarInfo();
        }
    }
    
    public Libro buscarLibroPorIsbn(String isbn) {
        int i = 0;
        Libro libro = this.libros.get(i);
        
        while (!libro.getIsbn().equals(isbn) && i != this.libros.size()) {
            libro = this.libros.get(i);
            i++;
        }
        if (!libro.getIsbn().equals(isbn)) {
            return null;
        }
        return libro;
    }
    
    public void eliminarLibro(String isbn) {
        Libro libro = buscarLibroPorIsbn(isbn);
        System.out.println("Se elimino el libro: " + libro);
        this.libros.remove(libro);
        totalLibros--;
    }
    
    public int obtenerCantidadDeLibros() {
        return totalLibros;
        // return this.libros.size(); (Funciona también)
    }
    
    public ArrayList<Libro> filtrarLibrosPorAnio(int anio) {
        ArrayList<Libro> libros = new ArrayList<>();
        for (Libro libro : this.libros) {
            if (libro.getAnioPublicacion() == anio) {
                libros.add(libro);
            }
        }
        return libros;
    }
    
    public void mostrarAutoresDisponibles() {
        HashSet autores = new HashSet();
        
        for (Libro libro : this.libros) {
            autores.add(libro.getAutor().getNombre());
        }
        
        System.out.println("Autores disponibles: " + autores);
    }

    @Override
    public String toString() {
        return "Biblioteca{" + "nombre=" + nombre + ", libros=" + libros + '}';
    }
}
