import java.util.ArrayList;
import java.util.List;

public class Felipe {
    static class Tarea implements Comparable<Tarea> {
        private int prioridad;
        private int duracion;

        public Tarea(int duracion, int prioridad) {
            this.duracion = duracion;
            this.prioridad = prioridad;
        }

        @Override
        public String toString(){
            return prioridad + " - " + duracion;
        }
        @Override
        public int compareTo(Tarea other){
            if (this.prioridad == other.prioridad)
                return this.duracion - other.duracion;
            else
                return other.prioridad - this.prioridad;
        }
    }

    public static void main(String[] args) {
        List<Tarea> tareas = new ArrayList<>();
        tareas.add(new Tarea(10, 20));
        tareas.add(new Tarea(10, 5));
        tareas.add(new Tarea(20, 20));
        tareas.add(new Tarea(5, 20));
        tareas.stream().sorted().forEach(System.out::println);
    }
}
