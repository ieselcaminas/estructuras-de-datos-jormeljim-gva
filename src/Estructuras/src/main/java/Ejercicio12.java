import java.util.HashMap;
import java.util.Map;

public class Ejercicio12 {
    public static int parejasDePendientes(int[] pendientes) {
        Map<Integer, Integer> mapa = new HashMap<>();
        int cuantos;
        int parejas = 0;
        for (int numPendientes: pendientes) {
            cuantos = mapa.getOrDefault(numPendientes, 0);
            mapa.put(numPendientes, cuantos + 1);
        }
        for (int valor:mapa.values()) {
            parejas += valor/2;

        }
        return parejas;


    }
}
