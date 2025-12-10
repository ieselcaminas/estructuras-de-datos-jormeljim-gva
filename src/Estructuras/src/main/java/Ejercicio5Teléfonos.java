import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio5Teléfonos {
    public static void main(String[] args) {
        Map<String, String> telefonos = new HashMap<>();
        Scanner teclado = new Scanner(System.in);
        String contacto;

        telefonos.put("Jordi", "641 600 656");
        telefonos.put("Pepe", "654 321 789");
        telefonos.put("Anacleto", "666 666 666");
        telefonos.put("Messi", "610 101 010");

        System.out.print("Introduce el contacto: ");
        contacto = teclado.nextLine();

        System.out.println(telefonos.getOrDefault(contacto, "Contacto no encontrado"));

    }
}
