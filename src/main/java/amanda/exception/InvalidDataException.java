package amanda.exception;

/**
 * InvalidDataException is thrown when the user storage file can't be read due to formatting error
 */
public class InvalidDataException extends AmandaException {

	public InvalidDataException() {
		super("I can't read your storage file, it's all messed up! Stop wasting my precious time.");
	}
}
