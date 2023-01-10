package patronesdiseno.creacionales.factory.actualsimplefactory;

public class VeggieBurgerRestaurant extends Restaurant{  //Este es un subfactory!!
    @Override
    public Burger createBurger() {
        return new VeggieBurger();
    }
}
