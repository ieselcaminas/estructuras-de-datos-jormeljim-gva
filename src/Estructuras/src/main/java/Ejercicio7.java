import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ejercicio7 {
    public static void main(String[] args) {
        ArrayList<String> boletos = new ArrayList<>(List.of("85789", "43285", "83349"));
        System.out.println(sorteo(boletos));
    }
    public static Map<Integer, Integer> sorteo(ArrayList<String> boletos){
        int ultimoDigito;
        Integer cuantos;
        Map<Integer, Integer> terminaciones = new HashMap<>();
        for (String boleto: boletos){
            ultimoDigito = Integer.parseInt("" + boleto.charAt(boleto.length() - 1));
            //Cogemos cuantos hay de terminación
            cuantos = terminaciones.get(ultimoDigito);
            //Si todavia no está, devolverá null
            if (cuantos == null){
                terminaciones.put(ultimoDigito, 1);
            }else {
                //Si sí está, en 'cuantos' tendremos la cantidad que hay hasta ahora
                terminaciones.put(ultimoDigito, cuantos + 1 );
            }
        }
        return terminaciones;
    }

}
