package patronesdiseno.creacionales.factory.simplefactoryidiom;

public class SimpleBurgerFactory {
    //Esta es la fábrica .Notar que la fábrica para SimpleFactoryIdiom sí depende de los parámetros (del request en este caso
    public Burger createBurger( String request){
        Burger burger = null;
        if("BEEF".equalsIgnoreCase(request)){
            burger = new BeefBurger();
        } else if("VEGGIE".equalsIgnoreCase(request)){
            burger = new VeggieBurger();
        }
        return burger;
    }
}
