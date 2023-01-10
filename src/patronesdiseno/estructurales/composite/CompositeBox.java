package patronesdiseno.estructurales.composite;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Esta es el Composite (ver diagrama para composite pattern)
public class CompositeBox implements Box {

    private final List<Box> children = new ArrayList<>();

    public CompositeBox(Box... boxes){ //Box... boxes es lo mismo q Box[] boxes
        children.addAll(Arrays.asList(boxes));
    }

    // Si quisieramos agregar por ejemplo un costo por empacado para cada caja, iría qui. De esta forma no tenemos que modificar Box, a diferencia del desarrollo no recomendado

    @Override //este sí sobrecribe a diferencia de Product
    public double calculatePrice() {
         return children.stream().mapToDouble(Box::calculatePrice).sum();
    }
}
