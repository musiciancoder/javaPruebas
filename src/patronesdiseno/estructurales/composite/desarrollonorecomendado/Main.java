package patronesdiseno.estructurales.composite.desarrollonorecomendado;

import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        Box box = new Box(

                Arrays.asList(
                        new Box(
                                Collections.emptyList(),
                                Arrays.asList(
                                        new Product("1", 100),
                                        new Product("2", 100),
                                        new Product("3", 100)
                                )
                        ),
                        new Box(
                                Collections.emptyList(),
                                Arrays.asList(
                                        new Product("1", 200),
                                        new Product("2", 200),
                                        new Product("3", 200)
                                )
                        )
                ),
                Arrays.asList(
                        new Product("7", 100),
                        new Product("8", 100)
                )
        );
        System.out.println(box.calculatePrice()); //1100.0 notar que va a funcionar igual

    }
}
