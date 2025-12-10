import java.util.ArrayList;
import java.util.List;

public class NinyosBuenos {
    static class Ninyos implements Comparable<Ninyos>{
        private int nivelBueno;
        private int pesoRegalos;

        public Ninyos(int nivelBueno, int pesoRegalos) {
            this.nivelBueno = nivelBueno;
            this.pesoRegalos = pesoRegalos;
        }

        @Override
        public String toString(){
            return nivelBueno + " " + pesoRegalos;
        }
        @Override
        public int compareTo(Ninyos other){
            if (this.nivelBueno == other.nivelBueno)
                return this.pesoRegalos - other.pesoRegalos;
            else
                return other.nivelBueno - this.nivelBueno;
        }
    }

    public static void main(String[] args) {
        List<Ninyos> ninyolist = new ArrayList<>();
        ninyolist.add(new Ninyos(80, 30));
        ninyolist.add(new Ninyos(80, 40));
        ninyolist.add(new Ninyos(50, 30));
        ninyolist.add(new Ninyos(90, 10));
        ninyolist.stream().sorted().forEach(System.out::println);

    }
}