package amanda.exception;

/**
 * EmptyDateException is thrown when the user do not enter a date when they try to add a deadline or event
 */
public class EmptyDateException extends AmandaException {

	public EmptyDateException() {
		super("Please enter a date. Do you not want to get this done?");
	}
}
