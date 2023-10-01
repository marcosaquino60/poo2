package ex01;

import java.util.Observable;
import java.util.Observer;

public class Prefeitura implements Observer{
    @Override
    public void update(Observable o, Object arg) {
        CentralEstacao cet = (CentralEstacao) o;
        if (cet.getUmidade() > 80) {
            System.out.println("Alerta da Defesa Civil: Umidade do ar acima de 80% - Emitir alerta para a Prefeitura!");
        }
    }
}