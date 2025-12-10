import java.util.ArrayList;
import java.util.List;

public class JusticiaLoteria {
    static class Localidad implements Comparable<Localidad>{
        private int invertido;
        private int ganado;

        public Localidad(int invertido, int ganado) {
            this.invertido = invertido;
            this.ganado = ganado;
        }

        @Override
        public String toString(){
            return invertido + " " + ganado;
        }

        @Override
        public int compareTo(Localidad other){
            if (this.invertido == other.invertido){
                return other.ganado - this.ganado;
            }else {
                return other.invertido - this.invertido;
            }
        }
    }

    public static void main(String[] args) {
        List<Localidad> localidadList= new ArrayList<>();
        localidadList.add(new Localidad(100, 50));
        localidadList.add(new Localidad(200, 300));
        localidadList.add(new Localidad(100, 75));
        localidadList.add(new Localidad(300, 1000));

        localidadList.stream().sorted().forEach(System.out::println);
    }
}