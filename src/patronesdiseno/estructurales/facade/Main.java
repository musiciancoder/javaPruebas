package patronesdiseno.estructurales.facade;



public class Main {

    /*
     * Video Reference: https://youtu.be/xWk6jvqyhAQ
     */
    public static void main(String[] args) {

        //Esto es lo no recomendado, o sea no se ocupa facade. Notar q este código con toda seguridad se podría requerir en otras partes de la app, por lo que
        //necesitaríamos o llamar al main o duplicar código. Ambas opciones son malas. Además si necesitamos hacer algo antes o despues de la compra de criptomonedas tendríammos q cambiar  este código
       /* DatabaseService dbService= new DatabaseService();  //si usaramos esto estaríamos instanciando un servicio directamente en la clase main, lo que no es recomendado. En general no se recomienda llamar directamente a otro paquete (third party) desde método main, por lo que debemos crear una fachada que llame al otro paquete y nosotros llamar a esa fachada desde el main.
       gringo dijo: "we need a centralized place to put all of the logic inside it, to center it, and to restrict direct access to the inner workings of the library"
        User user = dbService.getUser(UIService.getLoggedInUserId());
        CryptoFactory.getCryptoService("BTC").buyCurrency(user,1000);
        */

        //Gringo dijo: "the cliente (o sea esta clase) uses the facade instead of calling the subsystem objects directly
        //Esto es lo recomendado, o sea se ocupa facade
        BuyCryptoFacade buyCrypto = new BuyCryptoFacade();
        buyCrypto.buyCryptocurrency(1000, "BTC");

    }
}
