public class Engenheiro extends Funcionario {
    int crea;

    public Engenheiro(String nome, double salario, int crea) {
        super(nome, salario);
        this.crea = crea;
    }

    public void apresentarCrea() {
        System.out.println("Engenheiro: " + nome + " // CREA: " + crea);
    }
}
