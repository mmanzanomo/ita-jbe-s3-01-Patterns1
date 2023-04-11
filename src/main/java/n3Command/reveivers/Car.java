package n3Command.reveivers;


public class Car extends Vehicle {

    @Override
    public void start() {
        System.out.println("The Car is starting the engine.");
    }

    @Override
    public void accelerate() {
        System.out.println("The car is increasing speed.");
    }

    @Override
    public void brake() {
        System.out.println("The car is slowing down speed");
    }
}
