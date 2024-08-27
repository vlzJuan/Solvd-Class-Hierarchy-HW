package siteutilities;


import interfaces.IndexableByMenu;
import interfaces.SearchableStorage;
import products.Product;

import java.time.LocalDate;
import java.util.ArrayList;

import static java.lang.String.format;

/**
 * Class dedicated for the inventory stock for the site.
 * This might be easily replaced with access to a Database way down in this course.
 */
public class Inventory<T extends IndexableByMenu> implements SearchableStorage<T> {

    //  Attributes:
    private LocalDate lastUpdate;
    public ArrayList<T> inventory;

    /**
     * Constructor for an inventory, with only a list of products to initialize it.
     * It initializes the creation date as the date on which the object is instantiated.
     *
     * @param baseInventory,    the initial products to store
     */
    public Inventory(ArrayList<T> baseInventory){
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


    //////////////// FUNCTIONAL METHODS

    /**
     * Method used to add a new product to the list.
     * If such a product exists, add its stock to the one already in the inventory.
     * @param product   , the product to be added to the inventory.
     */
    public void addProduct(T product){
        this.inventory.add(product);
        this.lastUpdate = LocalDate.now();
    }

    /**
     * Method used to remove a product from inventory altogether.
     * @param product   , the product to be removed from the inventory.
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
        for(T prod:this.inventory){
            retornable.append(prod.toString()).append("\n");
        }
        retornable.append("}");
        return retornable.toString();
    }



    ////// METHODS FROM INTERFACE 'SearchableStorage':

    /**
     * A constructor for a String that shows the objects in a list menu.
     *
     * @return  A descriptive String that shows the options within the Searchable,
     *          with indexes to access them.
     */
    @Override
    public String menuDescriptor() {

        StringBuilder retornable = new StringBuilder();
        retornable.append("Select the object to choose:\n");
        for(int i=0; i<inventory.size(); i++){
            retornable.append(i + " - " + inventory.get(i).descriptorForMenu() + "\n");
        }
        retornable.append("'-1' - Exit the menu.");
        return retornable.toString();
    }

    /**
     * Method used to validate if an index can be used safely.
     *
     * @param index , the index of the element one wants to retrieve.
     * @return      'true'  if the index can be accessed,
     *              'false' otherwise.
     */
    public boolean isRetrievable(int index){
        return (index>=0) && (index<this.inventory.size());
    }

    /**
     * A method that returns the instance stored in the
     *
     * @param index , the
     * @return  The correct index
     */
    public T retrieve(int index){
        return inventory.get(index);
    }


    /**
     * Method used to determine the internal size of this container.
     *
     * @return  an integer representing the size of the internal arrayList for
     *          the stored product within this instance.
     */
    public int size(){
        return this.inventory.size();
    }


}
