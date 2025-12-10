import java.util.ArrayList;
import java.util.List;
public class Ahorcado {
    public static void main(String[] args) {

        System.out.println(ahorcado(6,"hola","a"));
    }

    public static int ahorcado (int maxFallos, String palabraOculta, String letrasPropuestas){
        List<Character> letrasJugadas = new ArrayList<>();

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
                letrasJugadas.add(letra);
            }
            if (letrasOcultas.isEmpty()) return 1;
            else if (fallosJugador == maxFallos) return 2;
        }
        return 3;
    }

}