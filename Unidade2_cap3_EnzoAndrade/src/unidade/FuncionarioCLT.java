package unidade;

public class FuncionarioCLT extends Funcioario {

    public FuncionarioCLT(String nome, double salarioBruto) {
        super(nome, salarioBruto);
    }

    @Override
    public double calcularSalario() {
        double salarioCLT = salarioBruto * 0.85;
        System.out.println("Salário: " + salarioCLT);
        return salarioCLT;
    }

}
