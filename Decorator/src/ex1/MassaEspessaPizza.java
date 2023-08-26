package ex1;

public class MassaEspessaPizza implements Pizza {

    @Override
    public String getDescription() {
        return "Pizza de massa espessa ";
    }

    @Override
    public double price() {
        return 15.0;
    }
}
