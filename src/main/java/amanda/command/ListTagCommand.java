package amanda.command;

import amanda.manager.StoreManager;
import amanda.manager.TaskList;
import amanda.task.Task;
import amanda.ui.Ui;

/**
 * ListTagCommand is a command that lists all the tags associated with the task
 */
public class ListTagCommand extends Command {

	private final Task task;

	public ListTagCommand(Task task) {
		this.task = task;
	}

	/**
	 * List out all the tags associated with the task
	 * @param tasks the current task list.
	 * @param store the store manager that write any changes to the storage file.
	 */
	@Override
	public void execute(TaskList tasks, StoreManager store) {
		Ui.addResponse("Here are the tags associated with " + task + "\n" + task.listTags());
	}
}
