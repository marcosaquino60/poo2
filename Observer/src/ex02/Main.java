package ex02;

public class Main {
    public static void main(String[] args) {
        Acao acao = new Acao("Empresa A", 100.0);

        Investidor investidor1 = new Investidor("Investidor 1", 90.0, 110.0);
        Investidor investidor2 = new Investidor("Investidor 2", 95.0, 105.0);

        acao.adicionarInvestidor(investidor1);
        acao.adicionarInvestidor(investidor2);

        acao.setPreco(95.0); // Investidor 1 vende suas ações
        acao.setPreco(105.0); // Investidor 2 compra ações

    }
}
