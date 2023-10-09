package ex01;
abstract class BebidaTemplate {
    final void prepararBebida() {
        aquecerAgua();
        prepararBebidaEspecifica();
        colocarNaXicara();
        adicionarCondimentos();
    }
    abstract void prepararBebidaEspecifica();

    void aquecerAgua() {
        System.out.println("Aquecendo a água");
    }

    void colocarNaXicara() {
        System.out.println("Colocando na xícara");
    }

    void adicionarCondimentos() {
        System.out.println("Adicionando condimentos");
    }
}
