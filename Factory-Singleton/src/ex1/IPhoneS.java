package ex1;

public class IPhoneS implements Celular{
    @Override
    public void fazLigacao() {
        System.out.println("Fazendo ligação com IphoneS");
    }

    @Override
    public void tiraFoto() {
        System.out.println("Tirando foto com IphoneS");
    }
}
