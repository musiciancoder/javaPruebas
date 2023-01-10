package patronesdiseno.estructurales.flyweight;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

/*
Gringo dijo: this is the FLYWEIGHT CLASS which store the intrinsic state (shared state) of the object.
This state is invariant, context-independent, shareable and never altered at runtime. Flyweight are immutable. Its state is initialized just once via constructor
 The same flyweight object is re-used in many different contexts and the state stored inside a flyweight is called intrinsic
 */

@Getter
@ToString
@AllArgsConstructor
public class BookType {

    private final String type; //Flyweight class always must contain a portion of the original object's state
    private final String distributor;
    private final String otherData;

}