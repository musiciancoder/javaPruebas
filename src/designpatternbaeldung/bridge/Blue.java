package designpatternbaeldung.bridge;

public class Blue implements Color {
    @Override
    public String fill() {
        return "Color is Blue";
    }

    @Override
    public String toString() {
        return "Blue";
    }
}
