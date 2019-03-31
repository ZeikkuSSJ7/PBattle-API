package exceptions;

/**
 * NotAValidPositionException
 */
public class NotAValidPositionException extends Exception {
    private static final long serialVersionUID = -3152599109961796077L;
    public NotAValidPositionException() {
        super("That position is not valid!");
    }
}