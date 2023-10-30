package ex02;

public class NormalFrete implements FreteStrategy {
    @Override
    public double calculaFrete(double peso) {
        return peso * 1.5;
    }
}
