package ex1;

public class Apple implements FabricanteCelular{

    @Override
    public Celular constroiCelular(String modelo) {
        if(modelo.equals("iphones")) {
            return new IPhoneS();
        }
        else if(modelo.equals("iphonex")) {
            return new IphoneX();
        }
        return null;
    }
}
