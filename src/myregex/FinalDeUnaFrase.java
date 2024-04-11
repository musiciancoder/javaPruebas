package myregex;

import java.util.ArrayList;
import java.util.List;

public class FinalDeUnaFrase {
    public static void main(String[] args) {
        List<String> frases2 = new ArrayList<>();
        frases2.add("espanaes alesia andres");

        frases2.replaceAll(familiar -> familiar
                .replaceAll("es$", "*")); //espanaes alesia andr* --> elimina el final de la frase, pero no el final de cada string
        frases2.forEach(System.out::println);

        List<String> frases3 = new ArrayList<>();
        frases3.add("espana alesia andres");

        System.out.println("--------------------------------");

        frases3.replaceAll(familiar -> familiar
                .replaceAll("^a", "*")); //no hace nada esto!!
        frases3.forEach(System.out::println);

        System.out.println("--------------------------------");



    }
}
