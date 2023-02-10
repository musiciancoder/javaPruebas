package patronesdiseno.conductuales.chainofresponsability.handlers;

/*
This class is a concrete handler type of class. Each concrete handler contains actual code for processing requests.
They are self-contained and immutable accepting all necessary data via the constructor.
They override the handler method, returning a solution for the request or passing it along to the nect concrete handler.
 */
public class RoleCheckHandler extends Handler {

    @Override
    public boolean handle(String username, String password) {
        if ("admin_username".equals(username)) {
            System.out.println("Loading Admin Page...");
            return true;
        }
        System.out.println("Loading Default Page...");
        return handleNext(username, password);
    }

}