package ex01;

public class Main {
    public static void main(String[] args) {
        CentralEstacao cet = new CentralEstacao();
        Prefeitura prefeitura = new Prefeitura();
        Aeroporto aeroporto = new Aeroporto();

        cet.addObserver(prefeitura);
        cet.addObserver(aeroporto);

        cet.setMedicoes(25,85,10);
        cet.deleteObserver(prefeitura);
        cet.setMedicoes(28,78,12);
    }
}
