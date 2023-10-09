package ex02;

abstract class ProcessadorPedidoTemplate {
    final void processarPedido(int quantidadeItens, double valorItem, String formaPagamento) {
        double total = calcularTotal(quantidadeItens, valorItem);
        processarPagamento(total, formaPagamento);
        if (decidirEntrega()) {
            realizarEntrega();
        }
    }

    abstract double calcularTotal(int quantidadeItens, double valorItem);

    abstract void processarPagamento(double total, String formaPagamento);

    abstract boolean decidirEntrega();

    abstract void realizarEntrega();
}