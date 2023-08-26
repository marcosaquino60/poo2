package ex1;

public class IphoneX implements Celular{
    @Override
    public void fazLigacao() {
        System.out.println("Fazendo ligação com IphoneX");
    }

    @Override
    public void tiraFoto() {
        System.out.println("Tirando foto com IphoneX");
    }
}
