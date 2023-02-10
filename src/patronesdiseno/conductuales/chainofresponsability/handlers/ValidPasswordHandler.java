package patronesdiseno.conductuales.chainofresponsability.handlers;

import patronesdiseno.conductuales.chainofresponsability.Database;

public class ValidPasswordHandler extends Handler {

    /*
This class is a concrete handler type of class. Each concrete handler contains actual code for processing requests.
They are self-contained and immutable accepting all necessary data via the constructor.
They override the handler method, returning a solution for the request or passing it along to the nect concrete handler.
 */
    private final Database database;

    public ValidPasswordHandler(Database database) {
        this.database = database;
    }

    @Override
    public boolean handle(String username, String password) {
        if (!database.isValidPassword(username, password)) {
            System.out.println("Wrong Password!");
            return false;
        }
        return handleNext(username, password);
    }

}