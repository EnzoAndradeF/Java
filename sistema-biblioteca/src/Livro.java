public class Livro {

    private String titulo;
    private String autor;
    private int ano;
    private boolean disponivel;


    public Livro(String titulo, String autor, int ano) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.disponivel = true;
    }

    public String getTitulo() {
        return titulo;
    }


    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    public String getAutor() {
        return autor;
    }


    public void setAutor(String autor) {
        this.autor = autor;
    }


    public int getAno() {
        return ano;
    }


    public void setAno(int ano) {
        this.ano = ano;
    }


    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public void mostrarDados(){
        System.out.println("Título do livro: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Lançamento: " + ano);
        System.out.println("Disponível: " + disponivel);
    }

    public void emprestar(){

        if (disponivel) {
            disponivel = false;
            System.out.println("Livro '" + titulo + "' emprestado");
        } else{
            System.out.println("Livro '" + titulo + "' indisponível");
        }
    }

    public void devolver(){

        if (!disponivel) {
            disponivel = true;
            System.out.println("Livro '" + titulo + "' devolvido");
        } else{
            System.out.println("Livro '" + titulo + "' já foi devolvido");
        }
    }

    
    
}
