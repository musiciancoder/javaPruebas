package patronesdiseno.estructurales.facade.thirdparty;

//Gringo dijo: "subsystem classes aren´t aware of the facade existance, they ioperate within the system and work with each other directly

public class CryptoFactory {

    public static CryptoService getCryptoService(String currency) {
        if (currency.equals("BTC")) {
            return new BitcoinService();
        } else if (currency.equals("ETH")) {
            return new EthereumService();
        } else {
            // More Stuff
            return new BitcoinService();
        }
    }

}