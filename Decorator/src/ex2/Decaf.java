package ex2;

public class Decaf implements Cafe {

    @Override
    public String getDescription() {
        return "Café descafeinado";
    }

    @Override
    public double price() {
        return 3.0;
    }
}
