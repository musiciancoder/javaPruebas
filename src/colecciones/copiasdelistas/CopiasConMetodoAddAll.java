package colecciones.copiasdelistas;

import java.util.ArrayList;
import java.util.List;

public class CopiasConMetodoAddAll {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(13);
        integerList.add(14);
        System.out.println(integerList);  //[13, 14]
        List<Integer> copy = new ArrayList<>();
        copy.add(12);
        copy.addAll(integerList);
        integerList.add(15);
        System.out.println(copy); //[12, 13, 14] -->produce un shallow copy, pero si la copia tiene algun valor (12 en este caso), funciona como union entre las dos listas

    }
}
