package capitulo;

public class App {
    public static void main(String[] args) {
        Veiculo meuCarro = new Carro();
        Veiculo minhaBicicleta = new Bicicleta();

        meuCarro.mover();
        minhaBicicleta.mover();
    }
}
