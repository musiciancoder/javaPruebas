package patronesdiseno.creacionales.factory.actualsimplefactory;

public class BeefBurgerRestaurant extends Restaurant{  //Este es un subfactory!!
    @Override
    public Burger createBurger() {
        return new BeefBurger();
    }
}
