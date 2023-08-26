package ex2;

public class Corolla implements IVehicle{
    @Override
    public void start() {
        System.out.println("Ligando Toyota Corolla . . .");
    }

    @Override
    public void drive() {
        System.out.println("Dirigindo Toyota Corolla . . .");
    }

    @Override
    public void stop() {
        System.out.println("Parando Toyota Corolla . . .");
    }
}
