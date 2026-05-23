package Modelo;

public class Personagem {

    // ENCAPSULAMENTO
    private String nome;
    private int vida;
    private int ataque;

    // CONSTRUTOR
    //CRIAR OBJETOS JÁ COM VALORES
    public Personagem(String nome, int vida, int ataque) {
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
    }

    // GETTERS E SETTERS
    public String getNome() {
        return nome;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getAtaque() {
        return ataque;
    }

    // MÉTODO COMUM PARA TODOS OS PERSONAGENS
    public void mostrarStatus(){
        System.out.println("===== STATUS =====");
        System.out.println("Nome: " + nome);
        System.out.println("Vida: " + vida);
        System.out.println("Ataque: " + ataque);
    }

    // ATAQUE NORMAL
    public void atacar(){
        System.out.println(nome + " atacou causando " + ataque + " de dano");
    }

    // MÉTODO GENÉRICO
    // CLASSES FILHAS VÃO SOBREESCREVER
    public void usarHabilidade(){
        System.out.println(nome + " usou uma habilidade");
    }

    // RECEBER DANO
    public void receberDano(int dano){
        vida -=dano;

        if (vida <0) {
            vida = 0;
        }

        System.out.println(nome + " recebeu " + dano + " de dano");
    }
      

    
}
