package ex2;

public class Toyota implements IVehicleMaker{

    @Override
    public IVehicle makeVehicle(String modelo) {
        //método que centraliza a criação de objetos sem que ela esteja espalhada por todo o código(Padrão Factory)
        if(modelo.equals("corolla")) {
            return new Corolla();
        }
        else if(modelo.equals("hillux")) {
            return new Hillux();
        }
        else if(modelo.equals("etios")) {
            return new Etios();
        }
        return null;
    }
}
