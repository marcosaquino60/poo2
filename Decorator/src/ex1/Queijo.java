package ex1;

public class Queijo extends PizzaDecorator{

    public Queijo(Pizza pizza) {
        super(pizza);
    }
    public String getDescription() {
        return pizza.getDescription() + ", queijo";
    }
    public double price() {
        return pizza.price() + 3.0;
    }
}
