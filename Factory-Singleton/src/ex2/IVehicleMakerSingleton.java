package ex2;

public class IVehicleMakerSingleton {
    private static IVehicleMaker toyota;
    private static IVehicleMaker honda;

    public static IVehicleMaker getInstance(String ivehiclemaker) {
        if(ivehiclemaker.equals("toyota")) {
            if(toyota == null)
                return new Toyota();
            return toyota;
        } else {
            if(honda == null)
                return new Honda();
            return honda;
        }
    }
}
/*A razão por usar o padrão Singleton nessa classe é garantir que não hajam múltiplas instâncias desnecessárias da classe Toyota e Honda,
    e sim usar só uma (para cada) que será compartilhada, o que economiza recursos e mantém a consistência dos objetos criados */
