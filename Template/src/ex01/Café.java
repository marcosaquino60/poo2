package ex01;

class Cafe extends BebidaTemplate {
    @Override
    void prepararBebidaEspecifica() {
        System.out.println("Fazendo café");
    }
}