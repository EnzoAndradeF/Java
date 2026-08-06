import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import model.Veiculo;
import service.GerenciadorAutoCar;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        GerenciadorAutoCar gerenciador = new GerenciadorAutoCar(new ArrayList<>());


        int opcao = -1;

        do {
            try {
                System.out.println("===== Sistema AutoCar =====");
                System.out.println("");
                System.out.println("Digite '1' para cadastrar veículo");
                System.out.println("Digite '2' para exibir estoque");
                System.out.println("Digite '3' para vender veículo");
                System.out.println("Digite '0' para encerrar a aplicação");
                System.out.println(""); 

                opcao = scanner.nextInt();
                scanner.nextLine();

                switch (opcao) {
                    case 1:
                        try {
                            System.out.println("\nDigite o tipo do veículo (Carro / moto): ");
                            String tipoVeiculo = scanner.nextLine();

                            System.out.println("\nDigite o modelo do veículo: ");
                            String modeloVeiculo = scanner.nextLine();

                            System.out.println("\nDigite o ano do veículo: ");
                            int anoVeiculo = scanner.nextInt();
                            scanner.nextLine();

                            System.out.println("\nDigite a kilometragem do veículo: ");
                            double kmVeiculo = scanner.nextDouble();
                            scanner.nextLine();

                            Veiculo novoVeiculo = new Veiculo(tipoVeiculo, modeloVeiculo, anoVeiculo, kmVeiculo);

                            gerenciador.cadastrarVeiculo(novoVeiculo);
                            
                        } catch (IllegalArgumentException e){
                            System.out.println("Erro de validação: " + e.getMessage());
                        }
                        
                        break;
                    
                    case 2:
                        gerenciador.exibirEstoque();
                        
                        break;
                    
                    case 3:
                        System.out.println("\nDigite o Id do veiculo que sera vendido: ");
                        int idVeiculo = scanner.nextInt();

                        gerenciador.venderVeiculo(idVeiculo);
                        break;
                    
                    case 0:
                        System.out.println("Encerrando...");
                        break;
                
                    default:
                        System.out.println("Comando inexistente");
                        break;
                }
            } catch (InputMismatchException e){
                System.out.println("Erro de entrada: Você digitou um texto onde um número era esperado");
                scanner.nextLine();
            }
        } while (opcao != 0);

        scanner.close();
    }
}
