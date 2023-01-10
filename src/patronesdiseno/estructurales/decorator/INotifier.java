package patronesdiseno.estructurales.decorator;

//this interface declares the common behaviours for both wrapper (BaseNotifierDecorator) and wrapped (INotifier) objects
public interface INotifier { //Component

    void send(String message); //+doThis()

    String getUsername();

}