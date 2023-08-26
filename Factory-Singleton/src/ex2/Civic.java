package ex2;

public class Civic implements IVehicle{
    @Override
    public void start() {
        System.out.println("Ligando Honda Civic . . .");
    }

    @Override
    public void drive() {
        System.out.println("Dirigindo Honda Civic . . .");
    }

    @Override
    public void stop() {
        System.out.println("Parando Honda Civic . . .");
    }
}
