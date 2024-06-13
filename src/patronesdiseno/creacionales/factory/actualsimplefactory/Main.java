package patronesdiseno.creacionales.factory.actualsimplefactory;

/*
//Este sería el ejemplo mas "académicamente correcto", ya que se puede apreciar con toda claridad los componentes del diagrama URL. Sin embargo, todo
indica que en situaciones reales lo más común es implementar el ejemplo de Hackerrank, ya que ahí existe un condicional en el Factory/Creator
 */

public class Main {
    public static void main(String[] args) {
        Restaurant beefResto = new BeefBurgerRestaurant();
        beefResto.orderBurger();
        Restaurant veggieResto = new VeggieBurgerRestaurant();
        veggieResto.orderBurger();
        //Se pueden ir agregando tantos otros tipos de restaurant (factory) como se desee, por lo q si no conocemos de antemano cuantos ni cuales restaurantes seran en
        //la aplicacion final, podemos usar el patron factory perfectamente

    }
}
