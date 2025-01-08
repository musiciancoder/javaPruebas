package ejercicios.barathcurso;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class NivenNumber {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in);) {
            String n = scanner.nextLine();
            String [] arr = new  String[n.length()];
           arr = n.split("");
            List<String>stringList = new ArrayList<>();

            for (int i = 0; i < n.length(); i++) {
            stringList.add(arr[i]);
            }
            List<Integer>integerList = new ArrayList<>();

            integerList =  stringList.stream().map(Integer::parseInt).collect(Collectors.toList());

            var value2 = integerList.stream() //ojo, que value2 es un Optional de integer
                    .reduce((a,b)->{ // aca sí se imprimen valores intermedios. En general con {} podemos escribir varias lineas de codigo
                        int c= (a+b);
                        System.out.print(c);//imprime varoles intermedios
                        return c;
                    });

            System.out.println(value2.get());


        }
    }

}
