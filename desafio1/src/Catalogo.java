import java.util.ArrayList;

public class Catalogo {
    ArrayList<Produto> produtos;

    public Catalogo() {
        produtos = new ArrayList<>();
    }
    
    public void exibirCatalogo(){
        for (Produto produto : produtos) {
            produto.exibirProduto();
            System.out.println("==========");
        }
    }

    public void adicionarLista(Produto produto){
        produtos.add(produto);
    }
}
