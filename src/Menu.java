import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Menu {
    private Map<Integer, String> opcoes;

    public Menu() {
        this.opcoes = new HashMap<>();
        opcoes.put(1, "Real para Dólar");
        opcoes.put(2, "Dólar para Real");
        opcoes.put(3, "Real para Euro");
        opcoes.put(4, "Euro para Real");
        opcoes.put(5, "Real para Iene");
        opcoes.put(6, "Iene para Real");
        opcoes.put(7, "Sair");
    }

    public void mostrarOpcoes() {
        System.out.println("Escolha uma opção:");
        for (Map.Entry<Integer, String> entry : opcoes.entrySet()) {
            System.out.println(entry.getKey() + ". " + entry.getValue());
        }
    }

    public int lerOpcao() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public void executarOpcao(int opcao, APIReader apiReader) throws IOException, InterruptedException {
        switch (opcao) {
            case 1:
                System.out.println("Digite o valor em Reais:");
                double valorRealParaDolar = new Scanner(System.in).nextDouble();
                double valorConvertidoParaDolar = Conversor.converterRealParaDolar(apiReader, valorRealParaDolar);
                System.out.println("Valor em Dólar: " + valorConvertidoParaDolar);
                break;
            case 2:
                System.out.println("Digite o valor em Dólares:");
                double valorDolarParaReal = new Scanner(System.in).nextDouble();
                double valorConvertidoParaReal = Conversor.converterDolarParaReal(apiReader, valorDolarParaReal);
                System.out.println("Valor em Reais: " + valorConvertidoParaReal);
                break;
            case 3:
                System.out.println("Digite o valor em Reais:");
                double valorRealParaEuro = new Scanner(System.in).nextDouble();
                double valorConvertidoParaEuro = Conversor.converterRealParaEuro(apiReader, valorRealParaEuro);
                System.out.println("Valor em Euro: " + valorConvertidoParaEuro);
                break;
            case 4:
                System.out.println("Digite o valor em Euro:");
                double valorEuroParaReal = new Scanner(System.in).nextDouble();
                double valorConvertidoParaRealEuro = Conversor.converterEuroParaReal(apiReader, valorEuroParaReal);
                System.out.println("Valor em Reais: " + valorConvertidoParaRealEuro);
                break;
            case 5:
                System.out.println("Digite o valor em Reais:");
                double valorRealParaIene = new Scanner(System.in).nextDouble();
                double valorConvertidoParaIene = Conversor.converterRealParaIene(apiReader, valorRealParaIene);
                System.out.println("Valor em Iene: " + valorConvertidoParaIene);
                break;
            case 6:
                System.out.println("Digite o valor em Iene:");
                double valorIeneParaReal = new Scanner(System.in).nextDouble();
                double valorConvertidoParaRealIene = Conversor.converterIeneParaReal(apiReader, valorIeneParaReal);
                System.out.println("Valor em Reais: " + valorConvertidoParaRealIene);
                break;
            case 7:
                System.out.println("Saindo...");
                System.exit(0);
            default:
                System.out.println("Opção inválida. Por favor, escolha novamente.");
        }
    }
}
