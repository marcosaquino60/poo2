package ex2;

public class Canela extends CafeDecorator {

    public Canela(Cafe cafe) {
        super(cafe);
    }

    @Override
    public String getDescription() {
        return cafe.getDescription() + ", canela";
    }

    @Override
    public double price() {
        return cafe.price() + 1.0;
    }
}
