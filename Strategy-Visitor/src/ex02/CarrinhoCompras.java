package ex02;

public class CarrinhoCompras {
    private FreteStrategy freteStrategy;

    public void setFreteStrategy(FreteStrategy freteStrategy) {
        this.freteStrategy = freteStrategy;
    }
    public double calculaFrete(double peso) {
        return freteStrategy.calculaFrete(peso);
    }
}
