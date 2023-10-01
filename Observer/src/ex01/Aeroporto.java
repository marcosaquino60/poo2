package ex01;

import java.util.Observable;
import java.util.Observer;

public class Aeroporto implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        CentralEstacao cet = (CentralEstacao) o;
        System.out.println("Dados das rajadas de vento: " + cet.getRajadasVento() + " m/s - Enviar para o Aeroporto de Uberlândia.");
    }
}
