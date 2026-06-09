public class Funcionario extends Pessoa {
    double salario;

    public Funcionario(String nome, double salario) {
        super(nome);
        this.salario = salario;
    }

    public void receberSalario() {
        System.out.println(nome + " recebeu o salário de R$ " + salario);
    }
}
