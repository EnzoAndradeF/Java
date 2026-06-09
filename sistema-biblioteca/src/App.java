import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        Biblioteca biblioteca = new Biblioteca();

        System.out.println("Sistema da Biblioteca");

        int opcao;

        do{

        System.out.println("====================");

        System.out.println("Digite '1' para cadastrar livro");
        System.out.println("Digite '2' para listar livros");
        System.out.println("Digite '3' para buscar livro");
        System.out.println("Digite '4' para emprestar livro");
        System.out.println("Digite '5' para devolver livros");
        System.out.println("Digite '0' encerrar");

        opcao = scanner.nextInt();
        scanner.nextLine();

        switch (opcao) {
            case 1:

                System.out.println("Digite o título do livro: ");
                String titulo = scanner.nextLine();

                System.out.println("Digite o nome do autor: ");
                String autor = scanner.nextLine();

                System.out.println("Digite o ano de lançamento do livro");
                int ano = scanner.nextInt();
                scanner.nextLine();

                Livro novoLivro = new Livro(titulo, autor, ano);
                biblioteca.adicionarLivro(novoLivro);
                break;

            case 2: 
                biblioteca.listarLivros();
                break;
            
            case 3:
                System.out.println("Digite o título do livro: ");
                String tituloLivro = scanner.nextLine();

                biblioteca.buscarLivros(tituloLivro);
                break;
            
            case 4:

                System.out.println("Digite o título do livro:");

                String tituloEmprestar = scanner.nextLine();

                
                Livro livroEmprestar =
                        biblioteca.buscarLivros(tituloEmprestar);

                
                if (livroEmprestar != null) {

                    
                    livroEmprestar.emprestar();

                } else {

                    System.out.println("Livro não encontrado");

                }

                break;
            
            case 5:

                System.out.println("Digite o título do livro:");

                String tituloDevolver = scanner.nextLine();

                Livro livroDevolver =
                        biblioteca.buscarLivros(tituloDevolver);

                if (livroDevolver != null) {

                    livroDevolver.devolver();

                } else {

                    System.out.println("Livro não encontrado");

                }

                break;
            
            case 0:
                System.out.println("Encerrando");
                break;
                
            default:
                System.out.println("Comando inválido");
                break;
        }


        }while (opcao != 0);

        scanner.close();


    }
}
