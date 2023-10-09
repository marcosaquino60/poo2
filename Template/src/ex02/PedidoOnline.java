package ex02;

class PedidoOnline extends ProcessadorPedidoTemplate {

    @Override
    double calcularTotal(int quantidadeItens, double valorItem) {
        return quantidadeItens * valorItem;
    }

    @Override
    void processarPagamento(double total, String formaPagamento) {
        System.out.println("Pagamento online no valor de: " + total + " via " + formaPagamento);
    }

    @Override
    boolean decidirEntrega() {
        return true;
    }

    @Override
    void realizarEntrega() {
        System.out.println("Entrega realizada no endereço do cliente.");
    }
}
