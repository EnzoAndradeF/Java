import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("=== Banco Simples ===");

        String nomeConta = "Enzo Andrade Ferreira";
        String tipoConta = "Corrente";
        double saldo = 1000.0; 

        System.out.println("Nome: " +  nomeConta);
        System.out.println("Tipo da conta: " + tipoConta);
        System.out.println("Saldo: R$ " + saldo);

        Scanner scanner = new Scanner(System.in);

        int opcao;

        do{

            System.out.println("=== Menu de opções ===");
            System.out.println("Digite '1' para consultar saldo");
            System.out.println("Digite '2' para depositar");
            System.out.println("Digite '3' para sacar");
            System.out.println("Digite '0' para sair");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Saldo de " + nomeConta + ": R$ " + saldo);
                    break;
                case 2:
                    System.out.println("Digite o valor que queira depositar: ");
                    double deposito = scanner.nextDouble();
                    scanner.nextLine();

                    saldo = saldo + deposito;
                    
                    System.out.println("Valor de: R$ " + deposito + " depositado");
                    break;
                case 3:
                    System.out.println("Digite o valor que queira sacar:");
                    double saque = scanner.nextDouble();
                    scanner.nextLine();

                    if (saque > saldo){
                        System.out.println("Saldo insuficiente!");
                        break; 
                    } else {
                        saldo = saldo - saque;
                        System.out.println("Saque realizado com sucesso!");
                    }
                    break;
                case 0:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Comando não reconhecido");
                    break;
            }
        } while (opcao != 0);    
        

    }
}
