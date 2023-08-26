package ex1;

public class Tomate extends PizzaDecorator {

    public Tomate(Pizza pizza) {
        super(pizza);
    }
    public String getDescription() {
        return pizza.getDescription() + ", tomate";
    }

    @Override
    public double price() {
        return pizza.price() + 2.00;
    }
}
