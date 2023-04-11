package n3Command.reveivers;

public class Bicycle extends Vehicle {

    @Override
    public void start() {
        System.out.println("The bicycle is start moving.");
    }

    @Override
    public void accelerate() {
        System.out.println("The bicycle is increasing speed.");
    }

    @Override
    public void brake() {
        System.out.println("The bicycle is slowing down speed");
    }

}
