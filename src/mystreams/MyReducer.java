package mystreams;

import java.util.ArrayList;
import java.util.List;

public class MyReducer {
    public static void main(String[] args) {
        List<Integer> gastos= new ArrayList<Integer>();
        gastos.add(100);
        gastos.add(200);
        gastos.add(300);

        gastos.
                stream().
                reduce((acumulador,numero)-> {
                    int sumaParcial = acumulador + numero;
                    System.out.println("Suma Parcial: " + sumaParcial);
            return sumaParcial;
        }).ifPresent(System.out::println);

        //gastos.stream().reduce(Integer::sum).ifPresent(System.out::println); mas simple
}
}
