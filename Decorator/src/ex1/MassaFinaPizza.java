package ex1;

public class MassaFinaPizza implements Pizza {

    @Override
    public String getDescription() {
        return "Pizza de massa fina";
    }

    @Override
    public double price() {
        return 10.00;
    }
}
