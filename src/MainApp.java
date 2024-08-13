import siteutilities.Inventory;
import products.Product;

/**
 * Class used to test all classes (except the abstract ones) can be instantiated.
 */
public class MainApp {


    public static void main(String[] args){

        ///////////////////////////////////////////////////////////////////////////////
        //  VERIFICATION OF PACKAGE 'products':

        Product prodA = new Product("Nachos", 50, 1.0);
        System.out.println(prodA);
        System.out.println("\n");

        System.out.println("Modifying prodA's stock to 77, and cost to 3.9");

        prodA.setStock(77);
        prodA.setCost(3.9);

        System.out.println("prodA's stock is:" + prodA.getStock());
        System.out.println("prodA's cost is: " + prodA.getCost());


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
