package patronesdiseno.conductuales.chainofresponsability;

import patronesdiseno.conductuales.chainofresponsability.handlers.Handler;

/*This class is the handler service. It must receive the handler in its constructor as an atribute and contains the method (logIn) that is firstly called by the client */
public class AuthService {

    private final Handler handler;

    public AuthService(Handler handler) {
        this.handler = handler;
    }

    public boolean logIn(String email, String password) {
        if (handler.handle(email, password)) {
            System.out.println("Authorization was successful!");
            // Do stuff for authorized users
            return true;
        }
        return false;
    }

}