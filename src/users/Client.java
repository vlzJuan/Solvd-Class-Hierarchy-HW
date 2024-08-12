package users;



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
    private String displayName;     //  The name that will be displayed for the user.
    private long creditCardNumber;   //  The number of a credit card, to use as payment

    /**
     * Inherits its behaviour from the User parent class.
     * Public constructor for a User. requires a userName and
     * @param userName  , the username required for login.
     * @param password  , the password associated to this user.
     */
    public Client(String userName, String password){
        super(userName, password);
    }


    // Add methods here.

}
