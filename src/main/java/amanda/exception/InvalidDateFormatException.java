package amanda.exception;

/**
 * InvalidDateFormatException is thrown when the user enter a date in the wrong format.
 */
public class InvalidDateFormatException extends AmandaException {

	public InvalidDateFormatException() {
		super("Please enter the date and time in the correct format. Please don't waste my time!\n");
	}
}
