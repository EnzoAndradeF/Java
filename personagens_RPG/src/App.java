import Modelo.Arqueiro;
import Modelo.Guerreiro;
import Modelo.Mago;

public class App {
    public static void main(String[] args) {

        // CRINDO OBJETOS
        Guerreiro guerreiro = new Guerreiro("Thorfin", 170, 16);

        Mago mago = new Mago("Merlin", 120, 21);

        Arqueiro arqueiro = new Arqueiro("Legolas", 145, 15);

        // MOSTRAR STATUS
        guerreiro.mostrarStatus();
        System.out.println();

        mago.mostrarStatus();
        System.out.println();

        arqueiro.mostrarStatus();
        System.out.println();

        // ATAQUR NORMAL
        guerreiro.atacar();
        mago.atacar();
        arqueiro.atacar();

        System.out.println();

        // HABILIDADES ESPECIAIS
        guerreiro.usarHabilidade();
        mago.usarHabilidade();
        arqueiro.usarHabilidade();

        System.out.println();

        // SIMULANDO DANO
        guerreiro.receberDano(80);
        mago.receberDano(60);
        arqueiro.receberDano(70);

        guerreiro.mostrarStatus();
        mago.mostrarStatus();
        arqueiro.mostrarStatus();
    }
}
