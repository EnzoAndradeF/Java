import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Catalogo catalogo = new Catalogo();

        System.out.println("Quantos produtos deseja cadastrar?");
        int quantidadeProdutos = scanner.nextInt();
        scanner.nextLine();

        int contador = 1;
        while (contador <= quantidadeProdutos) {

            System.out.println("Digite o nome do produto: ");
            String nomeProduto = scanner.nextLine();

            System.out.println("Digite o preço do produto: ");
            double precoProduto = scanner.nextDouble();
            scanner.nextLine();

            System.out.println("Digite a quantidade do produto");
            int quantidadeProduto = scanner.nextInt();
            scanner.nextLine();

            System.out.println("==========");

            Produto novoProduto = new Produto(nomeProduto,
                             precoProduto, quantidadeProduto);
            
            catalogo.adicionarLista(novoProduto);
            contador++;
        }

        catalogo.exibirCatalogo();

        
    }
}
