/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp_6_colecciones_y_sistema_de_stock.Caso_Practico_1;

import java.util.ArrayList;
import java.util.HashSet;

/**
 *
 * @author lu
 */
public class Inventario {
    private ArrayList<Producto> productos;

    public Inventario() {
        productos = new ArrayList<>();
    }
    
    
    
    // Metodos
    
    public void agregarProducto(Producto p) {
        this.productos.add(p);
    }
    
    public void listarProductos() {
        for (Producto p : this.productos) {
            p.mostrarInfo();
        }
    }
    
    public Producto buscarProductoPorId(String id) {
        int i = 0;
        Producto producto = this.productos.get(i);
        
        while (!producto.getId().equals(id) && i != this.productos.size()) {
            producto = this.productos.get(i);
            i++;
        }
        
        if (producto.getId().equals(id)) {
            return producto;
        } else {
            return null;
        }
        
    }
    
    public void eliminarProducto(String id) {
        Producto producto = buscarProductoPorId(id);
        if (producto != null) {
            System.out.println("El producto: " + producto + " se borró correctamente");
            productos.remove(producto);
        } else {
            System.out.println("No se encontro el producto con id: " + id);
        }
    }
    
    public void actualizarStock(String id, int nuevaCantidad) {
        Producto producto = buscarProductoPorId(id);
        producto.setCantidad(nuevaCantidad);
        
        System.out.println("Cantidad de stock actualizada para el producto: " + producto);
    }
    
    public ArrayList<Producto> filtrarPorCategoria(CategoriaProducto categoria) {
        ArrayList<Producto> productos = new ArrayList<>();
        
        for (Producto p : this.productos) {
            if (p.getCategoria().equals(categoria)) {
                productos.add(p);
            }
        }
        return productos;
    }
    
    public int obtenerTotalStock() {
        int totalStock = 0;
        
        for (Producto p : this.productos) {
            totalStock += p.getCantidad();
        }
        return totalStock;
    }
    
    public Producto obtenerProductoConMayorStock() {
        Producto productoMayorStock = this.productos.get(0);
        int mayorStock = productoMayorStock.getCantidad();

        for (Producto p : this.productos) {
            if (p.getCantidad() > mayorStock) {
                mayorStock = p.getCantidad();
                productoMayorStock = p;
            }
        }
        return productoMayorStock;
    }
    
    public ArrayList<Producto> filtrarProductosPorPrecio(double min, double max) {
        ArrayList<Producto> productos = new ArrayList<>();
        
        for (Producto p : this.productos) {
            if (p.getPrecio() >= min && p.getPrecio() <= max) {
                productos.add(p);
            }
        }
        return productos;
    }
    
    public void mostrarCategoriasDisponibles() {
        HashSet<CategoriaProducto> categoriasDisponibles = new HashSet<>();

        for (Producto p : this.productos) {
            if (categoriasDisponibles.size() < CategoriaProducto.values().length) {
                categoriasDisponibles.add(p.getCategoria());
            }
        }
        System.out.println("Las categorías disponibles son: " + categoriasDisponibles);
    }
    
    
    
}
