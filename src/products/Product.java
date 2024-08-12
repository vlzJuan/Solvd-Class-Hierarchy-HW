package products;


/**
 *  Class corresponding to a product from the E-commerce store.
 */
public class Product {

    //  Attributes:
    public String productName;  //  The name of the product.
    private int stock;          //  The amount of this product in stock.


    /**
     * Constructor for a Product. It requires its name, and the initial
     * stock of it available in inventory.
     *
     * @param productName   , the product's name
     * @param initialStock  , the starting stock of it in the inventory.
     */
    public Product(String productName, int initialStock){
        this.productName = productName;
        this.stock = initialStock;
    }


    /**
     * Basic boolean method, used to determine if there is stock of this product
     * in inventory.
     *
     * @return  'true' if the stock is greater than zero, 'false' otherwise.
     */
    public boolean hasStock(){
        return this.stock>0;
    }

    /**
     * Overloaded boolean method, using an int as a parameter.
     * It is used to determine if there is enough stock of this product
     * in inventory to make a purchase of 'solicited amount' units.
     *
     * @param solicitedAmount , the amount of stock to pull from inventory
     *                        in the purchase that requests this method.
     * @return  'true' if the stock is enough for purchase, 'false' otherwise.
     */
    public boolean hasStock(int solicitedAmount){
        return this.stock>=solicitedAmount;
    }


    //  Getters and Setters:

    /**
     * Getter for the stock amount of this product.
     *
     * @return  the amount of stock of the product (from the private field 'stock')
     */
    public int getStock(){
        return this.stock;
    }

    /**
     * Setter for the stock amount of this Product.
     *
     * @param newStockAmount    , the new number of units of this product.
     */
    public void setStock(int newStockAmount){
        this.stock = newStockAmount;
    }




    //  Implement further methods.

}
