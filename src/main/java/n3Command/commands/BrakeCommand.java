package n3Command.commands;

import n3Command.interfaces.ICommand;
import n3Command.reveivers.Vehicle;

public class BrakeCommand implements ICommand {
    private Vehicle vehicle;


    public BrakeCommand(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public void execute() {
        this.vehicle.brake();
    }

}
