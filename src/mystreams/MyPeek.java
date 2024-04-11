package mystreams;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MyPeek {


    public static void main(String[] args) {
        //notar acá que recien comienza a pasar el segundo elemento cuando ha terminado de pasar el primer elemento hasta el final
        Stream.of("one", "two", "three", "four")
                .filter(e -> e.length() > 3)
                .peek(e -> System.out.println("Filtered value: " + e)) //peek sirve solo para debugear adonde vamos en el stream.
                .map(String::toUpperCase) //notar q a pesar que no estamos cambiando de tipo, igual usamos map y no forEach, porque vamos a seguir con las dos lineas de mas abajo y por lo tanto esta es una operacion intermedia y no final
                .peek(e -> System.out.println("Mapped value: " + e)) //Peak es una operacion intermedia
                .forEach(e -> System.out.println("For each value: " + e)); //forEach es un void. es una operacion terminal! Notar que si sedcomentamos la siguiente linea, ya no funciona!
             //   .collect(Collectors.toList());
    }
}
