/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

/**
 *
 * @author lu
 */
public class Act_9 {
    public class CitaMedica {
        private String fecha;
        private String hora;
        private Paciente paciente;
        private ObraSocial obraSocial;

        public CitaMedica(String fecha, String hora) {
            this.fecha = fecha;
            this.hora = hora;
        }

        public void setPaciente(Paciente paciente) {
            this.paciente = paciente;
        }

        public void setObraSocial(ObraSocial obraSocial) {
            this.obraSocial = obraSocial;
        }

        @Override
        public String toString() {
            return "CitaMedica{" + "fecha=" + fecha + ", hora=" + hora + ", paciente=" + paciente + ", obraSocial=" + obraSocial + '}';
        }
    }
    
    
    
    public class Paciente {
        private String nombre;
        private String obraSocial;

        public Paciente(String nombre, String obraSocial) {
            this.nombre = nombre;
            this.obraSocial = obraSocial;
        }

        @Override
        public String toString() {
            return "Paciente{" + "nombre=" + nombre + ", obraSocial=" + obraSocial + '}';
        }
    }
    
    
    
    public class ObraSocial {
        private String nombre;
        private String especialidad;

        public ObraSocial(String nombre, String especialidad) {
            this.nombre = nombre;
            this.especialidad = especialidad;
        }

        @Override
        public String toString() {
            return "ObraSocial{" + "nombre=" + nombre + ", especialidad=" + especialidad + '}';
        }
    }
}
