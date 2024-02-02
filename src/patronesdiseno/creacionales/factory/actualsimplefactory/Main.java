package patronesdiseno.creacionales.factory.actualsimplefactory;

public class Main {
    public static void main(String[] args) {
        Restaurant beefResto = new BeefBurgerRestaurant();
        beefResto.orderBurger();
        Restaurant veggieResto = new VeggieBurgerRestaurant();
        veggieResto.orderBurger();
        //Se pueden ir agregando tantos otros tipos de restaurant como se desee, por lo q si no conocemos de antemano cuantos ni cuales restaurantes seran en
        //la aplicacion final, podemos usar el patron factory perfectamente

    }
}
