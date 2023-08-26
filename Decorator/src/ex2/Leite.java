package ex2;

public class Leite extends CafeDecorator {

    public Leite(Cafe cafe) {
        super(cafe);
    }

    @Override
    public String getDescription() {
        return cafe.getDescription() + ", leite";
    }

    @Override
    public double price() {
        return cafe.price() + 2.0;
    }
}
