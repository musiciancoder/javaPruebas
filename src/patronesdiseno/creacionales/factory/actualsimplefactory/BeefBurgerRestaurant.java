package patronesdiseno.creacionales.factory.actualsimplefactory;

public class BeefBurgerRestaurant extends Restaurant{  //Este es un ConcreteCreator
    @Override
    public Burger createBurger() {
        return new BeefBurger(); //notar q el metodo de un ConcreteCreator siempre devuelve un ConcreteProduct
    }
}
