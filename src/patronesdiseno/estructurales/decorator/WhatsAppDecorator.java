package patronesdiseno.estructurales.decorator;

public class WhatsAppDecorator extends BaseNotifierDecorator { //ConcreteDecorator, override the methods of the Baase Decorator, but still make use of it either before or after their own execution by wrapping the wrapped object (Notifier)

    public WhatsAppDecorator(INotifier wrapped) {
        super(wrapped);
    }

    @Override
    public void send(String msg) {//+doThis()
        super.send(msg);
        String phoneNbr = databaseService.getPhoneNbrFromUsername(getUsername());
        System.out.println("Sending " + msg + " by WhatsApp on " + phoneNbr);
    }

}