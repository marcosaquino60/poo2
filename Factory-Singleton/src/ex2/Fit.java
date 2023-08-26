package ex2;

public class Fit implements IVehicle{
    @Override
    public void start() {
        System.out.println("Ligando Honda Fit . . .");
    }

    @Override
    public void drive() {
        System.out.println("Dirigindo Honda Fit . . .");
    }

    @Override
    public void stop() {
        System.out.println("Parando Honda Fit . . .");
    }
}
