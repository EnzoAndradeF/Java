package modelo;

public class Gerente extends Funcionario{
    private double bonusGerente = 0.2;

    public double getBonusGerente() {
        return bonusGerente;
    }

    @Override
    public double calcularBonus() {
        double salarioAtual = getSalario();
        double bonus = salarioAtual * bonusGerente;

        System.out.println(bonus);

        return bonus;
    }

}
