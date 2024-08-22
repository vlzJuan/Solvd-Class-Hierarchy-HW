package interfaces;


/**
 * Interface for all classes that I can 'purchase'.
 *
 * This will be applied to Product and Cart.
 */

public interface Purchasable {

    /**
     * Basic boolean method, used to determine if there is stock of this product
     * in inventory.
     *
     * @return  'true' if the stock is greater than zero, 'false' otherwise.
     */
    public boolean hasStock();

    /**
     * Overloaded boolean method, using an int as a parameter.
     * It is used to determine if there is enough stock of this product
     * in inventory to make a purchase of 'solicited amount' units.
     *
     * @param solicitedAmount , the amount of stock to pull from inventory
     *                        in the purchase that requests this method.
     * @return  'true' if the stock is enough for purchase, 'false' otherwise.
     */
    public boolean hasStock(int solicitedAmount);


    /**
     * Method used to add more stock to this item.
     *
     * @param extraStock,   the amount to add to the stock of this product.
     * @return              'true' if the operation was performed,
     *                      'false' otherwise.
     */
    public boolean restock(int extraStock);


    /**
     * Method used to remove stock from a Purchasable item.
     *
     * @param removedStock, the amount of stock to remove.
     * @return              'true' if the stock was removed,
     *                      'false' if the operation was not performed.
     */
    public boolean removeStock(int removedStock);





}
