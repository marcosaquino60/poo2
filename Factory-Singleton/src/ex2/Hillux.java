package ex2;

public class Hillux implements IVehicle{
    @Override
    public void start() {
        System.out.println("Ligando Toyota Hillux . . .");
    }

    @Override
    public void drive() {
        System.out.println("Dirigindo Toyota Hillux . . .");
    }

    @Override
    public void stop() {
        System.out.println("Parando Toyota Hillux . . .");
    }
}
