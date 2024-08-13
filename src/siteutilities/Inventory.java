package siteutilities;


import products.Product;

import java.time.LocalDate;
import java.util.ArrayList;

import static java.lang.String.format;

/**
 * Class dedicated for the inventory stock for the site.
 * This might be easily replaced with access to a Database way down in this course.
 */
public class Inventory {

    //  Attributes:
    private LocalDate lastUpdate;
    public ArrayList<Product> inventory;

    /**
     * Constructor for an inventory, with only a list of products to initialize it.
     * It initializes the creation date as the date on which the object is instantiated.
     *
     * @param baseInventory,    the initial products to store
     */
    public Inventory(ArrayList<Product> baseInventory){
        this.lastUpdate = LocalDate.now();
        this.inventory = new ArrayList<>(baseInventory);
    }

    /**
     * Default constructor. Similar to the first constructor, but initializes
     * the inventory as an empty arraylist.
     */
    public Inventory(){
        this.lastUpdate = LocalDate.now();
        this.inventory = new ArrayList<>();
    }

        // SETTERS AND GETTERS

    //  Getter for date:
    public LocalDate getLastUpdate(){
        return this.lastUpdate;
    }

    //  Setter for date:
    public void setLastUpdate(LocalDate updateTime){
        this.lastUpdate = updateTime;
    }

    //////////////// FUNCTIONAL METHODS

    /**
     * Method used to add a new product to the list.
     * If such a product exists, add its stock to the one already in the inventory.
     * @param product
     */
    public void addProduct(Product product){
        this.inventory.add(product);
        this.lastUpdate = LocalDate.now();
    }

    /**
     * Method used to remove a product from inventory altogether.
     * @param product
     */
    public void removeProduct(Product product){
        this.inventory.remove(product);
        this.lastUpdate = LocalDate.now();
    }

    /**
     * Method used for taking an amount of a certain product out of the inventory.
     *
     * @param product   , the product to look for in the inventory.
     * @param amount    , the amount of product to take from the inventory.
     */
    public void takeProduct(Product product, int amount){
        //  DUE TO IMPLEMENT.
    }


    /**
     * Overriden method toString(), to show the products stored in the Inventory.
     */
    @Override
    public String toString(){
        StringBuilder retornable = new StringBuilder();
        retornable.append(format("Inventory. Last update: %s\n{\n",
                this.lastUpdate.toString()));
        for(Product prod:this.inventory){
            retornable.append(prod.toString()).append("\n");
        }
        retornable.append("}");
        return retornable.toString();
    }


}
