package patronesdiseno.creacionales.factory.actualsimplefactory;

public class VeggieBurgerRestaurant extends Restaurant{  //Este es un ConcreteCreator
    @Override
    public Burger createBurger() {
        return new VeggieBurger(); //notar q el metodo de un ConcreteCreator siempre devuelve un ConcreteProduct
    }
}
