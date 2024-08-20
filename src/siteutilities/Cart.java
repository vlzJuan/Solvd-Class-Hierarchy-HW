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
    }


    /**
     * Overridden method, toString()
     * @return  A descriptive string representing the cart
     */
    @Override
    public String toString(){

        StringBuilder ret = new StringBuilder("Cart products:\n");

        for(Product prod:productList){
            ret.append(prod.toString()).append("\n");
        }

        return ret.toString();
    }
    // Implement methods



    /**
     * Overridden method: equals.
     * @param obj   , an object to compare to this instance of a cart.
     * @return      'true' if this object matches the cart,
     *              'false' otherwise.
     */
    @Override
    public boolean equals(Object obj){
        boolean ret = false;

        if(obj instanceof Cart otherCart){
            if(this.productList.equals(otherCart.productList)
                    && this.stateOfDelivery == otherCart.stateOfDelivery
                    && this.stateOfPurchase == otherCart.stateOfPurchase){
                ret = true;
            }
        }

        return ret;
    }


    /**
     * Overridden method: hashCode()
     * @return  An int representing the products within the cart.
     */
    @Override
    public int hashCode(){
        int ret = 0;
        for(Product prod:this.productList){
            ret = ret + prod.hashCode();
        }
        return ret;
    }


}
