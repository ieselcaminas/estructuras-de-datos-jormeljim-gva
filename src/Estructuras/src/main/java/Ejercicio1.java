import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        ArrayList<String> coches = new ArrayList<>();
        Scanner teclado = new Scanner(System.in);
        String coche;

        do{
            coche = teclado.nextLine();
            if (!coche.isEmpty()) coches.add(coche);
        }while (!coche.isEmpty());

        Collections.sort(coches);

        for (String c: coches){
            System.out.println(c);
        }
    }
}
