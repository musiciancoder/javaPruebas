package myregex;

import java.util.ArrayList;
import java.util.List;

public class ComienzoDeUnaFrase {

    public static void main(String[] args) {
        List<String> frases2 = new ArrayList<>();
        frases2.add("I hI Im I");
        frases2.replaceAll(familiar -> familiar
                .replaceAll("^I", "*")); //elimina solo al comienzo de la frase

        frases2.forEach(System.out::println);

        System.out.println("--------------------------------");

        List<String> frases3 = new ArrayList<>();
        frases3.add("I hI Im I");


        frases3.replaceAll(familiar -> familiar
                .replaceFirst("I", "*")); //elimina solo al comienzo de la frase (lo mismo que el de arriba)

        frases3.forEach(System.out::println);

        System.out.println("--------------------------------");

    }
}
