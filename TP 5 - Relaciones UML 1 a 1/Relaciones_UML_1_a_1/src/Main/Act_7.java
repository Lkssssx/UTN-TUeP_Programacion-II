/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

/**
 *
 * @author lu
 */
public class Act_7 {
    public class Vehiculo {

        private String patente;
        private String modelo;
        private Conductor conductor;
        private Motor motor;

        public Vehiculo(String patente, String modelo, Motor motor) {
            this.patente = patente;
            this.modelo = modelo;
            this.motor = motor;
            
        }

        public void setConductor(Conductor conductor) {
            this.conductor = conductor;
            if (conductor != null && conductor.getVehiculo() != this) {
                conductor.setVehiculo(this);
            }
        }

        public Conductor getConductor() {
            return conductor;
        }

        @Override
        public String toString() {
            return "Vehiculo{" + "patente=" + patente + ", modelo=" + modelo + ", conductor=" + conductor + ", motor=" + motor + '}';
        }
        
        
    }

    
    
    public class Conductor {

        private String nombre;
        private String licencia;
        private Vehiculo vehiculo;

        public Conductor(String nombre, String licencia) {
            this.nombre = nombre;
            this.licencia = licencia;
        }

        public Vehiculo getVehiculo() {
            return vehiculo;
        }

        public void setVehiculo(Vehiculo vehiculo) {
            this.vehiculo = vehiculo;
            if (vehiculo != null && vehiculo.getConductor() != this) {
                vehiculo.setConductor(this);
            }
        }

        @Override
        public String toString() {
            return "Conductor{" + "nombre=" + nombre + ", licencia=" + licencia + ", vehiculo=" + vehiculo + '}';
        }
    }

    
    
    public class Motor {

        private String tipo;
        private String numeroSerie;

        public Motor(String tipo, String numeroSerie) {
            this.tipo = tipo;
            this.numeroSerie = numeroSerie;
        }

        @Override
        public String toString() {
            return "Motor{" + "tipo=" + tipo + ", numeroSerie=" + numeroSerie + '}';
        }
    }
}
