import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Map<String, String> paises = new HashMap<>();
        Scanner teclado = new Scanner(System.in);
        String pais;

        paises.put("España", "Madrid");
        paises.put("Francia", "París");
        paises.put("Alemania", "Berlín");
        paises.put("Italia", "Roma");
        paises.put("Paises Bajos", "Ámsterdam");
        paises.put("inglaterra", "Londres");
        System.out.print("Introduce un  país: ");
        pais = teclado.nextLine();

        System.out.printf(paises.getOrDefault(pais, "País no encontrado"));

    }
}
