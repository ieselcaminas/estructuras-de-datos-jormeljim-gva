import java.io.*;
import java.util.*;

public class Anagramas {
    public static void main(String[] args) throws IOException {
        Map<String, ArrayList<String>> mapa = new HashMap<>();
        BufferedReader reader = new BufferedReader(new FileReader("src/main/resources/spanish-dict.txt"));
        String palabra;
        String palabraOrdenada;
        ArrayList <String> listaActual;
        StringBuilder sb = new StringBuilder();
        int minGroupSize= 3;

        while ((palabra = reader.readLine())!=null) {
            //Trabajar con line
            palabraOrdenada = alphabetize(palabra);
            listaActual = mapa.getOrDefault(palabraOrdenada, new ArrayList<>());
            listaActual.add(palabra);
            mapa.put(palabraOrdenada, listaActual);
        }
        reader.close();
    }
    private static String alphabetize(String s) {
        char[] a = s.toCharArray();
        Arrays.sort(a);
        return new String(a);
    }
}
