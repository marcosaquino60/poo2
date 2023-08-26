package ex1;

public class Pizzaria {
    /*  preço massa fina: R$10.00
        preço massa espessa: R$15.00
        preço queijo: R$3.00
        preço tomate: R$2.00
        preço ovo: R$3.50
    */

    public static void main(String[] args) {
        Pizza marguerita = new Queijo(new Tomate(new MassaFinaPizza()));
        System.out.println("Descrição: " + marguerita.getDescription());
        System.out.println("Preço: " + marguerita.price());
        Pizza portuguesa = new Queijo(new Tomate(new MassaEspessaPizza()));
        System.out.println("Descrição: " + portuguesa.getDescription());
        System.out.println("Preço: " + portuguesa.price());
    }
}
