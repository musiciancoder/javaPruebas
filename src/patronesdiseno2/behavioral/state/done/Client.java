package patronesdiseno2.behavioral.state.done;

public class Client {

    public static void main(String[] args) {
        Order order = new Order();
        order.paymentSuccessful();
        order.dispatched();
        order.cancel();
    }
}
