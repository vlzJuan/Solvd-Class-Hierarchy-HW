import products.CartProduct;
import siteutilities.Inventory;
import products.Product;

import static java.lang.String.format;
import static java.lang.Thread.sleep;
import static serviceclasses.MenuPromptsService.promptProduct;

/**
 * Class used to test all classes (except the abstract ones) can be instantiated.
 */
public class MainApp {


    public static void main(String[] args){

        /*
        ///////////////////////////////////////////////////////////////////////////////
        //  VERIFICATION OF PACKAGE 'products':

        Product prodA = new Product("Nachos", 50, 1.0);

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
        */

        System.out.println("Checking comparisson between two Products:");

        Product prod1 = promptProduct();
        Product prod2 = promptProduct();

        System.out.println(format("prod1: {%s}, prod2: {%s}",prod1, prod2));
        System.out.println("Hashcodes are: " + prod1.hashCode() + " for prod1 and "
                + prod2.hashCode() + " for prod2.");
        System.out.println("Are both products equal? " + prod1.equals(prod2));

        System.out.println("Instantiating a CartProduct based off prod1");
        CartProduct cartProduct = new CartProduct(prod1);

        System.out.println("Should be equal to prod1... is it? " + cartProduct.equals(prod1));
        System.out.println("Is it equal to prod2? : " + cartProduct.equals(prod2));




    }


}
