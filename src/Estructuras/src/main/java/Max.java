import java.util.ArrayList;
import java.util.List;

public class Max {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<Integer>(List.of(9, 4, 5, 6, 10, 1, 3));
        System.out.println(maximo(numeros));
    }
    public static int maximo(List<Integer> lista){
        int maximo = Integer.MIN_VALUE;
        for (Integer numero: lista){
            if (numero>maximo) maximo = numero;
        }
        return maximo;
    }
}
