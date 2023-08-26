package ex1;

public class Ovo extends PizzaDecorator {

    public Ovo(Pizza pizza) {
        super(pizza);
    }
    public String getDescription() {
        return pizza.getDescription() + ", ovo";
    }
    public double price() {
        return pizza.price() + 3.50;
    }
}
