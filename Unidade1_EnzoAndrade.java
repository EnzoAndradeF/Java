import java.util.Scanner;

public class Unidade1_EnzoAndrade {
    public static void main(String[] args) {
        /*
         * 1. Escreva um programa Java que use os operadores lógicos para verificar se
         * um
         * número está entre 10 e 20 (inclusive). Use int numero = 15;.
         */
        System.out.println("Exercício 1:");

        int numero = 15;
        if (numero > 10 && numero < 20) {
            System.out.println(numero + " está entre 10 e 20");
        } else {
            System.out.println(numero + " não está entre 10 e 20");
        }

        /*
         * 2. Escreva um programa que mostre na tela os tipos de dados primitivos em
         * Java
         * com seus valores atribuídos.
         */
        System.out.println("==========");
        System.out.println("Exercício 2:");

        byte meuByte = 127;
        short meuShort = 32000;
        int meuInt = 1000000;
        long meuLong = 10000000000L;

        float meuFloat = 5.75f;
        double meuDouble = 19.99;

        char meuChar = 'A';
        boolean meuBoolean = true;

        System.out.println("Valor do byte: " + meuByte);
        System.out.println("Valor do short: " + meuShort);
        System.out.println("Valor do int: " + meuInt);
        System.out.println("Valor do long: " + meuLong);
        System.out.println("Valor do float: " + meuFloat);
        System.out.println("Valor do double: " + meuDouble);
        System.out.println("Valor do char: " + meuChar);
        System.out.println("Valor do boolean: " + meuBoolean);

        /*
         * 3. Implemente um programa que exiba um menu com 3 opções:
         * 1 - Somar dois números
         * 2 - Subtrair dois números
         * 3 - Sair
         * O programa deve usar switch para executar a operação escolhida.
         */
        System.out.println("==========");
        System.out.println("Exercício 3:");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro:");
        int num1 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite outro número inteiro");
        int num2 = scanner.nextInt();
        scanner.nextLine();

        int numFinal;

        System.out.println("Digite '1' para somar os dois números");
        System.out.println("Digite '2' para subtrair os dois números");
        System.out.println("Digite '3' para sair");

        int opcap = scanner.nextInt();
        scanner.nextLine();
        switch (opcap) {
            case 1:
                numFinal = num1 + num2;
                System.out.println(num1 + " + " + num2 + " = " + numFinal);
                break;
            case 2:
                numFinal = num1 - num2;
                System.out.println(num1 + " - " + num2 + " = " + numFinal);
                break;
            case 3:
                System.out.println("Saindo...");
                break;
            default:
                System.out.println("Comando não encontrado");
                break;
        }

        /*
         * 4. Crie um programa que leia um número inteiro do usuário e imprima a tabuada
         * desse número (de 1 a 10), usando um laço for.
         */
        System.out.println("==========");
        System.out.println("Exercício 4:");

        System.out.println("Digite um número:");
        int numTabuada = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1; i < 11; i++) {
            System.out.println(numTabuada + " * " + i + " = " + numTabuada * i);
        }

        /*
         * 5. Faça um programa que leia uma string e substitua todas as ocorrências da
         * letra "e"
         * por "*".
         */
        System.out.println("==========");
        System.out.println("Exercício 5:");

        System.out.println("Digite uma palavra:");
        String palavraOriginal = scanner.nextLine();

        String palavraAlterada = palavraOriginal.replace("e", "*");

        System.out.println("Palavra modificada: " + palavraAlterada);

        /*
         * 6. Crie um array com os seguintes nomes: "Maria", "João", "Carlos", "Ana",
         * "Beatriz". Em
         * seguida, peça um nome ao usuário e diga se ele está ou não no array.
         */
        System.out.println("==========");
        System.out.println("Exercício 6:");

        String[] nomes = { "Maria", "João", "Carlos", "Ana", "Beatriz" };

        System.out.print("Digite um nome para buscar na lista: ");
        String nomeBuscado = scanner.nextLine().trim();

        boolean encontrado = false;

        for (String nome : nomes) {

            if (nome.equalsIgnoreCase(nomeBuscado)) {
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            System.out.println("O nome '" + nomeBuscado + "' está no array!");
        } else {
            System.out.println("O nome '" + nomeBuscado + "' NÃO está no array.");
        }

        /*
         * 7. Crie um programa que leia um número inteiro não-negativo e calcule seu
         * fatorial
         * utilizando o laço for.
         * Exemplo: Entrada = 5 Saída = 120
         */
        System.out.println("==========");
        System.out.println("Exercício 7:");

        System.out.println("Digite um número e vejo o resultado fatorial");
        int numFatorial = scanner.nextInt();
        scanner.nextLine();

        if (numFatorial > 0) {
            int numFatorialTotal = 1;
            for (int i = 1; i <= numFatorial; i++) {
                numFatorialTotal *= i;
            }
            System.out.println("Resultado fatorado: " + numFatorialTotal);
        } else {
            System.out.println("Digite um número positivo");
        }

        /*
         * 8. Crie um programa que exiba um menu repetitivo com as opções:
         * 1 - Dizer "Olá"
         * 2 - Dizer "Tchau"
         * 3 - Encerrar
         * O menu deve continuar aparecendo até que o usuário escolha a opção 3.
         */

        System.out.println("==========");
        System.out.println("Exercício 8:");

        int opcao2;

        do {
            System.out.println("Digite '1' para dizer 'Olá");
            System.out.println("Digite '2' para dizer 'Tchau");
            System.out.println("Digite '3' para encerrar");

            opcao2 = scanner.nextInt();
            scanner.nextLine();

            switch (opcao2) {
                case 1:
                    System.out.println("Olá");
                    break;
                case 2:
                    System.out.println("Tchau");
                    break;
                case 3:
                    System.out.println("Encerrando");
                    break;
                default:
                    System.out.println("Comando não reconhecido");
                    break;
            }
        } while (opcao2 != 3);

        /*
         * 9. Faça um programa que leia o nome completo de uma pessoa e mostre o
         * primeiro
         * nome e o último nome separadamente
         */

        System.out.println("==========");
        System.out.println("Exercício 9:");

        System.out.print("Digite seu nome completo: ");

        String nomeCompleto = scanner.nextLine().trim();

        String[] partes = nomeCompleto.split(" ");

        if (partes.length > 0) {
            String primeiroNome = partes[0];
            String ultimoNome = partes[partes.length - 1];

            System.out.println("Primeiro nome: " + primeiroNome);
            System.out.println("Último nome: " + ultimoNome);
        } else {
            System.out.println("Nome inválido.");
        }

        /*
         * 10. Escreva um programa que leia uma frase e conte quantas palavras ela
         * possui
         * (considere as palavras separadas por espaços).
         * 
         */

        System.out.println("==========");
        System.out.println("Exercício 10:");

        System.out.print("Digite uma frase: ");
        String frase = scanner.nextLine().trim();

        if (frase.isEmpty()) {
            System.out.println("A frase possui 0 palavras.");
        } else {

            String[] palavras = frase.split("\\s+");

            System.out.println("A frase possui " + palavras.length + " palavras.");
        }
    }

}
