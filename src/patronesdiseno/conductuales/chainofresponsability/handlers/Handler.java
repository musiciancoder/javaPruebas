package patronesdiseno.conductuales.chainofresponsability.handlers;

/*
This class is a combination of Interface Handler (since it contains handle method to be overritten by concrete handlers) and BaseHandler
(since it contains setNextHandler method for passing along the request and handleNext, which is boilercode default behaviour if there is no "next")
 */

public abstract class Handler {

    private Handler next;

    public Handler setNextHandler(Handler next) { //this method works as a linkedlist for receiving the next handler
        this.next = next;
        return next;
    }

    public abstract boolean handle(String username, String password);

    protected boolean handleNext(String username, String password) {
        if (next == null) {
            return true;
        }
        return next.handle(username, password);
    }

}