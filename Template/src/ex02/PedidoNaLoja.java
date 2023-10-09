package ex02;

class PedidoNaLoja extends ProcessadorPedidoTemplate {

    @Override
    double calcularTotal(int quantidadeItens, double valorItem) {
        return quantidadeItens * valorItem;
    }

    @Override
    void processarPagamento(double total, String formaPagamento) {
        System.out.println("Pagamento na loja no valor de: " + total);
    }

    @Override
    boolean decidirEntrega() {
        return false;
    }

    @Override
    void realizarEntrega() {
        // Nenhuma entrega necessária para pedidos na loja
    }
}
