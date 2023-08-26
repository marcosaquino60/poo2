package ex2;

public class Cafeteria {
    /*
    CAFÉ EXPRESSO: R$5.00
    CAFÉ DESCAFEINADO: R$3.00
    CANELA: R$1.00
    LEITE: R$2.00
    CHOCOLATE: R$3.00
    */
    public static void main(String[] args) {
        Cafe cafe1 = new Canela(new Leite(new Expresso()));
        Cafe cafe2 = new Chocolate(new Leite(new Decaf()));
        System.out.println("Descrição: " + cafe1.getDescription());
        System.out.println("Preço: " + cafe1.price());
        System.out.println("Descrição: " + cafe2.getDescription());
        System.out.println("Preço: " + cafe2.price());
    }
}
