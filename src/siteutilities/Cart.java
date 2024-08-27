package siteutilities;


import interfaces.Purchasable;
import interfaces.SearchableStorage;
import products.CartProduct;
import products.Product;
import users.Client;

import java.util.ArrayList;

/**
 * Class associated with a Shopping cart for the E-commerce site.
 */
public class Cart implements Purchasable, SearchableStorage<CartProduct> {

    //  Attributes:
    //      An arraylist of products. (private)
    //      A boolean purchase state (public)
    private ArrayList<CartProduct> productList;
    public boolean stateOfPurchase;
    public boolean stateOfDelivery; //

    /**
     * Constructor with parameters for this
     */
    public Cart(){
        //  Create a copy of the list (to avoid issues with references).
        this.productList = new ArrayList<>();
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

        for(CartProduct prod:productList){
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
        for(CartProduct prod:this.productList){
            ret = ret + prod.hashCode();
        }
        return ret;
    }



    public void addProduct(Product prod, int amount){
        CartProduct aux = new CartProduct(prod, amount);
        this.productList.add(aux);
    }


    public double totalCost(){
        double cost = 0.0;
        for(CartProduct prod:this.productList){
            cost = cost + prod.totalCost();
        }
        return cost;
    }


    @Override
    public String menuDescriptor() {

        StringBuilder retornable = new StringBuilder();
        retornable.append("Select the object to choose:\n");
        for(int i=0; i<productList.size(); i++){
            retornable.append(i + " - " + productList.get(i).descriptorForMenu() + "\n");
        }
        retornable.append("'-1' - Exit the menu.\n");
        return retornable.toString();
    }

    @Override
    public boolean isRetrievable(int index) {
        return (index>=0 && index<this.size());
    }

    @Override
    public CartProduct retrieve(int index) {

        // IMPLEMENT
        return null;
    }

    @Override
    public int size() {
        return this.productList.size();
    }


    @Override
    public void buy(Client buyer) {
        buyer.payPurchase(this);
    }
}




