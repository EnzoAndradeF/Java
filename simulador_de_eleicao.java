import java.util.Scanner;

public class simulador_de_eleicao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String candidato1 = "Lula";
        int votoCandidato1 = 0;

        String candidato2 = "Flavio";
        int votoCandidato2 = 0;

        String candidato3 = "Renan";
        int votoCandidato3 = 0;

        int votoBranco = 0;
        int votoNulo = 0;
        int totalVotos =0;
        int totalVotosValidos = 0;

        int opcao;

        do{
                    
            System.out.println("===== Eleição =====");
            System.out.println("Digite 0 para encerrar votação");
            System.out.println("Digite '13' para votar no Lula");
            System.out.println("Digite '22' para votar no Flávio");
            System.out.println("Digite '15' para votar no Renan");
            System.out.println("Digite '1' para votar em branco");
            System.out.println("Digite '2' para anular o seu voto");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 0:
                    System.out.println("Encerrando votação");
                    break;
                case 13:
                    System.out.println("Você votou no " + candidato1);
                    votoCandidato1++;
                    totalVotos++;
                    totalVotosValidos++;
                    break;
                case 22:
                    System.out.println("Você votou no " + candidato2);
                    votoCandidato2++;
                    totalVotos++;
                    totalVotosValidos++;
                    break;
                case 15:
                    System.out.println("Você votou no " + candidato3);
                    votoCandidato3++;
                    totalVotos++;
                    totalVotosValidos++;
                    break;
                case 1:
                    System.out.println("Você votou em branco");
                    votoBranco++;
                    totalVotos++;
                    break;
                case 2:
                    System.out.println("Você votou nulo");
                    votoNulo++;
                    totalVotos++;
                    break;
                default:
                    System.out.println("Comando não reconhecido");
                    break;
            }
        } while (opcao != 0);

        if (votoCandidato1 > votoCandidato2 && votoCandidato1 > votoCandidato3) {

            System.out.println("O vencedor da eleição foi: " + candidato1);
            System.out.println("Porcentagem dos votos: " + ((double) votoCandidato1 / totalVotos) * 100 + "%");

        } else if (votoCandidato2 > votoCandidato1 && votoCandidato2 > votoCandidato3) {

            System.out.println("O vencedor da eleição foi: " + candidato2);
            System.out.println("Porcentagem dos votos: " + ((double) votoCandidato2 / totalVotos) * 100 + "%");

        } else {
            System.out.println("O vencedor da eleição foi: " + candidato3);
            System.out.println("Porcentagem dos votos: " + ((double) votoCandidato3 / totalVotos) * 100 + "%");
        }

        System.out.println("Total de votos: " + totalVotos);
        System.out.println("Total de votos válidos: " + totalVotosValidos);
        System.out.println("Total de votos em branco: " + votoBranco);
        System.out.println("Total de votos nulos: " + votoNulo);

        scanner.close();
    }
}
