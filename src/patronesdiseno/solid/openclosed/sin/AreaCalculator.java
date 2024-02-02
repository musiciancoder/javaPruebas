package patronesdiseno.solid.openclosed.sin;

/*
When we create Circle class we modify AreaCalculator class to add circle calculations through a new method calculateCircleArea().
Whenever a new requirement comes we have to modify our class so this design is not closed for modification.
 */

public class AreaCalculator {
    public double calculateRectangleArea(Rectangle rectangle){
        return rectangle.length *rectangle.width;
    }
    public double calculateCircleArea(Circle circle){
        return (22/7)*circle.radius*circle.radius;
    }
}
