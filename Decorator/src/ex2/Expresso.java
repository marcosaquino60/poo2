package ex2;

public class Expresso implements Cafe {

    @Override
    public String getDescription() {
        return "Café Expresso";
    }

    @Override
    public double price() {
        return 5.00;
    }
}
