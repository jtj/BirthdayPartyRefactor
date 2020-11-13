package scrap.heap.refactor.order.request.exception;

public class InvalidBalloonQuantityException extends Exception {

	private static final long serialVersionUID = -7447210551046930725L;

    /**
     * Constructs an {@code InvalidBalloonQuantityException} with no detail message.
     */
    public InvalidBalloonQuantityException () {
        super();
    }

    /**
     * Constructs an {@code InvalidBalloonQuantityException} with the
     * specified detail message.
     *
     * @param   message   the detail message.
     */
    public InvalidBalloonQuantityException (String message) {
        super (message);
    }

}
