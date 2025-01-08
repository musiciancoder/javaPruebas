package patronesdiseno.estructurales.proxy.gringopelaoyoutube.internet;

//Esta es la ServiceInterface como lo llama el gringo, pero es mas correcto llamarla "Subject".
//Gringo dijo:"this interface is that of the service, and the proxy must follow this interface to be able to disguise itself as a service object"
public interface Internet {

    void connectTo(String host);

}