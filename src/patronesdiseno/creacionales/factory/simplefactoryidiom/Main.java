package patronesdiseno.creacionales.factory.simplefactoryidiom;

public class Main {

    /*
    Simple Factory Idiom no es un patrón de diseño en el sentido estricto de la palabra, porque  si bien tenemos un factory
    que libera a la clase Restaurant de depender de parámetros, aún estamos dependiendo de los parámetros en el factory.
    de los
     */

    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();
        restaurant.orderBurger("BEEF");
    }
}
