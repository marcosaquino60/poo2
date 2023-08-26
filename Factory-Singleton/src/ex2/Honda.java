package ex2;

public class Honda implements IVehicleMaker{
    @Override
    public IVehicle makeVehicle(String modelo) {
        //método que centraliza a criação de objetos sem que ela esteja espalhada por todo o código(Padrão Factory)
        if(modelo.equals("city")) {
            return new City();
        }
        else if(modelo.equals("civic")) {
            return new Civic();
        }
        else if(modelo.equals("fit")) {
            return new Fit();
        }
        return null;
    }
}
