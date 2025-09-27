/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp_6_colecciones_y_sistema_de_stock.Caso_Practico_1;

/**
 *
 * @author lu
 */
public class Main {
    public static void main(String[] args) {
        
        // 1. Crear al menos cinco productos con diferentes categorías y agregarlos al inventario.
        Producto p1 = new Producto("095", "Fideos", 1500, 1, CategoriaProducto.ALIMENTOS);
        Producto p2 = new Producto("285", "Televisión", 500000, 1, CategoriaProducto.ELECTRONICA);
        Producto p3 = new Producto("391", "Silla de oficina", 70000, 1, CategoriaProducto.HOGAR);
        Producto p4 = new Producto("124", "Gorra roja", 15000, 1, CategoriaProducto.ROPA);
        Producto p5 = new Producto("859", "Arroz", 1000, 1, CategoriaProducto.ALIMENTOS);
        
        // 2. Listar todos los productos mostrando su información y categoría.
        System.out.println("2.");
        Inventario inventario = new Inventario();
        
        inventario.agregarProducto(p1);
        inventario.agregarProducto(p2);
        inventario.agregarProducto(p3);
        inventario.agregarProducto(p4);
        inventario.agregarProducto(p5);
        
        inventario.listarProductos();
        System.out.println("");

        // 3. Buscar un producto por ID y mostrar su información.
        System.out.println("3.");
        System.out.println("Producto con ID 095: ");
        inventario.buscarProductoPorId("095").mostrarInfo();
        System.out.println("");

        // 4. Filtrar y mostrar productos que pertenezcan a una categoría específica
        System.out.println("4.");
        System.out.println("El inventario de la categoria ALIMENTOS es de:" + inventario.filtrarPorCategoria(CategoriaProducto.ALIMENTOS));
        System.out.println("");

        // 5. Eliminar un producto por su ID y listar los productos restantes.
        System.out.println("5.");
        inventario.eliminarProducto("391");
        inventario.listarProductos();
        System.out.println("");

        // 6. Actualizar el stock de un producto existente.
        System.out.println("6.");
        inventario.actualizarStock("285", 10);
        System.out.println("");

        // 7. Mostrar el total de stock disponible
        System.out.println("7.");
        System.out.println("El total de stock es: " + inventario.obtenerTotalStock() + " productos.");
        System.out.println("");

        // 8. Obtener y mostrar el producto con mayor stock
        System.out.println("8.");
        System.out.println("El producto con mayor stock es: " + inventario.obtenerProductoConMayorStock());
        System.out.println("");

        // 9. Filtrar productos con precios entre $1000 y $3000.
        System.out.println("9.");
        System.out.println("Los productos con precios entre $1000 y $3000 son: " + inventario.filtrarProductosPorPrecio(1000, 3000));
        System.out.println("");
        
        // 10. Mostrar las categorías disponibles con sus descripciones.
        System.out.println("10.");
        inventario.mostrarCategoriasDisponibles();

        
    }
}
