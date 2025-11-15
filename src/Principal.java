import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        Conversor conversor = new Conversor();
        String moedaOrigem = "";
        String moedaDestino = "";
        int opcao = 0;

        String menu = """
                **************************************
                Selecione um tipo de conversão:
                \n1.Dólar Americano -> Real Brasileiro
                2.Real Brasileiro -> Dólar Americano
                3.Peso Argentino -> Real Brasileiro
                4.Real Brasileiro -> Peso Argentino
                5.Peso Argentino -> Dólar Americano
                6.Dólar Americano -> Peso Argentino
                7.Sair
                **************************************
                """;

        while(opcao !=7) {
            System.out.println(menu);
            opcao = leitura.nextInt();

            switch (opcao) {
                case 1 -> {
                    moedaOrigem = "USD";
                    moedaDestino = "BRL";
                }
                case 2 -> {
                    moedaOrigem = "BRL";
                    moedaDestino = "USD";
                }
                case 3 -> {
                    moedaOrigem = "ARS";
                    moedaDestino = "BRL";
                }
                case 4 -> {
                    moedaOrigem = "BRL";
                    moedaDestino = "ARS";
                }

                case 5 -> {
                    moedaOrigem = "ARS";
                    moedaDestino = "USD";
                }
                case 6 -> {
                    moedaOrigem = "USD";
                    moedaDestino = "ARS";
                }

                case 7 -> {
                    System.out.println("Programa encerrado");
                }

                default -> {
                    System.out.println("Opcão Invalida! Tente novamente.");
                    continue;
                }
            }

            if (opcao == 7){
                break;
            }


            System.out.printf("Digite o valor em %s: ", moedaOrigem);

            double valor = leitura.nextDouble();

            try {
                double convertido = conversor.converter(moedaOrigem, moedaDestino, valor);
                System.out.printf("Resultado: %.2f %s = %.2f %s%n",
                        valor, moedaOrigem, convertido, moedaDestino);
            }

            catch (IOException | InterruptedException | NullPointerException | IllegalArgumentException | IllegalStateException e) {
                System.out.println("Erro! Consulte a API ou tente novamente.");
                System.out.println(e.getMessage());
            }
        }
    }


}