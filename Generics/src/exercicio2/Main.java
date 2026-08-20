package exercicio2;

public class Main {
    public static void main(String[] args) {
        Cesto<PeixeComivel> cestoDePeixeComivel = new Cesto<>();
        cestoDePeixeComivel.guardar(new PeixeComivel("Tambaqui", "Grande"));
        cestoDePeixeComivel.checarCesto();

        Cesto<PeixeVenenoso> cestoDePeixeVenonoso = new Cesto<>();
        cestoDePeixeVenonoso.guardar(new PeixeVenenoso("Peixe leão", true));
        cestoDePeixeVenonoso.checarCesto();


    }
}
