package ex03;

public interface Visitor {
    void visit(Carro carro);
    void visit(Bicicleta bicicleta);
    void visit(Onibus onibus);
}
