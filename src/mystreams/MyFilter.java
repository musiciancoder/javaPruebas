package mystreams;

import java.util.Arrays;
import java.util.List;

public class MyFilter {

    public static void main(String[] args) {
        List<String> Personas = Arrays.asList("Andres", "Edgardo", "Claudio");
        Personas.stream()
                .filter(persona->persona.equals("Edgardo"))
                .forEach(System.out::println);

        Personas.stream()
                .filter((persona->!persona.equals("Edgardo")))
                .forEach(System.out::println);
    }
}
