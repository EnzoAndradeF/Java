package exercicio1;

public class Main {
    public static void main(String[] args) {

        CaixaGenerica<Carrinho> caixaDeCarrinhos = new CaixaGenerica<>();
        caixaDeCarrinhos.guardar(new Carrinho("Hot Wheels"));

        CaixaGenerica<Boneca> caixaDeBonecas = new CaixaGenerica<>();
        caixaDeBonecas.guardar(new Boneca("Barbie"));

        Carrinho carrinho = caixaDeCarrinhos.pegar();
        Boneca boneca = caixaDeBonecas.pegar();

        System.out.println(carrinho.getModelo());
        System.out.println(boneca.getNome());
    }
}
