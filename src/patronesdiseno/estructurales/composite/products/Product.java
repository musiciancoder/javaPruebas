package patronesdiseno.estructurales.composite.products;


import patronesdiseno.estructurales.composite.Box;


public abstract class Product implements Box { //notar q aca no sobrescribimos el metodo calculatePrice(), porque como es clase abstacta , pasamos calculatePrice() a Book y VideoGame para que sean ellos quienes sobrescriban

    protected final String title;
    protected final double price;

    public Product(String title, double price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }
}