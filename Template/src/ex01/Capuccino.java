package ex01;

class Capuccino extends BebidaTemplate {
    @Override
    void prepararBebidaEspecifica() {
        System.out.println("Fazendo capuccino");
    }
}
