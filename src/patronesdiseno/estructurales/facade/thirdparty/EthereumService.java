package patronesdiseno.estructurales.facade.thirdparty;
//Gringo dijo: "subsystem classes aren´t aware of the facade existance, they ioperate within the system and work with each other directly

public class EthereumService extends CryptoService {

    @Override
    public void buyCurrency(User user, double amount) {
        System.out.println("Buying " + amount + " of Ethereum...");
    }

}