package patronesdiseno.estructurales.flyweight.gringo;

import java.util.HashMap;
import java.util.Map;

/*
This is the Flyweight Factory class, which returns the flyweight possibilities that we have.
The factory manages a pool of existing flyweights. With the factory, clients (MainApp) dont create flyweights directly
 */

public class BookFactory {

    private static final Map<String, BookType> bookTypes = new HashMap<>();

    public static BookType getBookType(String type, String distributor, String otherData) {
        if (bookTypes.get(type) == null) {
            bookTypes.put(type, new BookType(type, distributor, otherData)); //notar que instancia el estado intrinseco
        }
        return bookTypes.get(type);
    }

}
