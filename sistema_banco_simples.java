import java.util.Scanner;

public class sistema_banco_simples {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        double saldo = 1000;
        double ultimoDeposito = 0;
        double ultimoSaque = 0;
        int opcao;

        do {
            System.out.println("===== Banco Simples =====");
            System.out.println("Digite '1' para depositar");
            System.out.println("Digite '2' para sacar");
            System.out.println("Digite '3' para ver saldo");
            System.out.println("Digite '4' para ver o histórico");
            System.out.println("Digite '5' para sair");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:

                    System.out.println("Digite o valor do depósito: ");
                    double deposito = scanner.nextDouble();
                    scanner.nextLine();

                    saldo += deposito;
                    ultimoDeposito = deposito;

                    System.out.println("Depósito realizado com sucesso!");

                    break;
                case 2:

                    System.out.println("Digite o valor do saque: ");
                    double saque = scanner.nextDouble();
                    scanner.nextLine();

                    if (saque <= saldo) {
                        saldo -= saque;
                        ultimoSaque = saque;
                        System.out.println("Saque realizado com sucesso!");
                        
                    } else {
                        System.out.println("Saldo insuficiente");

                    }
                    
                    break;
                case 3:
                    System.out.println("Saldo da conta: " + saldo);
                    
                    break;
                case 4:
                    System.out.println("Ultimo depósito: " + ultimoDeposito + "\nUltimo saque: " + ultimoSaque);    

                    break;
                case 5:
                    System.out.println("Saindo do sistema");    

                    break;
            
                default:
                    System.out.println("Comando inválido");
            }
        } while (opcao != 5);
    }
}