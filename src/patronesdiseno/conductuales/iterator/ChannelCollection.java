package patronesdiseno.conductuales.iterator;

public interface ChannelCollection { //Esta es la interfaz de la coleccion de canales

    public void addChannel(Channel c);

    public void removeChannel(Channel c);

    public ChannelIterator iterator(ChannelTypeEnum type);
}
