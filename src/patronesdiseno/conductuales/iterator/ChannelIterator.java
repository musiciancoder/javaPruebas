package patronesdiseno.conductuales.iterator;

public interface ChannelIterator { //esta es la interfaz iterator, a ser implementada en la clase interna de la clase que crea la coleccion (ChannelCollectionImpl)

    public boolean hasNext();

    public Channel next();
}
