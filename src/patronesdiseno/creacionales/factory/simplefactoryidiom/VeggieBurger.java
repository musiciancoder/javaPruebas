package patronesdiseno.creacionales.factory.simplefactoryidiom;

public class VeggieBurger implements Burger{

    private final String ingredient1= "Soja meet";
    private final String ingredient2= "Tomato";
    private final String ingredient3= "Lettuce";

    @Override
    public void prepare() {
        System.out.println("This burger has: " + ingredient1);
        System.out.println("This burger has: " + ingredient2);
        System.out.println("This burger has: " + ingredient3



        );
    }
}
