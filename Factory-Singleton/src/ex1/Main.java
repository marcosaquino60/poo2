package ex1;

public class Main {
    public static void main(String[] args) {
        //criando fabricantes usando o padrão Singleton
        FabricanteCelular apple = FabricanteCelularSingleton.getInstance("apple");
        FabricanteCelular samsung = FabricanteCelularSingleton.getInstance("samsung");

        //criando celulares usando o padrão Factory
        Celular iphonex = apple.constroiCelular("iphonex");
        Celular iphones = apple.constroiCelular("iphones");
        Celular galaxy20 = samsung.constroiCelular("galaxy20");
        Celular galaxy8 = samsung.constroiCelular("galaxy8");

        //testando iphones
        iphonex.fazLigacao();
        iphonex.tiraFoto();

        iphones.fazLigacao();
        iphones.tiraFoto();

        //testando galaxys
        galaxy20.fazLigacao();
        galaxy20.tiraFoto();

        galaxy8.fazLigacao();
        galaxy8.tiraFoto();
    }
}
