package patronesdiseno.estructurales.facade.thirdparty;
//Gringo dijo: "subsystem classes aren´t aware of the facade existance, they ioperate within the system and work with each other directly

public abstract class CryptoService {

    private DatabaseService databaseService;
    private SomeComplexStuff complexStuff;

    public abstract void buyCurrency(User user, double amount);

    public static class SomeComplexStuff { }

}