package ex2;

public class Etios implements IVehicle{
    @Override
    public void start() {
        System.out.println("Ligando Toyota Etios . . .");
    }

    @Override
    public void drive() {
        System.out.println("Dirigindo Toyota Etios . . .");
    }

    @Override
    public void stop() {
        System.out.println("Parando Toyota Etios . . .");
    }
}
