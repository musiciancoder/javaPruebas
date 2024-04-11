package myregex;

import java.util.ArrayList;
import java.util.List;

public class QueContengaEspacios {

    public static void main(String[] args) {
        List<String> frases = new ArrayList<>();
        frases.add("Tom es gran lider");

        frases.replaceAll(phrase -> phrase
                .replaceAll("\\s", "*")); //reemplaza los espacios
        frases.forEach(System.out::println);

        List<String> frases2 = new ArrayList<>();
        frases2.add("Tom es un gran lider");

        frases2.replaceAll(phrase -> phrase
                .replaceAll("\\S", "*")); //reemplaza los NO espacios
        frases2.forEach(System.out::println);
    }
}
