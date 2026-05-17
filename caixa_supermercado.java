import java.util.Scanner;

public class caixa_supermercado {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        String nome;
        double preco;
        int quantidade;

        double totalcompra = 0;
        int totalItens = 0;

        double maiorpreco = 0;
        String produtoMaisCaro = "";

        double somaPreco = 0;
        int quantidadeProdutos = 0;

        do {
            System.out.println("Digite o nome do produto ou 'FIM' para encerrar a operação");
            nome = scanner.nextLine();

            if (nome.equals("FIM")) {
                break;
            }

            System.out.println("Digite o preco do produto");
            preco = scanner.nextDouble();
            scanner.nextLine();

            if (preco > maiorpreco) {
                maiorpreco = preco;
                produtoMaisCaro = nome;
            }

            System.out.println("Digite a quantidade");
            quantidade = scanner.nextInt();
            scanner.nextLine();

            totalcompra += preco * quantidade;
            totalItens += quantidade;
            somaPreco += preco;
            quantidadeProdutos++;

        } while (!nome.equals("FIM"));

        double media = somaPreco / quantidadeProdutos;

        System.out.println("Valor total da compra: " + totalcompra);
        System.out.println("Produto mais caro: " + produtoMaisCaro);
        System.out.println("Quantidade total de itens: " + totalItens);
        System.out.printf("Média de preços dos produtos: %2.f%n", media);

        scanner.close();

    }
}
