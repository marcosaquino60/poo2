package ex01;

import java.util.Observable;

public class CentralEstacao extends Observable {
    private int temperatura;
    private int umidade;
    private int rajadasVento;

    public void setMedicoes(int temperatura, int umidade, int rajadasVento) {
        this.temperatura = temperatura;
        this.umidade = umidade;
        this.rajadasVento = rajadasVento;

        setChanged();
        notifyObservers();
    }

    public int getTemperatura() {
        return temperatura;
    }

    public int getUmidade() {
        return umidade;
    }

    public int getRajadasVento() {
        return rajadasVento;
    }
}


