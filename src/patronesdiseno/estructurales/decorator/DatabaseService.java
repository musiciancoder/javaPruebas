package patronesdiseno.estructurales.decorator;


public class DatabaseService { //solo lo ocupa en BaseNotifierDecorator y en Notifier

    public String getMailFromUsername(String username) {
        return username + "@Mail";
    }

    public String getPhoneNbrFromUsername(String username) {
        return username + "@Phone";
    }

    public String getFBNameFromUsername(String username) {
        return username + "@Facebook";
    }

}
