package products;


import java.time.LocalDate;
import java.util.ArrayList;

/**
 * Class dedicated for the inventory stock for the site.
 * This might be easily replaced with access to a Database way down in this course.
 */
public class Inventory {

    //  Attributes:
    private LocalDate lastUpdate;
    public ArrayList<Product> inventory;

    /**
     * Constructor for an inventory,
     *
     * @param creationTime  , the time (in LocalDate format) of instantiation.
     * @param baseInventory , an ArrayList of products to initialize the inventory.
     */
    public Inventory(LocalDate creationTime, ArrayList<Product> baseInventory){
        this.lastUpdate = creationTime;
        this.inventory = new ArrayList<>(baseInventory);
    }



    //  Getter for date:
    public LocalDate getLastUpdate(){
        return this.lastUpdate;
    }

    //  Setter for date:
    public void setLastUpdate(LocalDate updateTime){
        this.lastUpdate = updateTime;
    }

    ////////////////

    /**
     * Method used to add a new product to the list.
     * If such a product exists, add its stock to the one already in the inventory.
     * @param product
     */
    public void addProduct(Product product){
        //  Implement
    }

    /**
     * Method used to remove a product from inventory altogether.
     * @param product
     */
    public void removeProduct(Product product){
        //  Implement
    }

    /**
     * Method used for taking an amount of a certain product out of the inventory.
     *
     * @param product
     * @param amount
     */
    public void takeProduct(Product product, int amount){

    }

}
