package ex03;

public class VeiculoMensagemVisitor implements Visitor {
    @Override
    public void visit(Carro carro) {
        System.out.println("Enviando mensagem para o dono do carro: Favor atualizar dados do IPVA.");
    }

    @Override
    public void visit(Bicicleta bicicleta) {
        System.out.println("Enviando mensagem para o dono da bicicleta: Comemore no parque o dia do ciclismo.");
    }

    @Override
    public void visit(Onibus onibus) {
        System.out.println("Enviando mensagem para o dono do ônibus: Atenção para atualização das licenças.");
    }
}
