package paymentmethods;


/**
 * Class associated with the payment method that an user will need
 * to pay for a product in the E-Commerce store.
 * Declared as an abstract, to further separate in two classes:
 *      -Bank Account
 *      -Credit Card
 */
public abstract class PaymentMethod {

    //Attributes:
    protected long identifier;        // The numeric identifier of this payment method.
    protected int validationCode;     //

    public PaymentMethod(long identifier, int validationCode){
        this.identifier = identifier;
        this.validationCode = validationCode;
    }

    // Implement methods later.

    //  Getters:

    public long getIdentifier(){
        return this.identifier;
    }

    public int getValidationCode(){
        return this.validationCode;
    }

    //  Setters:

    public void setIdentifier(int identifier){
        this.identifier = identifier;
    }

    public void setValidationCode(int validationCode){
        this.validationCode = validationCode;
    }


}
