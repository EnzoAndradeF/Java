package modelo;

public class Funcionario {
    private String nome;
    private double salario;

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public void mostrarDados(){
            System.out.println("Nome: " + nome);
            System.out.println("Salário: " + salario);
    }

    public double calcularBonus(){

        return 0;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }


}
