package ex03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura dos dados do Carro
        Carro carro = new Carro();
        System.out.print("Digite a cor do carro: ");
        carro.cor = scanner.nextLine();
        System.out.print("Digite a marca do carro: ");
        carro.marca = scanner.nextLine();
        System.out.print("Digite o modelo do carro: ");
        carro.modelo = scanner.nextLine();

        // Leitura dos dados da Bicicleta
        Bicicleta bicicleta = new Bicicleta();
        System.out.print("Digite a cor da bicicleta: ");
        bicicleta.cor = scanner.nextLine();

        // Leitura dos dados do Ônibus
        Onibus onibus = new Onibus();
        System.out.print("Digite a quantidade de lugares do ônibus: ");
        onibus.quantidadeDeLugares = scanner.nextInt();
        System.out.print("Digite o ano de fabricação do ônibus: ");
        onibus.anoDeFabricacao = scanner.nextInt();

        // Utilizando o padrão de projeto Visitor para imprimir informações dos veículos
        VeiculoInfoVisitor infoVisitor = new VeiculoInfoVisitor();
        carro.accept(infoVisitor);
        bicicleta.accept(infoVisitor);
        onibus.accept(infoVisitor);

        // Utilizando o padrão de projeto Visitor para enviar mensagens aos donos dos veículos
        VeiculoMensagemVisitor mensagemVisitor = new VeiculoMensagemVisitor();
        carro.accept(mensagemVisitor);
        bicicleta.accept(mensagemVisitor);
        onibus.accept(mensagemVisitor);
    }
}
