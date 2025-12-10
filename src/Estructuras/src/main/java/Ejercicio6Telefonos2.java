import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio6Telefonos2 {
    public static void main(String[] args) {
        Map<String, ArrayList<String>> agenda = new HashMap<>();
        ArrayList <String> telefonos = new ArrayList<>();
        String contacto;
        Scanner teclado = new Scanner(System.in);

        telefonos.add("65748428");
        telefonos.add("62542845");
        agenda.put("Pepe", telefonos);

        telefonos = new ArrayList<>();
        telefonos.add("666666666");
        telefonos.add("654321798");
        agenda.put("María", telefonos);

        System.out.println("Introduce el contacto: ");
        contacto = teclado.nextLine();
        if (agenda.containsKey(contacto))
            System.out.println(agenda.get(contacto));
        else System.out.println("No se puede encontrar el contacto");
    }
}