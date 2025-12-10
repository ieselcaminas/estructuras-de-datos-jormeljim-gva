import java.util.ArrayList;
import java.util.List;

public class Problema3 {
    public static void main(String[] args) {
        Person persona = new Person("Juan", 1980);
        List<Person> personas = new ArrayList<>();
        personas.add(persona);
        persona = new Person("María", 1950);
        personas.add(persona);
        persona = new Person("Antonio", 1990);
        personas.add(persona);

        personas.stream()
                .map(Person::getName)
                .distinct()
                .sorted()
                .forEach(System.out::println);
    }
}
