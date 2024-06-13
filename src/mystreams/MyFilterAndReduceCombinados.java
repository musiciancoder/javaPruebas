package mystreams;

import java.util.ArrayList;
import java.util.List;

public class MyFilterAndReduceCombinados {

    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(2);
        integerList.add(5);
        integerList.add(10);
        integerList.add(13);
        integerList.add(15);

        //Acá el concepto NO es que pase el primero por por filter,peek y reduce y despues pase el segundo. El concepto es q pasa el primero por el filter y luego pasa el segundo por el filter, hasta que pasa el último por el filter, y luego el primero entra al peek y sasi sucesivamente


    integerList = integerList.stream().filter(integer -> integer>=10)
               .peek(integer -> System.out.println(integer))
               .reduce((integer, integer2) -> integer2 - integer).stream().toList();

        System.out.println(integerList);
    }
}
