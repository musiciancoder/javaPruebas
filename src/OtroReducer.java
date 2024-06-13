import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class OtroReducer {

    public static void main(String[] args) {
        List<Integer> gastos = new ArrayList<Integer>();
        gastos.add(100);
        gastos.add(200);
        gastos.add(300);

        gastos.stream().reduce((acumulador, numero) -> {
            return acumulador;
        }).ifPresent(System.out::println);


    }
}