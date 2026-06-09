package unidade;

public class Teste {
    public static void main(String[] args) {
        Funcioario[] funcionarios = new Funcioario[2];

        funcionarios[0] = new FuncionarioCLT("Enzo", 3000);
        funcionarios[1] = new FuncionarioPJ("Guilherme", 3000);

        for (Funcioario funcioario : funcionarios) {
            funcioario.calcularSalario();
        }
    }
}
