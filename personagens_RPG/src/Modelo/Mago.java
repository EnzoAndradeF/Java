package Modelo;

public class Mago extends Personagem{

    public Mago(String nome, int vida, int ataque) {
        super(nome, vida, ataque);
    }

    @Override
    public void usarHabilidade() {
        double dano = getAtaque() * 3;

        System.out.println(getNome() + " lançou BOLA DE FODO causando " + dano + " de dano");

    }
    
}
