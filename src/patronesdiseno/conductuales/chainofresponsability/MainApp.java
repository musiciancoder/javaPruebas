package patronesdiseno.conductuales.chainofresponsability;

import patronesdiseno.conductuales.chainofresponsability.handlers.Handler;
import patronesdiseno.conductuales.chainofresponsability.handlers.RoleCheckHandler;
import patronesdiseno.conductuales.chainofresponsability.handlers.UserExistsHandler;
import patronesdiseno.conductuales.chainofresponsability.handlers.ValidPasswordHandler;

/*
This is the client.
Use CHOR pattern when you encounter the need to execute several handlers in a particular order.
CHOR allows you to insert remove or reorder handlers dynamically.
The client may trigger any handler in the chain, not just the first one.
 */
public class MainApp {

    /*
     * Video Reference: https://youtu.be/FafNcoBvVQo
     */
    public static void main(String[] args) {

        Database database = new Database();
        Handler handler = new UserExistsHandler(database);
        handler.setNextHandler(new ValidPasswordHandler(database))
                .setNextHandler(new RoleCheckHandler());
        AuthService service = new AuthService(handler);

        System.out.println("==========================================");

        System.out.println(service.logIn("username", "password"));

        System.out.println("==========================================");

        System.out.println(service.logIn("user_username", "password"));

        System.out.println("==========================================");

        System.out.println(service.logIn("admin_username", "admin_password"));

        System.out.println("==========================================");

    }

}