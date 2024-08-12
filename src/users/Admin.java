package users;




/**
 * Class corresponding to an admin user from the E-commerce site.
 * This class will have special privileges over a basic client, such as
 * modifying the stock of certain products in inventory.
 */
public class Admin extends User{

    //  Inherits the following attributes from it's parent class:
    //      -String userName
    //      -String password
    //  Adds the following attributes:
    private int employeeNumber; //  An unique identifier for the admin.
    // ADD ANOTHER PARAMETER.

    /**
     * Inherits its behaviour from the User parent class.
     * Public constructor for a User. requires a userName and
     * @param userName  , the username required for login.
     * @param password  , the password associated to this user.
     */
    public Admin(String userName, String password){
        super(userName, password);
    }


    // Add methods here


}
