import java.util.ArrayList;
import java.util.List;

public class SumasNegativosPositivos {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>(List.of(1, 2, -3, 4, 5, -6, -7));

        long pos = numeros.stream()
                .filter(n -> n > 0)
                .count();

        long neg = numeros.stream()
                .filter(n -> n < 0)
                .count();

        int suma = numeros.stream()
                .mapToInt(Integer::valueOf)
                .sum();

        System.out.println("Numeros positivos: " + pos);
        System.out.println("Numeros negativos: " + neg);
        System.out.println("Suma total: " + suma);
    }
}