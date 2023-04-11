package n3Command.reveivers;

public class Ship extends Vehicle {

    @Override
    public void start() {
        System.out.println("The ship is starting the engines.");
    }

    @Override
    public void accelerate() {
        System.out.println("The ship is increasing speed.");
    }

    @Override
    public void brake() {
        System.out.println("The ship is slowing down speed");
    }
}
