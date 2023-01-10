package patronesdiseno.estructurales.proxy.example.internet;

//Esta es la ServiceInterface.
//Gringo dijo:"this interface is that of the service, and the proxy must follow this interface to be able to disguise itself as a service object"
public interface Internet {

    void connectTo(String host);

}