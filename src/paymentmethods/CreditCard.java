package paymentmethods;


/**
 * Class corresponding to a Credit Card payment method.
 */
public class CreditCard extends PaymentMethod{

    //  Inherited attributes:
    //      - long identifier
    //      - int validationCode
    //  Local attributes:
    private String cardName;    //  Name in the card
    private String cardEmitter; //  Name of the enterprise that issued this card

    public CreditCard(long identifier, int validationCode,
                      String cardName, String cardEmitter){
        super(identifier,validationCode);
        this.cardName = cardName;
        this.cardEmitter = cardEmitter;
    }


    //  Getters.

    public String getCardName(){
        return this.cardName;
    }

    public String getCardEmitter(){
        return this.cardEmitter;
    }

    //  Setters

    public void setCardName(String newCardName){
        this.cardName = newCardName;
    }

    public void setCardEmitter(String newCardEmitter){
        this.cardEmitter = newCardEmitter;
    }


}
