package n3Command.invokers;

import n3Command.interfaces.ICommand;

import java.util.ArrayList;
import java.util.List;

public class Invoker {
    List<ICommand> commands = new ArrayList<ICommand>();

    public void setCommand(ICommand command) {
        this.commands.add(command);
    }

    public void executeCommand() {
        this.commands.forEach(command -> command.execute());
    }


}
