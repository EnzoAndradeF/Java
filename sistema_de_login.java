import java.util.Scanner;

public class sistema_de_login {
    public static void main(String[] args){
        int contador = 0;
        var usuario = "admin";
        var senha = 1234;

        Scanner entrada = new Scanner(System.in);

        while (contador <=3) {

            System.out.println("Digite o usuário:");
            String inputUsuario = entrada.nextLine();

            System.out.println("Digite a senha:");
            int inputSenha = entrada.nextInt();

            entrada.nextLine();

            if (inputUsuario.equals(usuario) && inputSenha == senha) {

                System.out.println("Login realizado com sucesso");
                break;

            } else {

                contador++;

                System.out.println("Login ou senha incorreta");
                System.out.println("Tentativas restantes: " + (3 - contador));
                
            }
        }

        if (contador == 3) {
            System.out.println("Usuário bloqueado por exceso de tentativas");
        }

        entrada.close();

    }
}
