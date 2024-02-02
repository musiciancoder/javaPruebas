package designpatternbaeldung.bridge;

public class Test {

    public static void main(String[] args) {
        //a square with red color
        Shape square = new Square(new Blue());
        System.out.println("The color of " + square.toString() + " is " + square.color);
    }
}
