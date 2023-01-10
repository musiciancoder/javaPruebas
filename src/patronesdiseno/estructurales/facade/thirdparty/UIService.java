package patronesdiseno.estructurales.facade.thirdparty;

//Gringo dijo: "subsystem classes aren´t aware of the facade existance, they ioperate within the system and work with each other directly

public class UIService {

    public static String getLoggedInUserId() {
        return "";
    }

    public void logIn(String username, String password) {
        System.out.println("Logging In...");
    }

    public void logout() {
        System.out.println("Logging Out...");
    }

}