package mystreams;

import java.util.ArrayList;
import java.util.List;

public class MyMapToInt2 {

    public static void main(String[] args) {

        List<Integer> list=new ArrayList<>(); //necesitamos sumar los valores de la lista
        list.add(2);
        list.add(5);
        var sumPos = list.stream().mapToInt(Integer::intValue) //mapToInt genera un stream de primitivas int, en este caso a partir de un stream de Integer.
                .sum(); //¿por que necesitamos un stream de primitivas int? --> porque .sum() es un metodo de stream de primitivas int y necesitamos sumar los valores

        System.out.println(sumPos);
    }
}
