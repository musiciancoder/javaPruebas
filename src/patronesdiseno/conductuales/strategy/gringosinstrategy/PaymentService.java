package patronesdiseno.conductuales.strategy.gringosinstrategy;

import lombok.Setter;
import patronesdiseno.conductuales.strategy.gringoconstrategy.CreditCard;

@Setter
public class PaymentService {
    private int cost;
    private boolean includeDelivery;

    public void processOrder (String paymentMethod){
        if("creditCard".equals(paymentMethod)){ //Note that this block Open for extensions/Closed for modifications principle, because for each new payment we have add a new "if" block hence modifying the method
            //Pop-up to collect card details...
            CreditCard card = new CreditCard("cardNumber","expiryDate","cvv");
            //Validate credit card
            System.out.println("Paying " + getTotal() + "using credit card");
            card.setAmount((card.getAmount())-this.getTotal());
        } else if ("Paypal".equals(paymentMethod)) { //besides each "if" block contains logic that is not related to one another, violating Single Responsabiliy principle
            //Pop-up to collect paypal mail and password
            String email ="";
            //Validate account...
            System.out.println("Paying " + getTotal() + "using paypal");

        }
    }

    //To correct this we need to place each payment in its own class making this class responsible for a particular payment strategy
    //aditionally these classes should be interchangeable by one another.


    private int getTotal(){
        return includeDelivery ? cost +10:cost;
    }

}
