package patronesdiseno.estructurales.decorator;

public class MainApp {

    /*
     * Video Reference: https://youtu.be/v6tpISNjHf8
     *
     *
     */

    /*
    Wrappers es lo mismo que decorators, lo único es que para decorator pattern design existe un wrapper principal o Base decorator, pero tanto FacebookDecorator y WhatssappDecorator son wrappers tambien)
    Al trabajar con wrappers no trabajamos con herencia normal (en la q una clase para Facebook y otra para Whatssapp heredarían directamente de notifier, por ejemplo). En vez de ello se privilegia la composición (composite pattern design) en donde un objeto envuelve a otro y ese otro objeto a su vez envuelve a otro
     */
    public static void main(String[] args) {

        //This is the client (diagrama del gringo). Wraps components in layers of decorators but must work via the component interface.
        INotifier notifyAll = new FacebookDecorator(new WhatsAppDecorator(new Notifier("Geekific"))); //acá se ve claramente que se esta trabajando con composicion: new FacebookDecorator(new WhatsAppDecorator(new Notifier("Geekific")));
        notifyAll.send("Like and Subscribe!!!");

        System.out.println("==========================================");

        INotifier notifyFbMail = new FacebookDecorator(new Notifier("Geekific"));
        notifyFbMail.send("Like and Subscribe!!!");

    }

}