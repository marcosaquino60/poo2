package ex1;

public class PizzaDecorator implements Pizza {
    protected Pizza pizza;
    public PizzaDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return null;
    }

    @Override
    public double price() {
        return 0;
    }
}
