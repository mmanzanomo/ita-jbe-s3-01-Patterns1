package n3Command.reveivers;

public class Plane extends Vehicle {

    @Override
    public void start() {
        System.out.println("The plane is starting the engines.");
    }

    @Override
    public void accelerate() {
        System.out.println("The plane is increasing speed.");
    }

    @Override
    public void brake() {
        System.out.println("The plane is slowing down speed");
    }
}
