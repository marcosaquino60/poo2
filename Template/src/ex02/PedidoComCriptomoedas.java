package ex02;

class PedidoComCriptomoedas extends ProcessadorPedidoTemplate {

    @Override
    double calcularTotal(int quantidadeItens, double valorItem) {
        return quantidadeItens * valorItem;
    }

    @Override
    void processarPagamento(double total, String formaPagamento) {
        System.out.println("Pagamento com criptomoedas no valor de: " + total);
    }

    @Override
    boolean decidirEntrega() {
        return true;
    }

    @Override
    void realizarEntrega() {
        System.out.println("Entrega realizada via correio para o endereço do cliente.");
    }
}