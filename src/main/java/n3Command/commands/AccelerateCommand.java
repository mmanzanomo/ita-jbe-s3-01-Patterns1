package n3Command.commands;

import n3Command.interfaces.ICommand;
import n3Command.reveivers.Vehicle;

public class AccelerateCommand implements ICommand {
    private Vehicle vehicle;


    public AccelerateCommand(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public void execute() {
        this.vehicle.accelerate();
    }

}
