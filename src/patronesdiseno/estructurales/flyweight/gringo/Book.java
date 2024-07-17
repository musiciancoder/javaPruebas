package patronesdiseno.estructurales.flyweight.gringo;
import lombok.Data;
/*
This is the context class.
this is the extrinsic state. This is the part that varies, that is unique, and may be altered at runtime
 */
@Data
public class Book {

    private final String name;
    private final double price;
    private final BookType type; //notar que hace referencia al flyweight

}