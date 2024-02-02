package patronesdiseno.solid.openclosed.com;

/*
First we will create a base type shape which will be implemented by all shapes.
It has an abstract method calculateArea(). Every sub class override this method and will provide own implementation. This design follow the open closed design principle as Shape class is open for extension and closed for modification.
 */

public interface Shape {
    public double calculateArea();
}
