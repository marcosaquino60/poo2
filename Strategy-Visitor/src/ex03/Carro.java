package ex03;

public class Carro extends Veiculo{
    String cor;
    String marca;
    String modelo;
    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
