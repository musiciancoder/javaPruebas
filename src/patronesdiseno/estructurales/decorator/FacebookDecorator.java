package patronesdiseno.estructurales.decorator;
public class FacebookDecorator extends BaseNotifierDecorator { //ConcreteDecorator, overrides the methods of the Base Decorator, but still make use of it either before or after their own execution by wrapping the wrapped object (Notifier)

    public FacebookDecorator(INotifier wrapped) { //ConcreteDecorator
        super(wrapped); //le pasa wrapped al constructor de BaseNotifierDecorator
    }

    public void send(String msg) {//+doThis()
        super.send(msg);//le pasa msg al send de BaseNotifierDecorator
        String fbName = databaseService.getFBNameFromUsername(getUsername());
        System.out.println("Sending " + msg + " on Facebook to " + fbName);
    }

}