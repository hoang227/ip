package amanda.exception;

/**
 * InvalidIndexException is thrown when the user enter an invalid index
 */
public class InvalidIndexException extends AmandaException {

	public InvalidIndexException() {
		super("Try inputting an index that actually exist. Thank you.\n");
	}
}
