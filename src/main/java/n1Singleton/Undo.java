package n1Singleton;

import java.util.ArrayList;
import java.util.List;


/*
 * This class allows you to add, remove or list commands implementing a singleton pattern.
 */
public class Undo {
    private static Undo undo;
    private List<String> commands;


    private Undo() {
        this.commands = new ArrayList<String>();
    }

    // This method calls the constructor if it is not already exists.
    public static Undo getUndoInstance() {
        if (Undo.undo == null) {
            Undo.undo = new Undo();
        }
        return Undo.undo;
    }

    public void addCommand(String string) {
        this.commands.add(string);
    }

    public void deleteCommand(String string) {
        this.commands.remove(string);
    }

    public List<String> getCommands() {
        return this.commands;
    }

}
