package unidade;

public class FuncionarioPJ extends Funcioario {

    public FuncionarioPJ(String nome, double salarioBruto) {
        super(nome, salarioBruto);
    }

    @Override
    public double calcularSalario() {
        double salarioPJ = salarioBruto * 0.95;
        System.out.println("Salário: " + salarioPJ);
        return salarioPJ;
    }

}
