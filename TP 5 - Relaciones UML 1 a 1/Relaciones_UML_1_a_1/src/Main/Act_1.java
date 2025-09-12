/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import java.util.Date;

/**
 *
 * @author lu
 */
public class Act_1 {
    
    public class Pasaporte {
        private String numero;
        private Date fechaEmision;
        private Foto foto;
        private Titular titular;

        public Pasaporte(String numero, Date fechaEmision, String imagen, String formato) {
            this.numero = numero;
            this.fechaEmision = fechaEmision;
            this.foto = new Foto(imagen, formato);
        }
        
        public void setTitular(Titular titular) {
            this.titular = titular;
            if (titular != null && titular.getPasaporte() != this) {
                titular.setPasaporte(this);
        }
    }

        public Titular getTitular() {
            return this.titular;
        }

        @Override
        public String toString() {
            return "Pasaporte{" + "numero=" + numero + ", fechaEmision=" + fechaEmision + ", foto=" + foto + ", titular=" + titular + '}';
        }
        
}
    
    public class Foto {
        private String imagen;
        private String formato;

        public Foto(String imagen, String formato) {
            this.imagen = imagen;
            this.formato = formato;
        }

        @Override
        public String toString() {
            return "Foto{" + "imagen=" + imagen + ", formato=" + formato + '}';
        }
    
}
    
    
    public class Titular {
        private String nombre;
        private String dni;
        private Pasaporte pasaporte;

        public Titular(String nombre, String dni) {
            this.nombre = nombre;
            this.dni = dni;
        }
        
        public void setPasaporte(Pasaporte pasaporte) {
            this.pasaporte = pasaporte;
            if (pasaporte != null && pasaporte.getTitular() != this) {
                pasaporte.setTitular(this);
            }
        }
        
        public Pasaporte getPasaporte() {
            return this.pasaporte;
        }

        @Override
        public String toString() {
            return "Titular{" + "nombre=" + nombre + ", dni=" + dni + ", pasaporte=" + pasaporte + '}';
        }
        
    }
    
}

