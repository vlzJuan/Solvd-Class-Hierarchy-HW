package exceptions;

public class ItemNotInStockException extends RuntimeException {
    public ItemNotInStockException(String message) {
        super(message);
    }
}
