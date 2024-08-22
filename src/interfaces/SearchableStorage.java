package interfaces;

/**
 * Interface 'Searchable'.
 * This interface will be applied to all classes that store multiple Objects of type T,
 * and need to retrieve one of these T-objects
 *
 * @param <T>   , the Object type that this class stores.
 */
public interface SearchableStorage<T>{

    /**
     * A constructor for a String that shows the objects in a list menu.
     *
     * @return  A descriptive String that shows the options within the Searchable,
     *          with indexes to access them.
     */
    public String menuDescriptor();


    /**
     * Method used to validate if an index can be used safely.
     *
     * @param index , the index of the element one wants to retrieve.
     * @return      'true'  if the index can be accessed,
     *              'false' otherwise.
     */
    public boolean isRetrievable(int index);


    public static String nonRetrievableMessage(int index) {

        return "Incorrect index (" + index + "), please retry";
    }


    /**
     * A method that returns the instance stored in the
     *
     * @param index , the
     * @return  The correct index
     */
    public T retrieve(int index);

}
