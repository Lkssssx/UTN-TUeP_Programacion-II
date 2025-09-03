/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp_4_poo_2;

/**
 *
 * @author lu
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creamos los objetos o instancias
        Empleado e = new Empleado(1, "Juan", "Desarrollador Junior", 1100);
        Empleado e2 = new Empleado("Luisa", "Recursos Humanos");
        Empleado e3 = new Empleado(3, "Jose", "Desarrollador Senior", 3000);
        Empleado e4 = new Empleado("Kiko", "Seguridad");
        
        // Mostramos los datos que hay en cada uno de forma ordenada y clara
        System.out.println(e.toString());
        System.out.println(e2.toString());
        System.out.println(e3.toString());
        System.out.println(e4.toString() + "\n");
        
        // Actualizamos sus salarios mediante porcentajes o cantidades fiijas
        e.actualizarSalario(12.5);     // Porcentaje (double)
        e2.actualizarSalario(100);    // Cantidad Fija (int)
        e3.actualizarSalario(200);    // Cantidad Fija (int)
        e4.actualizarSalario(50.0);   // Porcentaje (double)
        
        // Mostramos los datos nuevamente de manera mas sencilla y corta
        System.out.println("\n" + e + "\n" + e2 + "\n" + e3 + "\n" + e4);
        
        // Mostramos el total de empleados
        System.out.println("\nEl total de empleados son: " + Empleado.mostrarTotalEmpleados());
        
    }
    
}
