import modelo.Desenvolvedor;
import modelo.Gerente;

public class App {
    public static void main(String[] args){
        System.out.println("===== Sistema de Funcionários =====");

        Gerente gerente = new Gerente();

        gerente.setNome("Enzo");
        gerente.setSalario(5501);

        Desenvolvedor dev = new Desenvolvedor();

        dev.setNome("Igor");
        dev.setSalario(3000);

        gerente.mostrarDados();
        gerente.calcularBonus();

        dev.mostrarDados();
        dev.calcularBonus();


    }
}
