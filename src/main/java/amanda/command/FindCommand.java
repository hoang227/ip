package main.java.amanda.command;

import main.java.amanda.manager.StoreManager;
import main.java.amanda.manager.TaskList;
import main.java.amanda.task.Task;
import main.java.amanda.ui.Ui;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class FindCommand extends Command {

    String key;

    public FindCommand(String input) {
        super(null, 0);
        StringTokenizer tokens = new StringTokenizer(input, " ");
        tokens.nextToken();
        this.key = tokens.nextToken();
    }

    @Override
    public void execute(TaskList tasks, Ui ui, StoreManager store) {
        String curr;
        int idx = 0;
        ArrayList<Task> matches = new ArrayList<>();
        for (Task t: tasks.getList()) {
            curr = t.getTask();
            StringTokenizer tokens = new StringTokenizer(curr, " ");
            String token;
            while (tokens.hasMoreTokens()) {
                token = tokens.nextToken();
                if (token.equals(key)) {
                    matches.add(tasks.getList().get(idx));
                    break;
                }
            }
            idx++;
        }
        ui.showFindCommand();
        for (int i = 0; i < matches.size(); i++) { // iterate through matches task list and print each task.
            System.out.println("     " + (i + 1) + "." + matches.get(i));
        }
    }
}
