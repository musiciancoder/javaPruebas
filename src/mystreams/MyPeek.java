package mystreams;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MyPeek {


    public static void main(String[] args) {
        Stream.of("one", "two", "three", "four")
                .filter(e -> e.length() > 3)
                .peek(e -> System.out.println("Filtered value: " + e))
                .map(String::toUpperCase)
                .peek(e -> System.out.println("Mapped value: " + e)) //Peak es una operacion intermedia
                .forEach(e -> System.out.println("For each value: " + e)); //forEach es un void. es una operacion terminal! Notar que si sedcomentamos la siguiente linea, ya no funciona!
             //   .collect(Collectors.toList());
    }
}
