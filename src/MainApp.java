import paymentmethods.BankAccount;
import products.CartProduct;
import products.Product;
import serviceclasses.TestObjectsService;
import siteutilities.Inventory;
import users.Client;
import users.User;

import static java.lang.String.format;
import static serviceclasses.MenuPromptsService.cartPurchaseMenu;
import static serviceclasses.MenuPromptsService.promptProduct;

/**
 * Class used to test all classes (except the abstract ones) can be instantiated.
 */
public class MainApp {


    public static void main(String[] args){


        //  Initialize an inventory with several products:
        Inventory<Product> inventory = TestObjectsService.defaultProductInventory();

        BankAccount testAccount = new BankAccount(
                1000, 1, 100, "PabloCash");

        Client testClient = new Client("Pablo", "007", testAccount);

        cartPurchaseMenu(testClient, inventory);






    }


}
