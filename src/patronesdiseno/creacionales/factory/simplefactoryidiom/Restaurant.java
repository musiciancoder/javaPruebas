package patronesdiseno.creacionales.factory.simplefactoryidiom;

public class Restaurant {
    //Notar q esta clase no depende de los ingredientes de las hamburguesas, por lo que si en un futuro deseamos cambiar los ingredientes
   // la clase restaurant no se verá afectada. Esto es gracias a que tenemos una fabrica que se encarga de crear los objetos
    public Burger orderBurger (String request){
        SimpleBurgerFactory factory = new SimpleBurgerFactory();
        Burger burger = factory.createBurger(request);
        burger.prepare();
        return burger;
    }

    //Acá irían otros métodos para crear los otros platos, como orderPizza, orderTacos, etc.

    //Acá irian otros métodos relacionados con el restaurant
}
