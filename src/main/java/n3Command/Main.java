package n3Command;

import n3Command.commands.AccelerateCommand;
import n3Command.commands.BrakeCommand;
import n3Command.commands.StartCommand;
import n3Command.invokers.Invoker;
import n3Command.reveivers.Bicycle;
import n3Command.reveivers.Car;
import n3Command.reveivers.Plane;
import n3Command.reveivers.Ship;

public class Main {
    public static void main(String[] args) {
        Invoker invoker = new Invoker();

        Bicycle bicycle = new Bicycle();
        Car car = new Car();
        Plane plane = new Plane();
        Ship ship = new Ship();


        // Bicycle
        invoker.setCommand(new StartCommand(bicycle));
        invoker.setCommand(new AccelerateCommand(bicycle));
        invoker.setCommand(new BrakeCommand(bicycle));

        // Car
        invoker.setCommand(new StartCommand(car));
        invoker.setCommand(new AccelerateCommand(car));
        invoker.setCommand(new BrakeCommand(car));

        // Plane
        invoker.setCommand(new StartCommand(plane));
        invoker.setCommand(new AccelerateCommand(plane));
        invoker.setCommand(new BrakeCommand(plane));

        // Ship
        invoker.setCommand(new StartCommand(ship));
        invoker.setCommand(new AccelerateCommand(ship));
        invoker.setCommand(new BrakeCommand(ship));

        invoker.executeCommand();
    }

}
