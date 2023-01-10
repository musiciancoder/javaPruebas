package patronesdiseno.estructurales.facade;

import patronesdiseno.estructurales.facade.thirdparty.*;

public class BuyCryptoFacade {

//Gringo dijo: "a Facade provides convenient access to a perticular part of the subsystem's functionality.
    //sometimes the facade can grow too big and become a god object, so AdditionalFacades can be needed"
    //"the idea of a facade is providing a simple interface to the client, and if the code becomes too dependant on this class, that might make it another complex structure and no longer a "simple" object"

    public void buyCryptocurrency(double amount, String currency) {

        DatabaseService dbService = new DatabaseService();
        User user = dbService.getUser(UIService.getLoggedInUserId());  //obtiene el usuario
        if (user.balance() < amount) { //ve si no tiene plata el usuario
            System.out.println("Insufficient balance to perform transaction");
            return;
        }
        CryptoFactory.getCryptoService(currency).buyCurrency(user, amount); //compra criptomoneda
        MailService mailService = new MailService();
        mailService.sendConfirmationMail(user); //manda recibo al usuario
        System.out.println(amount + " of " + currency + " bought successfully!");

    }

}