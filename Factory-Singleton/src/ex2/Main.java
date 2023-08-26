package ex2;

public class Main {
    public static void main(String[] args) {
        //Criando as marcas fabricantes através do padrão Singleton
        IVehicleMaker toyota = IVehicleMakerSingleton.getInstance("toyota");
        IVehicleMaker honda = IVehicleMakerSingleton.getInstance("honda");

        //Criando os modelos através do padrão Factory
        IVehicle corolla = toyota.makeVehicle("corolla");
        IVehicle hillux = toyota.makeVehicle("hillux");
        IVehicle etios = toyota.makeVehicle("etios");

        IVehicle city = honda.makeVehicle("city");
        IVehicle civic = honda.makeVehicle("civic");
        IVehicle fit = honda.makeVehicle("fit");

        //Testando os métodos da interface IVehicle
        corolla.start();
        corolla.drive();
        corolla.stop();

        hillux.start();
        hillux.drive();
        hillux.stop();

        etios.start();
        etios.drive();
        etios.stop();

        city.start();
        city.drive();
        city.stop();

        civic.start();
        civic.drive();
        civic.stop();

        fit.start();
        fit.drive();
        fit.stop();





    }
}
