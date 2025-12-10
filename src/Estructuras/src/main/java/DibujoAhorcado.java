import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DibujoAhorcado {
    /*public static void main(String[] args) {
        int maxFallos = 6;

        Scanner teclado = new Scanner(System.in);
        String propuesta;

        System.out.print("Escribe tu opción: ");
        propuesta = teclado.nextLine();
        int numFallos = dibujarAhorcado(maxFallos, "buenas", propuesta);

        System.out.println("Fallos: " + numFallos);
        System.out.println(Colors.RED.get() + dibujarAhorcado(numFallos));
        System.out.println("------------------------");

    }

    public static String dibujarAhorcado(int fallos, String palabraOculta, String letrasPropuestas) {
        // fallos esperados: 0 a 6
        StringBuilder sb = new StringBuilder();

        List<Character> letrasOcultas = new ArrayList<>();
        int fallosJugador = 0;

        for (Character c: palabraOculta.toCharArray()){
            if (!letrasOcultas.contains(c))
                letrasOcultas.add(c);
        }

        for (Character letra: letrasPropuestas.toCharArray()){
            if (!letrasOcultas.contains(letra)){
                fallosJugador ++;
            }else {
                letrasOcultas.remove(letra);
            }
        }
        return fallosJugador;

        sb.append("  +---+\n");
        sb.append("  |   |\n");

        // Cabeza
        if (fallos >= 1) sb.append("  O   |\n");
        else sb.append("      |\n");

        // Parte superior del cuerpo (brazo izq y derecho)
        if (fallos == 2) sb.append("  |   |\n");
        else if (fallos == 3) sb.append(" /|   |\n");
        else if (fallos >= 4) sb.append(" /|\\  |\n");
        else sb.append("      |\n");

        // Parte inferior del cuerpo
        if (fallos >= 5) sb.append("  |   |\n");
        else sb.append("      |\n");

        // Piernas
        if (fallos >= 6) sb.append(" / \\  |\n");
        else sb.append("      |\n");

        sb.append("      |\n");
        sb.append("=========\n");

        return sb.toString();
    }*/

}