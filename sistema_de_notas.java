import java.util.Scanner;

public class sistema_de_notas {
    public static void main(String[] args) {

        String aluno = "";
        double nota1;
        double nota2;
        double nota3;
        double media;
        String status;

        int quantidadeAlunos = 0;
        double somaMedia = 0;
        double maiorMedia = 0;
        double menorMedia = 0;
        String alunoMaiorMedia = "";
        String alunoMenorMedia = "";
        double mediaGeral;
        int quantidadeAprovados =0;

        Scanner scanner = new Scanner(System.in);

        while (!aluno.equals("FIM")) {
            
            System.out.println("Digite o nome do aluno ou 'FIM' para finalizar o sistema");
            aluno = scanner.nextLine(); 
            
            if (aluno.equals("FIM")) {
                break;
            }

            System.out.println("Digite a nota 1");
            nota1 = scanner.nextDouble();
            scanner.nextLine();

            System.out.println("Digite a nota 2");
            nota2 = scanner.nextDouble();
            scanner.nextLine();

            System.out.println("Digite a nota 3");
            nota3 = scanner.nextDouble();
            scanner.nextLine();

            media = (nota1 + nota2 + nota3)/3;

            if (media >= 6) {

                status = "Aprovado";
                quantidadeAprovados++;

            } else if (media >=3 && media <6) {
                
                status = "Recuperação";

            } else {
                
                status = "Reprovado";

            }

            if (media > maiorMedia) {

                maiorMedia = media;
                alunoMaiorMedia = aluno;

            }

            if (media < menorMedia) {
                
                menorMedia = media;
                alunoMenorMedia = aluno;

            }

            quantidadeAlunos++;
            somaMedia += media;
            
        }

        mediaGeral = somaMedia / quantidadeAlunos;

        System.out.println("Maior média: " + maiorMedia + "\nAluno: " + alunoMaiorMedia );
        System.out.println("Menor média: " + menorMedia + "\nAluno: " + alunoMenorMedia);
        System.out.println("Média geral da turma: " + mediaGeral);
        System.out.println("Quantidade de aprovados: " + quantidadeAprovados);


    }
    
}
