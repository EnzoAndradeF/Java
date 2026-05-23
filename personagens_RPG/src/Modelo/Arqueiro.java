package Modelo;

public class Arqueiro extends Personagem{

    public Arqueiro(String nome, int vida, int ataque) {
        super(nome, vida, ataque);
    }

    @Override
    public void usarHabilidade() {
        double dano = getAtaque() * 1.5;

        System.out.println(getNome() + " usou FECHA DUPLA causando " + dano + " de dano");
    }
    
}
