package designpatternbaeldung.bridge;

public class Square extends Shape {

    public Square(Color color) {
        super(color);
    }

    @Override
    public String toString() {
        return "Square";
    }

    @Override
    public String draw() {
        return "Square drawn. " + color.fill();
    }
}
