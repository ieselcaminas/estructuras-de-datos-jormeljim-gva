import java.util.ArrayList;
import java.util.List;

public class Media {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<Integer>(List.of(8, 6, 5, 6, 8, 6, 8, 6, 8, 6));
        float total = 0;

        for (int n: numeros ){
            total +=n;
        };
        float media = total /numeros.size();
        System.out.print(media);
    }
}
