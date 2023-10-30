package ex02;

public class SedexFrete implements FreteStrategy {

    @Override
    public double calculaFrete(double peso) {
        return peso * 2.5;
    }
}
