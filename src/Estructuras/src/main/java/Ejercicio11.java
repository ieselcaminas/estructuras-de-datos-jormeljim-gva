import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Ejercicio11 {
    public static void main(String[] args) throws IOException {
        Map<String, Integer> mapa = new HashMap<>();
        BufferedReader reader = new BufferedReader(new FileReader("src/main/resources/Colfuturo-Seleccionados.csv"));
        String linea;
        String[] palabras;
        String pais;
        int cuantos;
        while ((linea = reader.readLine())!=null) {
            palabras = linea.split(",");
            pais = palabras [6];
            cuantos = mapa.getOrDefault(pais, 0) + 1;
            mapa.put(pais, cuantos);
        }

        System.out.println(mapa.get("España"));

    }
}