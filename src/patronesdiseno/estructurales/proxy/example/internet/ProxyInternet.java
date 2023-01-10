package patronesdiseno.estructurales.proxy.example.internet;

import java.util.ArrayList;
import java.util.List;

//Este es el Proxy
//Gringo dijo:"The Proxy has a reference field that points to a service object;
// after the proxy finishes the work it was intended to do, usually, it passes the request to the service"

public class ProxyInternet implements Internet {

    private static final List<String> bannedSites;
    private final Internet internet = new RealInternet();

    static {
        bannedSites = new ArrayList<>();
        bannedSites.add("banned.com");
    }

    @Override
    public void connectTo(String host) {
        if (bannedSites.contains(host)) {
            System.out.println("Access Denied to " + host);
            return;
        }
        internet.connectTo(host); //acá lo está pasando al servicio
    }

}