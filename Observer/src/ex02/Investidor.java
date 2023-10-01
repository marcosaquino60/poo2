package ex02;

import java.util.Observable;
import java.util.Observer;

public class Investidor implements Observer {
    private String nome;
    private double precoMinimo;
    private double precoMaximo;

    public Investidor(String nome, double precoMinimo, double precoMaximo) {
        this.nome = nome;
        this.precoMinimo = precoMinimo;
        this.precoMaximo = precoMaximo;
    }
    @Override
    public void update(Observable o, Object arg) {
        Acao acao = (Acao) o;
        double novoPreco = (double) arg;

        if (novoPreco <= precoMinimo) {
            System.out.println(nome + " vendeu " + acao.getNome() + " por " + novoPreco);
            acao.removerInvestidor(this);
        } else if (novoPreco >= precoMaximo) {
            System.out.println(nome + " comprou " + acao.getNome() + " por " + novoPreco);
            acao.removerInvestidor(this);
        }
    }
}
