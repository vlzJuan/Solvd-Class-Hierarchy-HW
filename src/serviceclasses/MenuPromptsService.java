package serviceclasses;
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


    public static void showInventory(Inventory inv){
        System.out.println(inv.toString());
    }





}
