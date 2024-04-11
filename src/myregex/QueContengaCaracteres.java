package myregex;

import java.util.ArrayList;
import java.util.List;

public class QueContengaCaracteres {

    public static void main(String[] args) {
        List<String> frases = new ArrayList<>();
        frases.add("Tom, es 1 gran lider !!!");

        frases.replaceAll(phrase -> phrase
                .replaceAll("\\w", "*")); //reemplaza los caracteres (un espacio es un NO caracter)
        frases.forEach(System.out::println);

        List<String> frases2 = new ArrayList<>();
        frases2.add("Tom, es 1 gran lider !!!");

        frases2.replaceAll(phrase -> phrase
                .replaceAll("\\W", "*")); //reemplaza los NO caracteres (un espacio es un NO caracter)
        frases2.forEach(System.out::println);
    }
}
