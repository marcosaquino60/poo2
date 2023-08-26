package ex2;

public class Chocolate extends CafeDecorator {

    public Chocolate(Cafe cafe) {
        super(cafe);
    }

    @Override
    public String getDescription() {
        return cafe.getDescription() + ", chocolate";
    }

    @Override
    public double price() {
        return cafe.price() + 3.0;
    }
}
