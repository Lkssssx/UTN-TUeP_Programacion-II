/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp_6_colecciones_y_sistema_de_stock.Caso_Practico_1;

/**
 *
 * @author lu
 * Enum con las diferentes categorias y descripción del producto
 */
public enum CategoriaProducto {
    ALIMENTOS("Productos comestibles"),
    ELECTRONICA("Dispositivos electrónicos"),
    ROPA("Prendas de vestir"),
    HOGAR("Artículos para el hogar");
    
    private final String descripcion;
    
    
    CategoriaProducto(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
    public String getDescripcion() {
        return descripcion;
        }

    @Override
    public String toString() {
        return "CategoriaProducto{" + "name=" + name() + ", descripcion=" + descripcion + '}';
    }
    
    }