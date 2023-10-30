package ex03;

public class Bicicleta extends Veiculo{
    String cor;
    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
