package patronesdiseno.conductuales.chainofresponsability.handlers;

import patronesdiseno.conductuales.chainofresponsability.Database;

/*
This class is a concrete handler type of class. Each concrete handler contains actual code for processing requests.
They are self-contained and immutable accepting all necessary data via the constructor.
They override the handler method, returning a solution for the request or passing it along to the nect concrete handler.
 */
public class UserExistsHandler extends Handler {

    private final Database database;

    public UserExistsHandler(Database database) {
        this.database = database;
    }

    @Override
    public boolean handle(String username, String password) {
        if (!database.isValidUser(username)) {
            System.out.println("This username is not registered!");
            System.out.println("Sign Up to our app now!");
            return false;
        }
        return handleNext(username, password);
    }

}