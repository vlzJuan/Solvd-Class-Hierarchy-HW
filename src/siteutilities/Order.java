package siteutilities;


/**
 * Class that represents an order. This corresponds to a shopping cart
 * that has already been purchased.
 * It has an identifier attribute, and a String determining what was purchased.
 */
public class Order {

    //  Attributes
    private int identifier;
    public String orderDescription;


    /**
     * Default constructor for an order. It requires a cart, to generate
     * the order's description.
     * @param identifier
     * @param purchased
     */
    public Order(int identifier, Cart purchased){
        this.identifier = identifier;
        this.orderDescription = "";
        //  Here, parse the cart elements and store a resulting string
        //  in a String at orderDescription.
    }


    //  Getter for identifier:
    public int getIdentifier(){
        return this.identifier;
    }

    //  Setter for identifier:
    public void setIdentifier(int identifier){
        this.identifier = identifier;
    }



}
