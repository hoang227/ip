package amanda.exception;

/**
 * InvalidDescriptionException is thrown when the user try to add a task without providing a description
 */
public class InvalidDescriptionException extends AmandaException {

	public InvalidDescriptionException() {
		super("You tried to add a task without a description. Why are you like this?\n");
	}
}
