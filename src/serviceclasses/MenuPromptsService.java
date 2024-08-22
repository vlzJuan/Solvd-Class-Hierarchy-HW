package serviceclasses;
import interfaces.SearchableStorage;
import products.Product;
import siteutilities.Inventory;

import java.util.Scanner;

/**
 * A service class that will allow me to
 */
public class MenuPromptsService {


    /**
     * Service method to ask a user to create a new product.
     * @return  The instantiated products.
     */
    public static Product promptProduct(){
        /// Scanner scan = new Scanner(System.in);
        String name = promptString("Enter the new product's name");
        int stock = promptInt("Enter the new product's initial stock: ");
        double cost = promptDouble("Enter the new product's cost");

        return new Product(name, stock, cost);
    }


    /**
     * Service method, used to ask a user for a String.
     * @param msj   , the message to pass during the prompt.
     * @return      the string inputted by the user.
     */
    public static String promptString(String msj){
        Scanner scan = new Scanner(System.in);
        System.out.println(msj);
        return scan.nextLine();
    }

    public static int promptInt(String msj){
        Scanner scan = new Scanner(System.in);
        System.out.println(msj);
        return scan.nextInt();
    }


    public static double promptDouble(String msj){
        Scanner scan = new Scanner(System.in);
        System.out.println(msj);
        return scan.nextDouble();
    }


    public static void showInventory(SearchableStorage<?> inv){
        System.out.println(inv.toString());
    }


    /**
     * static method: "promptMenuLoop". Takes a SearchableStorage, and
     * prompts the user to pick an element within it. This method remains
     * in a prompt loop until an admisible option is selected (A number within
     * the accessible range for the container, or -1 to finish the operation.)
     * @param storage   , a class that implements SearchableStorage.
     * @return          the correct index for the option presented.
     */
    public static int promptMenuLoop(SearchableStorage<?> storage){
        Scanner scan = new Scanner(System.in);
        int ret = -2;
        boolean loopFlag = true;
        while(loopFlag) {
            System.out.println(storage.menuDescriptor());
            ret = scan.nextInt();

            if (ret >= -1 && ret < storage.size()) {
                loopFlag = false;
            }
            else{
                System.out.println(SearchableStorage.nonRetrievableMessage(ret));
            }
        }
        return ret;
    }



}
