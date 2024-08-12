package siteutilities;


import products.Product;

import java.util.ArrayList;

/**
 * Class associated with a Shopping cart for the E-commerce site.
 */
public class Cart {

    //  Attributes:
    //      An arraylist of products. (private)
    //      A boolean purchase state (public)
    private ArrayList<Product> productList;
    public boolean stateOfPurchase;
    public boolean stateOfDelivery; //

    /**
     * Constructor with parameters for this
     */
    public Cart(ArrayList<Product> productList){
        //  Create a copy of the list (to avoid issues with references).
        this.productList = new ArrayList<>(productList);
        this.stateOfPurchase = false;
        stateOfDelivery = false;

    //  Implement methods.


    }



}
