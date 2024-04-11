package myregex;

import java.util.ArrayList;
import java.util.List;

public class Rangos {

    public static void main(String[] args) {
        List<String> frases2 = new ArrayList<>();
        frases2.add("Tom");

        frases2.replaceAll(familiar -> familiar
                .replaceAll("^[Tm]", "*")); //reemplaza tod lo que no es T o m
        frases2.forEach(System.out::println);

        System.out.println("--------------------------------");
        List<String> frases3 = new ArrayList<>();
        frases3.add("HOLA, no soy un abad");
        frases3.replaceAll(familiar -> familiar
                .replaceAll("[a-d]", "*")); //reemplaza de la a hasta la d
        frases3.forEach(System.out::println);

        System.out.println("--------------------------------");
        List<String> frases4 = new ArrayList<>();
        frases4.add("abadia");
        frases4.replaceAll(familiar -> familiar
                .replaceAll("[^a-d]", "*")); //reemplaza todo lo que no esta en el rango de la a a la d
        frases4.forEach(System.out::println);

        System.out.println("--------------------------------");
    }
}
