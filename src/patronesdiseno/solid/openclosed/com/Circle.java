package patronesdiseno.solid.openclosed.com;

public class Circle implements Shape {
    public double radius;

    public double calculateArea() {
        return (22 / 7) * radius * radius;
    }
}