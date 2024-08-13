package users;


import paymentmethods.PaymentMethod;
import siteutilities.Order;

import java.util.ArrayList;

/**
 * Class corresponding to a regular user from the E-commerce site.
 * This class should have permissions to instantiate a product cart,
 * make purchases, and
 */
public class Client extends User{

    //  Inherits the following attributes from it's parent class:
    //      -String userName
    //      -String password
    //  Adds the following attributes:
    private PaymentMethod payment;  //  The payment method associated to this user

    // MODIFICAR para que use OrderID
    private ArrayList<Order> purchaseHistory;   //  Attribute that stores this user's
                                                //  purchases on the site so far.


    /**
     * Inherits its behaviour from the User parent class.
     * Public constructor for a User. requires a userName and
     * @param userName  , the username required for login.
     * @param password  , the password associated to this user.
     */
    public Client(String userName, String password, PaymentMethod paymentMethod){
        super(userName, password);
        this.payment = paymentMethod;
    }

    //  Metodo setter
    public void setPayment(PaymentMethod payment) {
        this.payment = payment;
    }

    //  Metodo getter
    public PaymentMethod getPaymentMethod(){
        return this.payment;
        // WARNING: This does not respect object encapsulation,
        // but I'll fix this in a later commit.
    }


}
