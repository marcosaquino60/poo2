package ex2;

public class CafeDecorator implements Cafe {
    Cafe cafe;

    public CafeDecorator(Cafe cafe) {
        this.cafe = cafe;
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
