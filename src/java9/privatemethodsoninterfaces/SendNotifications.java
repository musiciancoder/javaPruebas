package java9.privatemethodsoninterfaces;

public interface SendNotifications {

    //starting java 9 we can have private mathods to reuse them within default methods

    default void sendNotification(){
        this.establishConnection();
        System.out.println("Sending notification");
    }

    private void establishConnection() {
        System.out.println("Establishing a connection");
    }

}
