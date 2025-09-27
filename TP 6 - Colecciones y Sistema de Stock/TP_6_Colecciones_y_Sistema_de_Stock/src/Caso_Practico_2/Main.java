/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Caso_Practico_2;

/**
 *
 * @author lu
 */
public class Main {
    public static void main(String[] args) {
//      1. Creamos una biblioteca.
        Biblioteca biblioteca = new Biblioteca("Biblioteca Jose");
        System.out.println("");
        
//      2. Crear al menos tres autores.
        Autor autor1 = new Autor("1", "Luis Jose", "Argentina");
        Autor autor2 = new Autor("2", "Bob Ross", "Estados Unidos");
        Autor autor3 = new Autor("3", "Mario Vigosky", "Polonia");
        System.out.println("");
        
//      3. Agregar 5 libros asociados a alguno de los Autores a la biblioteca.
        biblioteca.agregarLibro("100", "Las pesadillas", 2012, autor3);
        biblioteca.agregarLibro("110", "El nunca jamas", 2020, autor2);
        biblioteca.agregarLibro("120", "El oso", 2001, autor1);
        biblioteca.agregarLibro("130", "Bajo el mismo cielo", 2025, autor3);
        biblioteca.agregarLibro("140", "Tiempo de los magos", 2001, autor3);
        
//      4. Listar todos los libros con su información y la del autor.
        System.out.println("4.");
        biblioteca.listarLibros();
        System.out.println("");
        
//      5. Buscar un libro por su ISBN y mostrar su información.
        System.out.println("5");
        System.out.println("Libro con la isbn de 110: " + biblioteca.buscarLibroPorIsbn("110"));
        System.out.println("");
        
//      6. Filtrar y mostrar los libros publicados en un año específico.
        System.out.println("6.");
        System.out.println("Libros publicados en 2001: " + biblioteca.filtrarLibrosPorAnio(2001));
        System.out.println("");
        
//      7. Eliminar un libro por su ISBN y listar los libros restantes.
        System.out.println("7.");
        biblioteca.eliminarLibro("100");
        biblioteca.listarLibros();
        System.out.println("");
        
//      8. Mostrar la cantidad total de libros en la biblioteca.
        System.out.println("8");
        System.out.println("Hay " + biblioteca.obtenerCantidadDeLibros() + " libros en la biblioteca.");
        System.out.println("");
        
//      9. Listar todos los autores de los libros disponibles en la biblioteca
        System.out.println("9.");
        biblioteca.mostrarAutoresDisponibles();
        
    }
}
