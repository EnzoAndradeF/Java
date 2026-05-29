import java.util.ArrayList;

public class Biblioteca {

    ArrayList<Livro> livros;

    public Biblioteca(){
        livros = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro){
        livros.add(livro);

        System.out.println("Livro adicionado");
    }
    
    public void listarLivros(){
        for ( Livro livros : livros){
            livros.mostrarDados();
            System.out.println("==============");
        }
    }

    public Livro buscarLivros(String titulo){

    for (Livro livro : livros){

        if (livro.getTitulo().equalsIgnoreCase(titulo)) {

            return livro;

        }

    }

    return null;

}
}
