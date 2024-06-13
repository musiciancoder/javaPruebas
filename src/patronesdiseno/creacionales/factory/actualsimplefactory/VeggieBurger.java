package patronesdiseno.creacionales.factory.actualsimplefactory;

public class VeggieBurger implements Burger{ //ConcreteProduct
    private final String ingredient1= "Soja meet";
    private final String ingredient2= "Tomato";
    private final String ingredient3= "Lettuce";
    private final String ingredient4= "Spinach";

    @Override
    public void prepare() {
        System.out.println("This burger has: " + ingredient1);
        System.out.println("This burger has: " + ingredient2);
        System.out.println("This burger has: " + ingredient3);
        System.out.println("This burger has: " + ingredient4);
    }
}
