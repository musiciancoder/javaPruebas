package myregex;

import java.util.ArrayList;
import java.util.List;

public class ComienzoYFinalDeUnaPalabra {
    public static void main(String[] args) {
        List<String> frases5 = new ArrayList<>();
        frases5.add("espanaes esalesia andres");

        frases5.replaceAll(familiar -> familiar
                .replaceAll("es\\b", "*")); //espana* esalesia andr*  -->reemplaza si el final de cada palabra termina con es, no el principio d
        frases5.forEach(System.out::println);

        List<String> frases6 = new ArrayList<>();
        frases6.add("espanaes esalesia andres");

        frases6.replaceAll(familiar -> familiar
                .replaceAll("\\bes", "*")); //*panaes *alesia andres  -->reemplaza si el comienzo de cada palabra empieza con es, no el comienzo
        frases6.forEach(System.out::println);
    }
}
