package amanda.task;

/**
 * A tag that can be attached to a task
 */
public class Tag {

	private final String description;

	public Tag(String input) {
		this.description = input;
	}

	/**
	 * Get the task description
	 * @return task description
	 */
	public String getDesc() {
		return description;
	}
}
