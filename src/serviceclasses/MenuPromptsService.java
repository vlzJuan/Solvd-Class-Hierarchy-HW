package serviceclasses;
import enums.ProductCategory;
import exceptions.IndexOutOfRangeException;
import exceptions.NotEnoughStockException;
import interfaces.IndexableByMenu;
import interfaces.SearchableStorage;
import products.Product;
import siteutilities.Cart;
import siteutilities.Container;
import siteutilities.Inventory;
import users.Client;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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

        return new Product(name, stock, cost, ProductCategory.UNDEFINED);
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


    public static void showInventory(Container<?> inv){
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
    public static int promptMenuLoop(Container<?> storage){
        Scanner scan = new Scanner(System.in);
        int ret = -2;
        boolean loopFlag = true;
        while(loopFlag) {
            // Constructed the menu from a stream instead of a string in the class.
            System.out.println("Input the corresponding number to select the item (input '-1' to exit):");
            storage.menuDescriptorIndexedStream().forEach(line -> System.out.println(line));
            try {
                ret = scan.nextInt();
                loopFlag = false;
            }
            catch(InputMismatchException e){
                System.out.println(SearchableStorage.nonRetrievableMessage(ret));
            }
        }
        return ret;
    }



    public static void cartPurchaseMenu(Client client, Inventory inventory){

        Cart cart = new Cart();
        boolean menuFlag = true;
        while(menuFlag){

            System.out.println("User balance: " + client.balance());
            System.out.println("Current cart cost: "+ cart.totalCost());

            int retrievedIndex = promptMenuLoop(inventory);
            if(retrievedIndex ==-1){
                System.out.println("Finished iterating over the cart. Now purchasing...\n");
                System.out.println("The final cart is:");
                System.out.println(cart);

                cart.buy(client);
                menuFlag = false;
            }
            else{
                try{
                    Product prod = inventory.retrieve(retrievedIndex);
                    int amount = promptInt("Enter how much product you want to buy "
                            + "(max: " + prod.getStock() + "):");
                    cart.addProduct(prod, amount);
                }
                catch (NotEnoughStockException e){
                    System.out.println("The product does not have enough stock. Retry.");
                }
                catch(IndexOutOfRangeException e){
                    System.out.println("Index out of range. Retry.");
                }
            }

        }

    }



    // Constructor de menu usando un stream, en vez del toString.
    //static Consumer<Stream<? extends IndexableByMenu>> constructMenuFromStream = stream -> {
    //    List<? extends IndexableByMenu> aux = stream.toList();
    //    for (int i = 0; i < aux.size(); i++) {
    //        System.out.println(i + " - " + aux.get(i).descriptorForMenu());
    //    }
    //};



}
