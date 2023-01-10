package patronesdiseno.creacionales.factory.actualsimplefactory;

public class Main {
    public static void main(String[] args) {
        Restaurant beefResto = new BeefBurgerRestaurant();
        beefResto.orderBurger();
        Restaurant veggieResto = new VeggieBurgerRestaurant();
        veggieResto.orderBurger();

    }
}
