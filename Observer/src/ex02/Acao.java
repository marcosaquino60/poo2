package ex02;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

public class Acao extends Observable {
    private String nome;
    private double preco;
    private List<Investidor> investidores = new ArrayList<>();

    public Acao(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public void setPreco(double novoPreco) {
        if (novoPreco != preco) {
            preco = novoPreco;
            setChanged();
            notifyObservers(preco);
        }
    }

    public void adicionarInvestidor(Investidor investidor) {
        investidores.add(investidor);
        addObserver(investidor);
    }

    public void removerInvestidor(Investidor investidor) {
        investidores.remove(investidor);
        deleteObserver(investidor);
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }
}
