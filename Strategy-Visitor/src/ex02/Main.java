package ex02;

public class Main {
    public static void main(String[] args) {
        CarrinhoCompras carrinho = new CarrinhoCompras();

        // Define a estratégia de frete como Sedex
        carrinho.setFreteStrategy(new SedexFrete());
        double freteSedex = carrinho.calculaFrete(5.0); // Peso de 5.0 kg
        System.out.println("Frete Sedex: R$" + freteSedex);

        // Define a estratégia de frete como Normal
        carrinho.setFreteStrategy(new NormalFrete());
        double freteNormal = carrinho.calculaFrete(5.0); // Peso de 5.0 kg
        System.out.println("Frete Normal: R$" + freteNormal);
    }
}
