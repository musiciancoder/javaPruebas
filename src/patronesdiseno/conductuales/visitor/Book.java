package patronesdiseno.conductuales.visitor;

public class Book implements ItemElement{

    //Concrete class

    private int price;
    private String isbnNumber;

    public Book(int cost, String isbn){
        this.price=cost;
        this.isbnNumber=isbn;
    }

    public int getPrice() {
        return price;
    }

    public String getIsbnNumber() {
        return isbnNumber;
    }


    //Notice the implementation of accept() method in concrete classes, its calling visit() method of Visitor and passing itself as argument.

    @Override
    public int accept(ShoppingCartVisitor visitor) {
        return visitor.visit(this);
    }
}
