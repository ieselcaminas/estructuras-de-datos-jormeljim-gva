import java.util.ArrayList;
import java.util.Collections;

public class Inicio {
    public static void main(String[] args) {
        ArrayList<String> coches = new ArrayList<>();
        coches.add("SeaT");
        coches.add("Volvo");
        coches.add("Fiat");
        System.out.println(coches.get(1));
        System.out.printf("Existen %d coches%n", coches.size());
        //coches.remove(0);

        //Sustituir SeaT por Seat
        coches.set(0, "Seat");


        //Existe Seat y Renault en la lista?
        System.out.println(coches.contains("Seat"));
        System.out.println(coches.contains("Reanault"));

        for(String coche: coches){
            System.out.println(coche);
        }

        //Orednado
        Collections.sort(coches);
        for(String coche: coches){
            System.out.println(coche);
        }


    }
}
