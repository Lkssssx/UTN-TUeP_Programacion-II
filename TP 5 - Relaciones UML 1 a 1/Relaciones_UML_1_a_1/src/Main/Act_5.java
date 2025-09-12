/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import java.util.Date;

/**
 * @author lu
 */

public class Act_5 {
    public class Computadora {
        private String marca;
        private String numeroSerie;
        private PlacaMadre placaMadre;
        private Propietario propietario;

        public Computadora(String marca, String numeroSerie, String modelo, String chipset) {
            this.marca = marca;
            this.numeroSerie = numeroSerie;
            this.placaMadre = new PlacaMadre(modelo, chipset);
        }
        
        public void setPropietario(Propietario titular) {
            this.propietario = titular;
            if (titular != null && titular.getComputadora() != this) {
                titular.setComputadora(this);
        }
    }

        public Propietario getPropietario() {
            return this.propietario;
        }

        @Override
        public String toString() {
            return "Computadora{" + "marca=" + marca + ", numeroSerie=" + numeroSerie + ", placaMadre=" + placaMadre + ", propietario=" + propietario + '}';
        }
    }
    
    
    
    public class PlacaMadre {
        private String modelo;
        private String chipset;

        public PlacaMadre(String modelo, String chipset) {
            this.modelo = modelo;
            this.chipset = chipset;
        }

        @Override
        public String toString() {
            return "PlacaMadre{" + "modelo=" + modelo + ", chipset=" + chipset + '}';
        }
        
}
    
    
    
    public class Propietario {
        private String nombre;
        private String dni;
        private Computadora computadora;

        public Propietario(String nombre, String dni) {
            this.nombre = nombre;
            this.dni = dni;
        }
        
        public void setComputadora(Computadora computadora) {
            this.computadora = computadora;
            if (computadora != null && computadora.getPropietario() != this) {
                computadora.setPropietario(this);
            }
        }
        
        public Computadora getComputadora() {
            return this.computadora;
        }

        @Override
        public String toString() {
            return "Propietario{" + "nombre=" + nombre + ", dni=" + dni + ", computadora=" + computadora + '}';
        }
    }
}
