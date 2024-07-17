package patronesdiseno.estructurales.flyweight.gringo;
import java.util.ArrayList;
import java.util.List;

public class Store {

    /*
    The store combines all atributes by  calling out the factory (gringo did not put store class as a part of the pattern, however its plain to see that the client is indirectly calling out the factory by instantiating the store
     */
    private final List<Book> books = new ArrayList<>();

    public void storeBook(String name, double price, String type, String distributor, String otherData) {
        BookType bookType = BookFactory.getBookType(type, distributor, otherData); //here's where the factory is being called out
        books.add(new Book(name, price, bookType));
    }

    public void displayBooks() {
        books.forEach(System.out::println);
    }

}