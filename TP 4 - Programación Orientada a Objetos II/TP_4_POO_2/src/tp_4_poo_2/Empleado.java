/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp_4_poo_2;

/**
 *
 * @author lu
 */
public class Empleado {
    private int id;
    private String nombre;
    private String puesto;
    private double salario;
    private static int totalEmpleados;

    // Constructor que recibe todos los atributos
    public Empleado(int id, String nombre, String puesto, double salario) {
        Empleado.totalEmpleados += 1;
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
    }
    
    // Constructor que recibe solo nombre y puesto, asignando un id automático y un salario por defecto
    public Empleado(String nombre, String puesto) {
        Empleado.totalEmpleados += 1;
        this.id = generarId();
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = 1000;
    }
    
    // Metodo sobrecargado para actualizar el salario
    public void actualizarSalario(double porcentajeAumento) {
        this. salario += this.salario * (porcentajeAumento / 100);
        System.out.println("El salario se incremento correctamente. Nuevo salario: " + this.salario);
    }
    
    public void actualizarSalario(int cantidadFija) {
        this.salario += cantidadFija;
        System.out.println("El salario se incremento correctamente. Nuevo salario: " + this.salario);
    }
    
    // Metodo privado para generar el ID si se es requerido
    private int generarId() {
        return totalEmpleados;
    }
    
    // Getters y Setters
    public int getId() {
        return id;
    }
    
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuesto() {
        return this.puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public double getSalario() {
        return this.salario;
    }

    public static int mostrarTotalEmpleados() {
        return Empleado.totalEmpleados;
    }

    // toString para mostrar los datos correctamente y no su referencia en memoria
    @Override
    public String toString() {
            return "Empleado{" + "id=" + id + ", nombre=" + nombre + ", puesto=" + puesto + ", salario=" + salario + '}';
    }
    
    
    
    
}
