package n3Command.commands;

import n3Command.interfaces.ICommand;
import n3Command.reveivers.Vehicle;

public class StartCommand implements ICommand {
    private Vehicle vehicle;

    public StartCommand(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public void execute() {
        vehicle.start();
    }
}
