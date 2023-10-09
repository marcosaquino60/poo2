package ex02;

public class Main {
    /*  A diferença chave entre o padrão de projeto Template e o padrão Decorator
        é que o padrão Template define a estrutura geral de um algoritmo em uma classe base,
        permitindo que as subclasses redefinam certos passos do algoritmo,
        enquanto o padrão Decorator permite adicionar responsabilidades adicionais a objetos individuais
        de forma dinâmica, sem alterar a estrutura dos objetos.
    */
    public static void main(String[] args) {


        // Pedido online
        ProcessadorPedidoTemplate pedidoOnline = new PedidoOnline();
        pedidoOnline.processarPedido(2, 50.0, "Cartão de Crédito");

        // Pedido na loja
        ProcessadorPedidoTemplate pedidoNaLoja = new PedidoNaLoja();
        pedidoNaLoja.processarPedido(3, 30.0, "Dinheiro");

        // Pedido com pagamento via criptomoedas
        ProcessadorPedidoTemplate pedidoComCriptomoedas = new PedidoComCriptomoedas();
        pedidoComCriptomoedas.processarPedido(1, 100.0, "Bitcoin");
    }
}
