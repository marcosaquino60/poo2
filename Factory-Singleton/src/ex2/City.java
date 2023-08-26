package ex2;

public class City implements IVehicle{
    @Override
    public void start() {
        System.out.println("Ligando Honda City . . .");
    }

    @Override
    public void drive() {
        System.out.println("Dirigindo Honda City . . .");
    }

    @Override
    public void stop() {
        System.out.println("Parando Honda City . . .");
    }
}
