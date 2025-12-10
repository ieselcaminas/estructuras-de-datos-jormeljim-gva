import java.util.ArrayList;
import java.util.List;

public class Problema1 {
    public static void main(String[] args) {
        Person persona = new Person("Juan", 1980);
        List<Person> personas = new ArrayList<>();
        personas.add(persona);
        persona = new Person("María", 1950);
        personas.add(persona);
        persona = new Person("Antonio", 1990);
        personas.add(persona);

        long cuantas = personas.stream()
                .map(Person::getBirthYear)
                .filter(a -> a < 1978)
                .count();
        System.out.println(cuantas);
    }

}
