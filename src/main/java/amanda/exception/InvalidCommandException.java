package amanda.exception;

/**
 * InvalidCommandException is thrown when user enter a keyword that is not a command
 */
public class InvalidCommandException extends AmandaException {

	public InvalidCommandException() {
		super("That's not even a command. I have no idea what you just said!\n");
	}
}
