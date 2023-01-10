package patronesdiseno.estructurales.composite.desarrollonorecomendado;

import java.util.List;

public class Box {
    private List<Box> boxes; // Si quisieramos agregar por ejemplo un costo por empacado para cada caja, esta clase tendríamos que modificarla
    private  List <Product>products; //Esto dijo el gringo: "Si quisieramos tener productos con un cálculo de precio mas complejo al actual, esta clase tendríamos que modificarla". Sin embargo la duda mía es que en este caso igual podriamos agregar un método en la clase Product sin tener que modificar Box

    //Debido a los dos comentarios anteriores, podemos ver que esta clase así como está viola el principio open-closed de SOLID.

    public Box(List<Box> boxes, List<Product> products) {
        this.boxes = boxes;
        this.products = products;
    }

    public List<Box> getBoxes() {
        return boxes;
    }

    public void setBoxes(List<Box> boxes) {
        this.boxes = boxes;
    }

    public double calculatePrice(){
        double sum = products.stream()
                .mapToDouble(Product::getPrice)
                .sum();
        for (Box box:boxes){
            sum = sum + box.calculatePrice();
        }
        return sum;
    }
}
