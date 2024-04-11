package inmutabilidad;

//StringBuffer and StringBuilder are mutable classes. StringBuffer is thread-safe and synchronized whereas StringBuilder is not. That's why StringBuilder is faster than StringBuffer. String concatenation operator (+) internally uses StringBuffer or StringBuilder class.
public class ConstructorCadenasMutables {
    public static void main(String[] args) {
        //Both references x and y target different objects in memory from the beginning
        //If we were to create String x= new String("first value");String y= new String("second value"); they would target the same value in memory!!!
        StringBuilder x = new StringBuilder("first value");
        StringBuilder y = new StringBuilder("second value");
        System.out.println("Before swapping:");
        System.out.println("x: " + x + " ; y: " + y);
        System.out.println("hashcode x: " + x.hashCode() + " ; hashcode y: " + y.hashCode());

        System.out.println("");

        //Note that after a switch in object x, to the same atributes as y, object x  still has the same hashcode as before (it does not swaps to hashcode of object y). The exact opposite to this occurs when using Sting instead of StringBuilder.

        x.replace(0,5,"second");
        System.out.println("After swapping:");
        System.out.println("x: " + x + " ; y: " + y);
        System.out.println("hashcode x: " + x.hashCode() + " ; hashcode y: " + y.hashCode());

    }
}
