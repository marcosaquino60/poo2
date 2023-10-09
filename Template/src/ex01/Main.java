package ex01;

public class Main {
    public static void main(String[] args) {
        BebidaTemplate cafe = new Cafe();
        BebidaTemplate capuccino = new Capuccino();
        BebidaTemplate cha = new Cha();

        System.out.println("Preparando Café:");
        cafe.prepararBebida();

        System.out.println("\nPreparando Capuccino:");
        capuccino.prepararBebida();

        System.out.println("\nPreparando Chá:");
        cha.prepararBebida();
    }
}
