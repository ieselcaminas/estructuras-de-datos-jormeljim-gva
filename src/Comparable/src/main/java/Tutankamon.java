import java.util.ArrayList;
import java.util.List;

public class Tutankamon{
    static class Objeto implements Comparable<Objeto>{
        int id;
        String nombre;
        int valor;
        int peso;

        public Objeto(int id, String nombre, int valor, int peso) {
            this.id = id;
            this.nombre = nombre;
            this.valor = valor;
            this.peso = peso;
        }

        @Override
        public String toString(){
            return  id + " " + nombre + " " + valor + " " + peso;
        }
        @Override
        public int compareTo(Objeto other){
            if (this.valor == other.valor && this.peso == other.peso)
                return this.id - other.id;
            else if (this.valor == other.valor)
                return this.peso - other.peso;
            else
                return other.valor - this.valor;
        }

    }

    public static void main(String[] args) {
        List<Objeto> objetoList = new ArrayList<>();
        objetoList.add(new Objeto(1, "flecha", 5, 1));
        objetoList.add(new Objeto(2, "sandalis", 10, 2));
        objetoList.add(new Objeto(3, "sarcofago", 1000, 1000));
        objetoList.add(new Objeto(4, "mascara", 1000, 10));
        objetoList.add(new Objeto(5, "arco", 10, 2));
        objetoList.stream().sorted().forEach(System.out::println);
    }
}
