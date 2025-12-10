import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Ejemplo1 {
    class Pais implements Comparable<Pais>{
        String nombre;

        public String getNombre() {
            return nombre;
        }
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
        public int getAnalfabetos() {
            return analfabetos;
        }
        public void setAnalfabetos(int analfabetos) {
            this.analfabetos = analfabetos;
        }
        int analfabetos;
        public Pais(String nomrbre,int analfabetos){
            this.nombre = nomrbre;
            this.analfabetos = analfabetos;
        }

        @Override
        public String toString() {
            return nombre + " - " + analfabetos
        }

        @Override
        public int compareTo(Pais other) {
            return this.analfabetos - other.analfabetos;
        }

        public void main(String[] args) throws IOException {
            List<Pais> paisList = new ArrayList<>();
            BufferedReader br = new BufferedReader(new FileReader("/home/jormeljim/Documents"));
            String linea;
            String[] datos;
            Pais pais;
            br.readLine();
            String nombre;
            int analfabetos;
            while((linea = br.readLine()) !=null) {
                datos = linea.split(",");
                nombre = datos[5];
                analfabetos = Integer.parseInt("" + datos[8]);
                pais = new Pais(nombre, analfabetos);
                paisList.add(pais);
            }
            paisList.stream()
                    .sorted()
                    .forEach(System.out::println);
        }
    }
}
