package patronesdiseno.estructurales.proxy.gringopelaoyoutube.internet;

//Este es el Service o RealSubject

//Gringo dijo: "this is the actual implementation of the interface; contains business logic"

public class RealInternet implements Internet {

    @Override
    public void connectTo(String host) {
        System.out.println("Successfully opened connection to " + host);
    }

}