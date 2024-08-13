import siteutilities.Inventory;
import products.Product;

/**
 * Class used to test all classes (except the abstract ones) can be instantiated.
 */
public class MainApp {


    public static void main(String[] args){

        ///////////////////////////////////////////////////////////////////////////////
        //  VERIFICATION OF PACKAGE 'products':

        Product prodA = new Product("asd", 50, 1.0);
        System.out.println(prodA);
        System.out.println("\n");

        Inventory storeInventory = new Inventory();

        storeInventory.addProduct(prodA);
        storeInventory.addProduct(
                new Product("Water 500ml", 50, 1.6));
        storeInventory.addProduct(
                new Product("Orange Juice 500ml", 20, 2.3));
        storeInventory.addProduct(
                new Product("Yogurt 500ml", 15, 2.1));
        System.out.println(storeInventory);
        //
        ///////////////////////////////////////////////////////////////////////////////


    }


}
