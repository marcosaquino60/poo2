package ex03;

public class Onibus extends Veiculo {
    int quantidadeDeLugares;
    int anoDeFabricacao;
    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
