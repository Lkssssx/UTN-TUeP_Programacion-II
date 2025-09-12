/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

/**
 *
 * @author lu
 */
public class Act_12 {
    
    public class Calculadora {
        
        public void calcular(Impuesto impuesto) {
            System.out.println("El impuesto es de " + impuesto.getMonto());
            if (impuesto.getContribuyente() != null) {
                System.out.println("El contribuyente es " + impuesto.getContribuyente() + ".");
            } else {
                System.out.println("El impuesto no tiene contribuyente.");
            }
        }
    }
    
    
    
    public class Impuesto {
        private double monto; 
        private Contribuyente contribuyente;

        public Impuesto(double monto) {
            this.monto = monto;
        }

        public void setContribuyente(Contribuyente contribuyente) {
            this.contribuyente = contribuyente;
        }

        public double getMonto() {
            return monto;
        }

        public Contribuyente getContribuyente() {
            return contribuyente;
        }
        
        @Override
        public String toString() {
            return "Impuesto{" + "monto=" + monto + ", contribuyente=" + contribuyente + '}';
        }
    }
    
    
    
    public class Contribuyente {
        
        private String nombre;
        private String cuil;

        public Contribuyente(String nombre, String cuil) {
            this.nombre = nombre;
            this.cuil = cuil;
        }

        @Override
        public String toString() {
            return "Contribuyente{" + "nombre=" + nombre + ", cuil=" + cuil + '}';
        }
    }
}
