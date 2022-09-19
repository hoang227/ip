package amanda;

import javafx.application.Application;
import java.lang.reflect.Method;

/**
 * A launcher class to workaround classpath issues.
 */
public class Launcher {
	public static void main(String[] args) {

		try {
			// Invoke the first method of the class:
			Application.launch(Main.class, args);
		}
		catch(Exception e) {
			// Print the wrapper exception:
			System.out.println("Wrapper exception: " + e);

			// Print the 'actual' exception:
			System.out.println("Underlying exception: " + e.getCause());
		}
	}
}