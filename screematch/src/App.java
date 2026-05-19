public class App {
    public static void main(String[] args) throws Exception {

        Filme filme1 = new Filme();
        filme1.setNome("O poderoso chefão");
        filme1.setAnoDeLancamento(1970);
        filme1.setDuracaoEmMinutos(180);

        filme1.exibirFichaTecnica();
        filme1.avaliar(8);
        filme1.avaliar(5);
        filme1.avaliar(10);

        System.out.println(filme1.getTotalDeAvaliacao());
        System.out.println(filme1.pegarMedia());

    }
}
