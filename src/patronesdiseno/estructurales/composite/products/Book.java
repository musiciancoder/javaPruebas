package patronesdiseno.estructurales.composite.products;

//Esta es un leaf (ver diagrama para composite pattern)
public class Book extends Product {

    public Book(String title, double price) {
        super(title, price);
    }

    @Override
    public double calculatePrice() {
        return getPrice();
    }

}