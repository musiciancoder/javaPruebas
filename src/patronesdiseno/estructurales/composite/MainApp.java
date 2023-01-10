package patronesdiseno.estructurales.composite;

import patronesdiseno.estructurales.composite.products.Book;
import patronesdiseno.estructurales.composite.products.VideoGame;

public class MainApp {

    /*
     * Video Reference: https://youtu.be/oo9AsGqnisk
     */
    public static void main(String... args) {

        DeliveryService deliveryService = new DeliveryService();
        deliveryService.setupOrder(  // devuelve un CompositeBoxes
                //Notar la estructura de Trees que se va a devolver, esto es característico del Pattern Composite
                new CompositeBox(
                        new VideoGame("1", 500) //notar que composite pattern permite que cada una de estas estructuras (videogames, books, etc.) sean trabajadas como sifueran objetos individuales aqui
                ),
                new CompositeBox(
                        new CompositeBox(
                                new Book("2", 200),
                                new Book("3", 300)
                        ),
                        new VideoGame("4", 400),
                        new VideoGame("5", 500)
                )
        );
        System.out.println(deliveryService.calculateOrderPrice());

    }

}