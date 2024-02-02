package patronesdiseno.solid.openclosed.com;

public class Rectangle implements Shape{
    double length;
    double width;
    public double calculateArea(){
        return length * width;
    }
}