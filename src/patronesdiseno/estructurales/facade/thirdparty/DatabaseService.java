package patronesdiseno.estructurales.facade.thirdparty;
//Gringo dijo: "subsystem classes aren´t aware of the facade existance, they ioperate within the system and work with each other directly

public class DatabaseService {

    public User getUser(String userId) {
        return new User("A1", "Geekific", 1000, "USD", "123456LNS");
    }
}
