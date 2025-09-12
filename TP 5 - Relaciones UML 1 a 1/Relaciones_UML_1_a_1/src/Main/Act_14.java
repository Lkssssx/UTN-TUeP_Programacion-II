/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

/**
 *
 * @author lu
 */
public class Act_14 {
    public class EditorVideo {

        public void exportar(String formato, Proyecto proyecto) {
            Render render = new Render(formato);
            render.setProyecto(proyecto);
            System.out.println("Exportación exitosa! El render quedó asi: " + render);
        }
    }

    public class Proyecto {

        private String nombre;
        private String duracionMin;

        public Proyecto(String nombre, String duracionMin) {
            this.nombre = nombre;
            this.duracionMin = duracionMin;
        }

        @Override
        public String toString() {
            return "Proyecto{" + "nombre=" + nombre + ", duracionMin=" + duracionMin + '}';
        }
    }

    public class Render {

        private String formato;
        private Proyecto proyecto;

        public Render(String formato) {
            this.formato = formato;
        }

        public void setProyecto(Proyecto proyecto) {
            this.proyecto = proyecto;
        }

        @Override
        public String toString() {
            return "Render{" + "formato=" + formato + ", proyecto=" + proyecto + '}';
        }
    }
}
