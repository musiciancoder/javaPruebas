package patronesdiseno.creacionales.factory.actualsimplefactory;

public class BeefBurger implements Burger {

    private final String ingredient1= "Meet";
    private final String ingredient2= "Tomato";
    private final String ingredient3= "Cheese";
    private final String ingredient4= "Barbecue salse";

    @Override
    public void prepare() {
        System.out.println("This burger has: " + ingredient1);
        System.out.println("This burger has: " + ingredient2);
        System.out.println("This burger has: " + ingredient3);
        System.out.println("This burger has: " + ingredient4);
    }
}
