public class Produto {
    String nome;
    private double preco;
    private int quantidadeEstoque;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public static void main(String[] args) {
        Produto produto1 = new Produto();

        produto1.setNome("Teclado");
        produto1.setPreco(15.99);
        produto1.setQuantidadeEstoque(5);

    }

}
