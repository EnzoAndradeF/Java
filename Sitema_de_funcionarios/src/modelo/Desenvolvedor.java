package modelo;

public class Desenvolvedor extends Funcionario{
    private double bonusDev = 0.1;

    public double getBonusDev() {
        return bonusDev;
    }

    @Override
    public double calcularBonus() {
        double salarioAtual = getSalario();

        double bonus = salarioAtual * bonusDev;
        System.out.println(bonus);
        return bonus;
    }

    
}
