package mystreams;

import java.util.Arrays;
import java.util.List;

public class MyForEach {

    //Recomendada para realizar operaciones como imprimir algo (o sea tipo void)

    public static void main(String[] args) {
        List<String> Personas = Arrays.asList("Andres", "Edgardo", "Claudio");

        //Forma convencional
        System.out.println("Forma convencional");
        for (String persona:Personas
             ) {
            System.out.println(persona);
        }

        //Forma con streams
        System.out.println("Forma con streams");
       // Personas.stream().forEach(persona -> System.out.println(persona)); //sintaxis antigua
        Personas.forEach(System.out::println); //sintaxis nueva
    }

}
