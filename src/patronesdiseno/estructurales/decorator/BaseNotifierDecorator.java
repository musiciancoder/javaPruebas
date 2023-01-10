package patronesdiseno.estructurales.decorator;

public abstract class BaseNotifierDecorator implements INotifier { //BaseDecorator or Wrapper.

// in the  wrapper we must  reference the wrapped object via the interface (INotifier) so it can reference both the concretecomponent (Notifier) and the decorators
private final INotifier wrapped; //equivalente a INotifier notifier, ya q Notifier es el Wrapped
    protected final DatabaseService databaseService;

    BaseNotifierDecorator(INotifier wrapped) {
        this.wrapped = wrapped;
        databaseService = new DatabaseService();
    }

    @Override
    public void send(String msg) {
        wrapped.send(msg); //notar q ocupa un objeto de INotifier (o sea del Component) con un método del mismo método q se está sobrescribiendo
    }

    @Override
    public String getUsername() {
        return wrapped.getUsername(); //notar q ocupa un objeto de INotifier (o sea del Component) con un método del mismo método q se está sobrescribiendo
    }

}