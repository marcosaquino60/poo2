package ex1;

public class FabricanteCelularSingleton {
    private static FabricanteCelular apple;
    private static FabricanteCelular samsung;

    public static FabricanteCelular getInstance(String fabricante) {
        if(fabricante.equals("apple")) {
            if(apple == null)
                return new Apple();
            return apple;
        }
        else {
            if(samsung == null)
                return new Samsung();
            return samsung;
        }
    }
}
